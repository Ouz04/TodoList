package todolist.TP_Tache.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import todolist.TP_Tache.dao.TacheRepository;
import todolist.TP_Tache.metier.Tache;

@CrossOrigin(origins = "*", allowedHeaders = "*" )
@RestController
public class TacheRestServices {
	@Autowired
	private TacheRepository tacheRepository;
	
	@GetMapping(value="/listTaches")
	public List<Tache> listTaches(){
		return tacheRepository.findAll();
	}
	/*public Page<Tache> byTitre(@Param ("mc") String mc, @PathVariable int pageNo, 
            @PathVariable int pageSize){
		
		return tacheRepository.findByCategorieContains(mc, pageable)	}
		
	*/
	@GetMapping(value="/listTaches/{id}")
	public Tache listTaches(@PathVariable(name="id") Long id){
		return tacheRepository.findById(id).get();
	}
	
	@PutMapping(value="/listTaches/{id}")
	public Tache update(@PathVariable(name="id") Long id,@RequestBody Tache t){
		t.setTache_id(id);
		
		return tacheRepository.save(t);
		
	}
	
	
	@PostMapping(value="/listTaches/{id}")
	public Tache save(@RequestBody Tache t){
		return tacheRepository.save(t);
	}
	@DeleteMapping(value="/listTaches/{id}")
	public void delete(@PathVariable(name="id") Long id){
	
		 tacheRepository.deleteById(id);;
	}
	
	
		
}



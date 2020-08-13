package todolist.TP_Tache.dao;

import java.awt.print.Pageable;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import todolist.TP_Tache.metier.Tache;



@RepositoryRestResource
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public interface TacheRepository extends JpaRepository<Tache,Long>{
	@RestResource(path = "/byCategorie")
	public List<Tache> findByCategorieContains(@Param("mc") String cat);
	
	//@RestResource(path = "/byCategoriePage")
	//public Page<Tache> findByCategorieContains(@Param("mc") String cat, Pageable pageable);
	
	
}

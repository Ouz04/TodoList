package todolist.TP_Tache;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

import todolist.TP_Tache.dao.TacheRepository;

import todolist.TP_Tache.metier.Tache;


@SpringBootApplication
@ComponentScan(basePackages ="todolist.TP_Tache.metier,todolist.TP_Tache.controller")
@CrossOrigin("*")
public class TpTacheApplication implements CommandLineRunner {
	@Autowired
	private TacheRepository tacheRepository;
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(TpTacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		restConfiguration.exposeIdsFor(Tache.class);
		tacheRepository.save(new Tache(null,"maths","etudes",0, new Date(),new Date()));
		tacheRepository.save(new Tache(null,"maths","etudes",0, new Date(),new Date()));
		tacheRepository.save(new Tache(null,"maths","etudes",0,new Date(),new Date()));
		
		
		
		tacheRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});	
		
	}

}

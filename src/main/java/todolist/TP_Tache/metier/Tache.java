package todolist.TP_Tache.metier;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;






@Entity 
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Tache {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long tache_id;
	
	private String titre;
	
	private String categorie;
	
	
	private Date date;
	
	
	


}



	
	

	
	
	

	


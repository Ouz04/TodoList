package todolist.TP_Tache.metier;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name= "P1", types =Tache.class)
public interface TacheProjection {
	public String getCategorie();
	public Date getDate();

}

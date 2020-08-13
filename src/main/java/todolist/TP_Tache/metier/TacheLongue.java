package todolist.TP_Tache.metier;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.RequiredArgsConstructor;
import lombok.ToString;




@Entity

@Data
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class TacheLongue extends Tache {
	
	private Date datedebut;
	private double pourcentage;
	
	public TacheLongue(Date datedebut, double pourcentage) {
		super();
		this.datedebut = datedebut;
		this.pourcentage = pourcentage;
	}
	
	

	

}

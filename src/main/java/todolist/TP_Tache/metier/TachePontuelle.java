package todolist.TP_Tache.metier;

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
public class TachePontuelle extends Tache {
	
	private Boolean isDone;

	public TachePontuelle(Boolean isDone) {
		super();
		this.isDone = isDone;
	}
	
	

	
	

}

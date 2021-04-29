
public class IncendieEvent extends AnomalieEvent{
	private String type_anomalie = "Incendie";
	
	public IncendieEvent() {
		super();
		
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}
		
}

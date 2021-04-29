
public class IncendieEvent extends AnomalieEvent{
	private String type_anomalie = "Incendie";
	


	public IncendieEvent(Object source) {
		super(source);

		
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}
		
}

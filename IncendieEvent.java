
public class IncendieEvent extends AnomalieEvent{

	private String type_anomalie = "Incendie";
	private static final long serialVersionUID = 1L;


	public IncendieEvent(Object source) {
		super(source);

		
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}
		
}

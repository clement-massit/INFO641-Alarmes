
public class GazEvent extends AnomalieEvent{
	private String type_gaz;
	private String type_anomalie = "Gaz";
	


	public GazEvent(Object source) {
		super(source);

	}
	
	public String getType_gaz() {
		return type_gaz;
	}
	public void setType_gaz(String type_gaz) {
		this.type_gaz = type_gaz;
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}
}


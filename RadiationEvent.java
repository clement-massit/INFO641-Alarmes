

public class RadiationEvent extends AnomalieEvent {
	private int level_rad;
	private String type_anomalie = "Radiation";

	public RadiationEvent() {
		super();
		
	}

	public int getLevel_rad() {
		return level_rad;
	}
	public void setLevel_rad(int level_rad) {
		this.level_rad = level_rad;
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}
	
	
}



public class RadiationEvent extends AnomalieEvent {
	private int level_rad;
	private String type_anomalie = "Radiation";

	public RadiationEvent(Object source) {
		super(source);
		
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

	@Override
	public String toString() {
		return "RadiationEvent [level_rad=" + level_rad + ", type_anomalie=" + type_anomalie + ", getDate_apparition()="
				+ getDate_apparition() + ", getLocalisation()=" + getLocalisation() + ", getNiveau()=" + getNiveau()
				+ ", getFormat()=" + getFormat() + ", getSource()=" + getSource() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}

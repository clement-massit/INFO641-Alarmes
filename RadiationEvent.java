

public class RadiationEvent extends AnomalieEvent {
	private int level_rad;
	private String type_anomalie = "Radiation";

	public RadiationEvent(Object source) {
		super(source);
		
	}
	@Override
	public int getLevel_rad() {
		return this.level_rad;
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
		return "Type d'anomalie : " + type_anomalie + "\nNiveau de radiation : " + getLevel_rad() + "\ngetDate d'apparition : "
				+ getDate_apparition() + "\nLocalisation : " + getLocalisation() + "\nNiveau d'improtance : " + getNiveau();
	}
	
	
	
	
}

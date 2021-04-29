import java.util.Date;

public class RadiationEvent extends AnomalieEvent {
	private int level_rad;

	public RadiationEvent(Date date_apparition, String localisation, int niveau, int level_rad) {
		super();
		this.level_rad = level_rad;
	}

	public int getLevel_rad() {
		return level_rad;
	}

	public void setLevel_rad(int level_rad) {
		this.level_rad = level_rad;
	}
	
	
}

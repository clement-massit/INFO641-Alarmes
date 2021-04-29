

public class RadiationEvent extends AnomalieEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int level_rad;

	public RadiationEvent(Object source) {
		super(source);
		
	}

	public int getLevel_rad() {
		return level_rad;
	}

	public void setLevel_rad(int level_rad) {
		this.level_rad = level_rad;
	}
	
	
}

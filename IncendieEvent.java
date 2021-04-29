
public class IncendieEvent extends AnomalieEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String state;

	public IncendieEvent(Object source) {
		super(source);
		
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
		
}

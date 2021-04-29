import java.util.Date;

public class IncendieEvent extends AnomalieEvent{
	private String state;

	public IncendieEvent(Date date_apparition, String localisation, int niveau, String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
		
}

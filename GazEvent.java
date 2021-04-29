
public class GazEvent extends AnomalieEvent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;

	public GazEvent(Object source) {
		super(source);

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}

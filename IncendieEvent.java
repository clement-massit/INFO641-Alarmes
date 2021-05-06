
public class IncendieEvent extends AnomalieEvent{
	private String type_anomalie = "Incendie";
	


	public IncendieEvent(Object source) {
		super(source);

		
	}
	
	@Override
	public String get_type_anomalie() {
		return(this.type_anomalie);
	}

	@Override
	public String toString() {
		return "IncendieEvent [type_anomalie=" + type_anomalie + ", getDate_apparition()=" + getDate_apparition()
				+ ", getLocalisation()=" + getLocalisation() + ", getNiveau()=" + getNiveau() + ", getFormat()="
				+ getFormat() + ", getSource()=" + getSource() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
		
}

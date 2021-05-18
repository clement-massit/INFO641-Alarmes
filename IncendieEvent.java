
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
		return "Type d'anomalie : " + type_anomalie + "\ngetDate d'apparition : "
				+ getDate_apparition() + "\nLocalisation : " + getLocalisation() + "\nNiveau d'improtance : " + getNiveau();
	}
	
	
		
}

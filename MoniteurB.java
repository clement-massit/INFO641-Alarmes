import java.util.ArrayList;
import java.util.Collection;

public class MoniteurB {
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();
	
	public MoniteurB() {
		
	}
	
	private void ajout_event(AnomalieEvent event) {
		liste_event.add(event);
	}
	
	public void display_moniteur() {
		System.out.println(liste_event);
	}
}

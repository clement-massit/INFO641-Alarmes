import java.util.ArrayList;
import java.util.Collection;

public class MoniteurA {
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();

	public MoniteurA() {
		
		
	}
	private void add_to_list_event(AnomalieEvent event) {
		liste_event.add(event);
	}
	
	public void display_moniteurA() {
		System.out.println(liste_event);
	}
}

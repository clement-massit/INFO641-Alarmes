import java.util.ArrayList;
import java.util.Collection;

public class MoniteurA implements GazEventListener, IncendieEventListener{
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();

	public MoniteurA() {
		
	}
	
	public void add_to_list_event(AnomalieEvent event) {
		if (event.get_type_anomalie() == "Gaz" || event.get_type_anomalie() == "Incendie") {
			liste_event.add(event);
		}
		System.out.println(liste_event);
		
	}
	
	public void display_moniteurA() {
		System.out.println(liste_event);
	}

	@Override
	public void onEvent(IncendieEvent inc_event) {
		// TODO Auto-generated method stub
		liste_event.add(inc_event);
	}

	@Override
	public void onEvent(GazEvent gaz_event) {
		// TODO Auto-generated method stub
		liste_event.add(gaz_event);
		
	}
}

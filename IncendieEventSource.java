import java.util.ArrayList;
import java.util.Collection;

public class IncendieEventSource {
	private Collection<IncendieEventListener> liste_incendie_event =  new ArrayList<IncendieEventListener>();
	
	
	
	public void genEvent() {
		IncendieEvent inc_1 = new IncendieEvent(this);
		for (IncendieEventListener listener : liste_incendie_event) {
			listener.onEvent(inc_1);
		}
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_incendie_event.add(ecouteur);
	}
}

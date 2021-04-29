import java.util.ArrayList;
import java.util.Collection;

public class GazEventSource {
	private Collection<GazEventListener> liste_gaz_event =  new ArrayList<GazEventListener>();
	
	public GazEventSource() {
	}
	
	public void genEvent() {
		GazEvent gaz_1 = new GazEvent();
		for (GazEventListener listener : liste_gaz_event) {
			listener.onEvent(gaz_1);
		}
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_gaz_event.add(ecouteur);
	}
	
	
}

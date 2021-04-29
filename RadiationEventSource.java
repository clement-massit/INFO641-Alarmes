import java.util.ArrayList;
import java.util.Collection;

public class RadiationEventSource {
private Collection<RadiationEventListener> liste_rad_event =  new ArrayList<RadiationEventListener>();
	
	public RadiationEventSource() {
	}
	
	public void genEvent() {
		RadiationEvent rad_1 = new RadiationEvent();
		for (RadiationEventListener listener : liste_rad_event) {
			listener.onEvent(rad_1);
		}
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_rad_event.add(ecouteur);
	}
}

import java.util.ArrayList;
import java.util.Collection;

public class RadiationEventSource {
	private Collection<RadiationEventListener> liste_rad_event =  new ArrayList<RadiationEventListener>();
	public String localisation;
	
	public RadiationEventSource(String localisation) {
		this.setLocalisation(localisation);
	}	
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public RadiationEvent genEvent(int level, int niveau_rad) {
		RadiationEvent rad_1 = new RadiationEvent(this);
		rad_1.setLocalisation(this.localisation);
		rad_1.setNiveau(level);
		rad_1.setLevel_rad(niveau_rad);
		for (RadiationEventListener listener : liste_rad_event) {
			listener.onEvent(rad_1);
		}
		return rad_1;
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_rad_event.add(ecouteur);
	}
}

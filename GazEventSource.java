import java.util.ArrayList;
import java.util.Collection;

public class GazEventSource {
	private Collection<GazEventListener> liste_gaz_event =  new ArrayList<GazEventListener>();
	public String localisation;
	
	public GazEventSource(String localisation) {
		this.setLocalisation(localisation);
	}	
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public void genEvent(int level, String gaz) {
		GazEvent gaz_1 = new GazEvent(this);
		gaz_1.setLocalisation(this.localisation);
		gaz_1.setNiveau(level);
		gaz_1.setType_gaz(gaz);
		for (GazEventListener listener : liste_gaz_event) {
			listener.onEvent(gaz_1);
		}
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_gaz_event.add(ecouteur);
	}	
}

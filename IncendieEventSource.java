import java.util.ArrayList;
import java.util.Collection;

public class IncendieEventSource {
	private Collection<IncendieEventListener> liste_incendie_event =  new ArrayList<IncendieEventListener>();
	public String localisation;
	
	public IncendieEventSource(String localisation) {
		this.setLocalisation(localisation);
	}
	
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public IncendieEvent genEvent(int level) {
		IncendieEvent inc_1 = new IncendieEvent(this);
		inc_1.setLocalisation(this.localisation);
		inc_1.setNiveau(level);
		for (IncendieEventListener listener : liste_incendie_event) {
			listener.onEvent(inc_1);
		}
		return inc_1;
	}
	
	public void addListener(Anomalie_Ecouteur ecouteur) {
		liste_incendie_event.add(ecouteur);
	}
}

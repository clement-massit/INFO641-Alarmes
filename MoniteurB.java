import java.util.ArrayList;
import java.util.Collection;

public class MoniteurB implements GazEventListener, RadiationEventListener{
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();
	
	public MoniteurB() {
		
	}
	
	private void ajout_event(AnomalieEvent event) {
		if (event.get_type_anomalie() == "Gaz" || event.get_type_anomalie() == "Radiation"){
				liste_event.add(event);
		}
	}
	
	public void display_moniteur() {
		System.out.println(liste_event);
	}

	@Override
	public void onEvent(RadiationEvent rad_event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEvent(GazEvent gaz_event) {
		// TODO Auto-generated method stub
		
	}
}

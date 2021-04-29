
public class Main {
	public static void main(String[] args) {
		GazEventSource gaz_source = new GazEventSource();
		IncendieEventSource inc_source = new IncendieEventSource();
		RadiationEventSource rad_source = new RadiationEventSource();
		
		
		Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
		
		gaz_source.addListener(ecouteur1);
		inc_source.addListener(ecouteur1);
		rad_source.addListener(ecouteur1);
		
		
		gaz_source.genEvent();
		inc_source.genEvent();
		
	}
}

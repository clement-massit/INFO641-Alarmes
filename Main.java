
public class Main {
	public static void main(String[] args) {
		GazEventSource gaz_source = new GazEventSource();
		IncendieEventSource inc_source = new IncendieEventSource();
		RadiationEventSource rad_source = new RadiationEventSource();
		AnomalieEvent anomalie_gaz = new GazEvent(gaz_source);
		AnomalieEvent anomalie_incendie = new IncendieEvent(inc_source);
		AnomalieEvent anomalie_radiation = new RadiationEvent(rad_source);
		
	
		Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
		
		gaz_source.addListener(ecouteur1);
		inc_source.addListener(ecouteur1);
		rad_source.addListener(ecouteur1);
		
		
		gaz_source.genEvent();
		System.out.println("==========");
		inc_source.genEvent();
		System.out.println("==========");
		rad_source.genEvent();
		
		anomalie_gaz.print_Anomalie();
		anomalie_incendie.print_Anomalie();
		anomalie_radiation.print_Anomalie();
		
		MoniteurA moniteur_A = new MoniteurA();
		moniteur_A.add_to_list_event(anomalie_gaz);
		
	}
}

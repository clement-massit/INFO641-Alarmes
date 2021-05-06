
public class Main{
	public static void main(String[] args) {
		GazEventSource gaz_source = new GazEventSource("Batiment A");
		IncendieEventSource inc_source = new IncendieEventSource("Batiment B");
		RadiationEventSource rad_source = new RadiationEventSource("Batiment C");
		

		Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
		
		gaz_source.addListener(ecouteur1);
		inc_source.addListener(ecouteur1);
		rad_source.addListener(ecouteur1);
		

		gaz_source.genEvent(3);
		System.out.println("==========");
		inc_source.genEvent(2);
		System.out.println("==========");
		rad_source.genEvent(1);
		
		
		/*
		MoniteurA moniteur_A = new MoniteurA();
		moniteur_A.add_to_list_event(anomalie_gaz);
		moniteur_A.add_to_list_event(anomalie_incendie);
		moniteur_A.add_to_list_event(anomalie_radiation);
		
		MoniteurB moniteur_B = new MoniteurB();
		moniteur_B.ajout_event(anomalie_gaz);
		moniteur_B.ajout_event(anomalie_incendie);
		moniteur_B.ajout_event(anomalie_radiation);
		moniteur_B.affiche_liste();
		*/
	}
}


public class Main {
	public static void main(String[] args) {
		GazEventSource gaz_source = new GazEventSource();
		Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
		
		gaz_source.addListener(ecouteur1);
		
		gaz_source.genEvent();
	}
}

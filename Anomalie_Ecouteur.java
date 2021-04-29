
public class Anomalie_Ecouteur implements GazEventListener, IncendieEventListener, RadiationEventListener{

	@Override
	public void onEvent(RadiationEvent rad_event) {
		// TODO Auto-generated method stub
		System.out.println(rad_event);
		
	}

	@Override
	public void onEvent(IncendieEvent inc_event) {
		// TODO Auto-generated method stub
		System.out.println(inc_event);
		
	}

	@Override
	public void onEvent(GazEvent gaz_event) {
		// TODO Auto-generated method stub
		System.out.println(gaz_event);
		
	}

}

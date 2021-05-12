import java.util.ArrayList;
import java.util.Collection;

public class Liste_anomalie {
	private Collection<AnomalieEvent> liste_ano_A1 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_A2 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_A3 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_B1 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_B2 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_B3 =  new ArrayList<AnomalieEvent>();
	
	
	public void ajout_ano(AnomalieEvent ano) {
		int level = ano.getNiveau();
		String type = ano.get_type_anomalie();
		
		if(level==1) {
			if (type == 'Gaz'){
				liste_ano_A1.add(ano);
				liste_ano_B1.add(ano);
			}
			else if (type == 'Incendie'){
				liste_ano_A1.add(ano);	
			}
			else if (type == 'Radiation'){
				liste_ano_B1.add(ano);	
			}
		}
		else if(level==2) {
			if (type == 'Gaz'){
				liste_ano_A2.add(ano);
				liste_ano_B2.add(ano);
			}
			else if (type == 'Incendie'){
				liste_ano_A2.add(ano);	
			}
			else if (type == 'Radiation'){
				liste_ano_B2.add(ano);	
			}
		}
		else if(level==3) {
			if (type == 'Gaz'){
				liste_ano_A3.add(ano);
				liste_ano_B3.add(ano);
			}
			else if (type == 'Incendie'){
				liste_ano_A3.add(ano);	
			}
			else if (type == 'Radiation'){
				liste_ano_B3.add(ano);	
			}
		}
	}


	public Collection<AnomalieEvent> getListe_ano_A1() {
		return liste_ano_A1;
	}
	public void setListe_ano_A1(Collection<AnomalieEvent> liste_ano_A1) {
		this.liste_ano_A1 = liste_ano_A1;
	}
	public Collection<AnomalieEvent> getListe_ano_A2() {
		return liste_ano_A2;
	}
	public void setListe_ano_A2(Collection<AnomalieEvent> liste_ano_A2) {
		this.liste_ano_A2 = liste_ano_A2;
	}
	public Collection<AnomalieEvent> getListe_ano_A3() {
		return liste_ano_A3;
	}
	public void setListe_ano_A3(Collection<AnomalieEvent> liste_ano_A3) {
		this.liste_ano_A3 = liste_ano_A3;
	}
	public Collection<AnomalieEvent> getListe_ano_B1() {
		return liste_ano_B1;
	}
	public void setListe_ano_B1(Collection<AnomalieEvent> liste_ano_B1) {
		this.liste_ano_B1 = liste_ano_B1;
	}
	public Collection<AnomalieEvent> getListe_ano_B2() {
		return liste_ano_B2;
	}
	public void setListe_ano_B2(Collection<AnomalieEvent> liste_ano_B2) {
		this.liste_ano_B2 = liste_ano_B2;
	}
	public Collection<AnomalieEvent> getListe_ano_B3() {
		return liste_ano_B3;
	}
	public void setListe_ano_B3(Collection<AnomalieEvent> liste_ano_B3) {
		this.liste_ano_B3 = liste_ano_B3;
	}


	
	@Override
	public String toString() {
		return "Liste_anomalie [liste_ano_A1=" + liste_ano_A1 + ", liste_ano_A2=" + liste_ano_A2 + ", liste_ano_A3="
				+ liste_ano_A3 + ", liste_ano_B1=" + liste_ano_B1 + ", liste_ano_B2=" + liste_ano_B2 + ", liste_ano_B3="
				+ liste_ano_B3 + "]";
	}
	
	
	
	

	
}


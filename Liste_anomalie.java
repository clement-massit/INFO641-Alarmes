import java.util.ArrayList;
import java.util.Collection;

public class Liste_anomalie {
	private Collection<AnomalieEvent> liste_ano_1 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_2 =  new ArrayList<AnomalieEvent>();
	private Collection<AnomalieEvent> liste_ano_3 =  new ArrayList<AnomalieEvent>();
	
	public Collection<AnomalieEvent> getListe_ano_1() {
		return liste_ano_1;
	}
	public void setListe_ano_1(Collection<AnomalieEvent> liste_ano_1) {
		this.liste_ano_1 = liste_ano_1;
	}
	public Collection<AnomalieEvent> getListe_ano_2() {
		return liste_ano_2;
	}
	public void setListe_ano_2(Collection<AnomalieEvent> liste_ano_2) {
		this.liste_ano_2 = liste_ano_2;
	}
	public Collection<AnomalieEvent> getListe_ano_3() {
		return liste_ano_3;
	}
	public void setListe_ano_3(Collection<AnomalieEvent> liste_ano_3) {
		this.liste_ano_3 = liste_ano_3;
	}
	
	public void ajout_ano(AnomalieEvent ano) {
		int level = ano.getNiveau();
		
		if(level==1) {
			liste_ano_1.add(ano);
		}
		else if(level==2) {
			liste_ano_2.add(ano);
		}
		else if(level==3) {
			liste_ano_3.add(ano);
		}
	}
	@Override
	public String toString() {
		return "Liste_anomalie [liste_ano_1=" + liste_ano_1 + ", liste_ano_2=" + liste_ano_2 + ", liste_ano_3="
				+ liste_ano_3 + "]";
	}
	
}


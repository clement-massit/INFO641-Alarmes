import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class Liste_anomalie {
	private ArrayList<AnomalieEvent> liste_ano_A1 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_A2 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_A3 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_B1 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_B2 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_B3 =  new ArrayList<AnomalieEvent>();
	
	private DefaultListModel liste_txt_ano_A1 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_A2 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_A3 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B1 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B2 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B3 = new DefaultListModel();

	public void ajout_ano(AnomalieEvent ano) {
		int level = ano.getNiveau();
		String type = ano.get_type_anomalie();
		String nom = "Anomalie de " + type;
		
		if(level==1) {
			if (type == "Gaz"){
				liste_ano_A1.add(ano);
				liste_txt_ano_A1.addElement(nom);
				liste_ano_B1.add(ano);
				liste_txt_ano_B1.addElement(nom);
			}
			else if (type == "Incendie"){
				liste_ano_A1.add(ano);
				liste_txt_ano_A1.addElement(nom);
			}
			else if (type == "Radiation"){
				liste_ano_B1.add(ano);
				liste_txt_ano_B1.addElement(nom);
			}
		}
		else if(level==2) {
			if (type == "Gaz"){
				liste_ano_A2.add(ano);
				liste_txt_ano_A2.addElement(nom);
				liste_ano_B2.add(ano);
				liste_txt_ano_B2.addElement(nom);
			}
			else if (type == "Incendie"){
				liste_ano_A2.add(ano);
				liste_txt_ano_A2.addElement(nom);
			}
			else if (type == "Radiation"){
				liste_ano_B2.add(ano);	
				liste_txt_ano_B2.addElement(nom);
			}
		}
		else if(level==3) {
			if (type == "Gaz"){
				liste_ano_A3.add(ano);
				liste_txt_ano_A3.addElement(nom);
				liste_ano_B3.add(ano);
				liste_txt_ano_B3.addElement(nom);
			}
			else if (type == "Incendie"){
				liste_ano_A3.add(ano);
				liste_txt_ano_A3.addElement(nom);
			}
			else if (type == "Radiation"){
				liste_ano_B3.add(ano);
				liste_txt_ano_B3.addElement(nom);
			}
		}
	}


	public ArrayList<AnomalieEvent> getListe_ano_A1() {
		return liste_ano_A1;
	}
	public ArrayList<AnomalieEvent> getListe_ano_A2() {
		return liste_ano_A2;
	}
	public ArrayList<AnomalieEvent> getListe_ano_A3() {
		return liste_ano_A3;
	}
	public ArrayList<AnomalieEvent> getListe_ano_B1() {
		return liste_ano_B1;
	}
	public ArrayList<AnomalieEvent> getListe_ano_B2() {
		return liste_ano_B2;
	}
	public ArrayList<AnomalieEvent> getListe_ano_B3() {
		return liste_ano_B3;
	}
	public DefaultListModel getListe_txt_ano_A1() {
		return liste_txt_ano_A1;
	}
	public DefaultListModel getListe_txt_ano_A2() {
		return liste_txt_ano_A2;
	}
	public DefaultListModel getListe_txt_ano_A3() {
		return liste_txt_ano_A3;
	}
	public DefaultListModel getListe_txt_ano_B1() {
		return liste_txt_ano_B1;
	}
	public DefaultListModel getListe_txt_ano_B2() {
		return liste_txt_ano_B2;
	}
	public DefaultListModel getListe_txt_ano_B3() {
		return liste_txt_ano_B3;
	}


	@Override
	public String toString() {
		return "Liste_anomalie [liste_ano_A1=" + liste_ano_A1 + ", liste_ano_A2=" + liste_ano_A2 + ", liste_ano_A3="
				+ liste_ano_A3 + ", liste_ano_B1=" + liste_ano_B1 + ", liste_ano_B2=" + liste_ano_B2 + ", liste_ano_B3="
				+ liste_ano_B3 + "]";
	}
	
	
	
	

	
}


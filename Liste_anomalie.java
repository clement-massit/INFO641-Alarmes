import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Liste_anomalie {
	private ArrayList<AnomalieEvent> liste_ano_1 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_2 =  new ArrayList<AnomalieEvent>();
	private ArrayList<AnomalieEvent> liste_ano_3 =  new ArrayList<AnomalieEvent>();
	
	
	private DefaultListModel liste_txt_ano_A1 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_A2 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_A3 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B1 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B2 = new DefaultListModel();
	private DefaultListModel liste_txt_ano_B3 = new DefaultListModel();
	
	private JFrame fenetre_anomalie = new JFrame("TEST");
	private JPanel pan = new JPanel();

	public void ajout_ano(AnomalieEvent ano) {
		int level = ano.getNiveau();
		String type = ano.get_type_anomalie();
		
		
		int id = ano.hashCode();
		
		
		if(level==1) {
			liste_ano_1.add(ano);
			if (type == "Gaz" || type == "Incendie"){
				liste_txt_ano_A1.addElement(String.valueOf(id));	
			}
			if (type == "Gaz" || type == "Radiation"){
				liste_txt_ano_B1.addElement(String.valueOf(id));
			}
			
		}
		else if(level==2) {
			liste_ano_2.add(ano);
			if (type == "Gaz" || type == "Incendie"){
				liste_txt_ano_A2.addElement(String.valueOf(id));	
			}
			if (type == "Gaz" || type == "Radiation"){
				liste_txt_ano_B2.addElement(String.valueOf(id));
			}
		}
		else if(level==3) {
			liste_ano_3.add(ano);
			if (type == "Gaz" || type == "Incendie"){
				liste_txt_ano_A3.addElement(String.valueOf(id));	
			}
			if (type == "Gaz" || type == "Radiation"){
				liste_txt_ano_B3.addElement(String.valueOf(id));
			}
		}
	}
	
	private void window_creation(AnomalieEvent anomalie) {
		        
        JLabel type_ano = new JLabel("- Type de l'\u00E9venement : " + anomalie.get_type_anomalie());
        type_ano.setBounds(109, 66, 258, 14);
       
        pan.add(type_ano);
       
        
        JLabel lieu_ano = new JLabel("- Lieu de l'\u00E9venement : " + anomalie.getLocalisation());
        lieu_ano.setBounds(109, 96, 258, 14);
        pan.add(lieu_ano);
      
        
        JLabel level_ano = new JLabel("- Niveau de l'\u00E9venement : " + anomalie.getNiveau());
        level_ano.setBounds(109, 126, 258, 14);
        pan.add(level_ano);
        
        
        JLabel gaz_ano = new JLabel("- Type de gaz : ");
        gaz_ano.setBounds(109, 156, 258, 14);
        pan.add(gaz_ano);
      
        
        JLabel rad_ano = new JLabel("- Niveau de radiation : " );
        rad_ano.setBounds(109, 156, 258, 14);
        pan.add(rad_ano);
      
        
		
		fenetre_anomalie.setSize(450,150);
		fenetre_anomalie.setAlwaysOnTop(true);
		fenetre_anomalie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre_anomalie.setLocationRelativeTo(pan);
	
		fenetre_anomalie.setContentPane(pan);
		fenetre_anomalie.setVisible(true);
		
		
		
		
		
		
	
		
		
		
	}
	
	public void display_selected_anomalie(int id, int level) {
		ArrayList<AnomalieEvent> liste = new ArrayList<AnomalieEvent>();
		
		if (level == 1) {
			
			liste =  liste_ano_1;
		}
		else if (level == 2) {
			liste =  liste_ano_2;
		}
		else if (level == 3) {
			liste =  liste_ano_3;
		}
		
		for (AnomalieEvent ano : liste) {
			
			if (id == ano.hashCode()) {
				window_creation(ano);				
			}
		
			
		}

	}


	
	public ArrayList<AnomalieEvent> getListe_ano_1() {
		return liste_ano_1;
	}
	public ArrayList<AnomalieEvent> getListe_ano_2() {
		return liste_ano_2;
	}
	public ArrayList<AnomalieEvent> getListe_ano_3() {
		return liste_ano_3;
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
		return "Liste_anomalie [liste_ano_1=" + liste_ano_1 + ", liste_ano_2=" + liste_ano_2 + ", liste_ano_3="
				+ liste_ano_3 + ", liste_txt_ano_A1=" + liste_txt_ano_A1 + ", liste_txt_ano_A2=" + liste_txt_ano_A2
				+ ", liste_txt_ano_A3=" + liste_txt_ano_A3 + ", liste_txt_ano_B1=" + liste_txt_ano_B1
				+ ", liste_txt_ano_B2=" + liste_txt_ano_B2 + ", liste_txt_ano_B3=" + liste_txt_ano_B3 + "]";
	}


	
	
	
	
	

	
}


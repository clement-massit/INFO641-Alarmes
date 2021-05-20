import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void window_creation(AnomalieEvent anomalie) {
		fenetre_anomalie.setTitle("Detail de l'anomalie");
        
		
		fenetre_anomalie.setSize(500,250);
		fenetre_anomalie.setAlwaysOnTop(true);
		fenetre_anomalie.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fenetre_anomalie.setLocationRelativeTo(pan);
		fenetre_anomalie.setResizable(false);
		fenetre_anomalie.setContentPane(pan);
		pan.setLayout(null);
		pan.removeAll();
		
		JLabel type_ano = new JLabel("Type de l'anomalie :");
		type_ano.setHorizontalAlignment(SwingConstants.CENTER);
		type_ano.setBounds(43, 19, 400, 18);
		
		JLabel date_ano = new JLabel("Date d'appartition de l'anomalie : ");
		date_ano.setHorizontalAlignment(SwingConstants.CENTER);
		date_ano.setBounds(43, 52, 400, 18);
		
		JLabel lvl_ano = new JLabel("Niveau de l'anomalie : ");
		lvl_ano.setHorizontalAlignment(SwingConstants.CENTER);
		lvl_ano.setBounds(43, 85, 400, 18);
		
		JLabel loca_ano = new JLabel("Lieu de l'anomalie : ");
		loca_ano.setHorizontalAlignment(SwingConstants.CENTER);
		loca_ano.setBounds(43, 118, 400, 18);
		
		JLabel type_gaz_ano = new JLabel("Type de gaz : ");
		type_gaz_ano.setHorizontalAlignment(SwingConstants.CENTER);
		type_gaz_ano.setBounds(43, 151, 400, 18);
		type_gaz_ano.setVisible(false);
		
		JLabel lvl_rad_ano = new JLabel("Niveau de radiation de l'anomalie : ");
		lvl_rad_ano.setHorizontalAlignment(SwingConstants.CENTER);
		lvl_rad_ano.setBounds(43, 151, 400, 18);
		lvl_rad_ano.setVisible(false);
		
		JButton btnTraiter = new JButton("Traiter cette anomalie");
		btnTraiter.setBounds(149, 180, 187, 23);
		
		if (anomalie.get_type_anomalie() == "Gaz") {
			type_gaz_ano.setText("");
			type_gaz_ano.setText("Type de gaz : "+ anomalie.getType_gaz());
			type_gaz_ano.setVisible(true);
		}
		else if(anomalie.get_type_anomalie() == "Radiation") {
			lvl_rad_ano.setText("");
			lvl_rad_ano.setText("Niveau  de radiation : "+ anomalie.getLevel_rad());
			lvl_rad_ano.setVisible(true);
		}
		type_ano.setText("");
		type_ano.setText("Type de l'anomalie : "+ anomalie.get_type_anomalie());
		date_ano.setText("");
		date_ano.setText("Date d'apparition l'anomalie : "+ anomalie.getDate_apparition());
		lvl_ano.setText("");
		lvl_ano.setText("niveau de l'anomalie : "+ anomalie.getNiveau());
		loca_ano.setText("");
		loca_ano.setText("Localisation de l'anomalie : "+ anomalie.getLocalisation());
		
			
		
		pan.add(type_ano);
		pan.add(date_ano);
		pan.add(lvl_ano);
		pan.add(loca_ano);
		pan.add(type_gaz_ano);
		pan.add(lvl_rad_ano);
		pan.add(btnTraiter);
		
		
		
		btnTraiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fenetre_anomalie.dispose();
				String id = String.valueOf(anomalie.hashCode());
				int level = anomalie.getNiveau();
				ArrayList<AnomalieEvent> liste = new ArrayList<AnomalieEvent>();
				DefaultListModel liste_txt_1 = new DefaultListModel();
				DefaultListModel liste_txt_2 = new DefaultListModel();
				
				if (level == 1) {
					liste = liste_ano_1;
					liste_txt_1 = liste_txt_ano_A1;
					liste_txt_2 = liste_txt_ano_B1;
				}
				else if (level == 2) {
					liste = liste_ano_2;
					liste_txt_1 = liste_txt_ano_A2;
					liste_txt_2 = liste_txt_ano_B2;
				}
				else if (level == 3) {
					liste = liste_ano_3;
					liste_txt_1 = liste_txt_ano_A3;
					liste_txt_2 = liste_txt_ano_B3;
				}
				
				for (int i=0; i<liste.size(); i++) {
					if (liste.get(i) == anomalie) {
						liste.remove(i);
					}
				} 
				
				for (int i=0; i<liste_txt_1.size(); i++) {
					if (liste_txt_1.get(i).equals(id)) {
						liste_txt_1.remove(i);
					}
				}
				for (int i=0; i<liste_txt_2.size(); i++) {
					if (liste_txt_2.get(i).equals(id)) {
						liste_txt_2.remove(i);
					}
				}
			}
		});
		
		
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


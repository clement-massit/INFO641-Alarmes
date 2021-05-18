import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;

public class InterfaceGenEvent{

	private JFrame frame;
	private JTextField type_gaz;
	

	/**
	 * Launch the application.
	 */
	public void main(Liste_anomalie liste_ano) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGenEvent window = new InterfaceGenEvent(liste_ano);
					window.frame.setVisible(true);
					
					//Création + ouverture de l'interfaces des moniteurs
					MoniteurInterfaceGraphique.Moniteur(liste_ano);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceGenEvent(Liste_anomalie liste_ano) {
		initialize(liste_ano);
		
		
		
	}
	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize(Liste_anomalie liste_ano) {
		
		/*
		 * Création des listes pour les JComboBox
		 */

		String[] bat = {"Bâtiment A", "Bâtiment B", "Bâtiment C"};
		String[] anomalie = {"Gaz", "Incendie", "Radiation"};
		String[] level = {"1", "2", "3"};
		
		/*
		 * Création de la frame/fenêtre
		 */
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 480, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Création du panel/calque
		 */
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 48, 466, 233);
		frame.getContentPane().add(panel);
		panel.setLayout(null);		
		/*
		 * Création des objets d'entrée
		 */
		//////////////	JComboBox	////////////////////////////////
		
		JComboBox choix_type_ano = new JComboBox(anomalie);
		choix_type_ano.setBounds(120, 91, 92, 20);
		panel.add(choix_type_ano);
		
		JComboBox choix_bat = new JComboBox(bat);	//Choix du type de l'objet -> definis depuis la liste de string 'bat'
		choix_bat.setBounds(120, 65, 92, 20);		//Selection de l'emplacement de l'objet
		panel.add(choix_bat);						//Ajout de l'element au panel
		choix_bat.setVisible(false);				//Rend l'element invisible
		
		JComboBox choix_level = new JComboBox(level);
		choix_level.setBounds(250, 65, 55, 20);
		panel.add(choix_level);
		choix_level.setVisible(false);
		
		
		//////////////	JButton		////////////////////////////////
		JButton btnType = new JButton("Valider le type");
		btnType.setBounds(250, 90, 131, 23);
		panel.add(btnType);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setBounds(367, 199, 89, 23);
		panel.add(btnBack);
		btnBack.setVisible(false);
		
		JButton btnGene = new JButton("Génerer l'évenement");
		btnGene.setBounds(147, 150, 172, 23);
		panel.add(btnGene);
		btnGene.setVisible(false);
		
		JButton btn_retour = new JButton("Créer une nouvelle anomalie");
		btn_retour.setBounds(85, 150, 300, 23);
		
		//////////////	JLabel		////////////////////////////////
		JLabel affichage_type_ano = new JLabel("Vous avez sélectionné un évenement de type ");
		affichage_type_ano.setHorizontalAlignment(SwingConstants.CENTER);
		affichage_type_ano.setBounds(18, 40, 429, 14);
		panel.add(affichage_type_ano);
		affichage_type_ano.setVisible(false);
		
		JLabel presentation = new JLabel("Vous venez de creer un evenement ayant ces caracteristiques :");
		presentation.setHorizontalAlignment(SwingConstants.CENTER);
		presentation.setBounds(25, 40, 416, 14);
		panel.add(presentation);
		presentation.setVisible(false);
		
		JLabel type_ano = new JLabel("- Type de l'evenement : ");
		type_ano.setBounds(109, 66, 258, 14);
		panel.add(type_ano);
		type_ano.setVisible(false);
		
		JLabel lieu_ano = new JLabel("- Lieu de l'evenement : ");
		lieu_ano.setBounds(109, 96, 258, 14);
		panel.add(lieu_ano);
		lieu_ano.setVisible(false);
		
		JLabel level_ano = new JLabel("- Niveau de l'evenement : ");
		level_ano.setBounds(109, 126, 258, 14);
		panel.add(level_ano);
		level_ano.setVisible(false);
		
		JLabel gaz_ano = new JLabel("- Type de gaz : ");
		gaz_ano.setBounds(109, 156, 258, 14);
		panel.add(gaz_ano);
		gaz_ano.setVisible(false);
		
		JLabel rad_ano = new JLabel("- Niveau de radiation : ");
		rad_ano.setBounds(109, 156, 258, 14);
		panel.add(rad_ano);
		
		JLabel Title_first_page = new JLabel("Choix du type d'anomalie");
		
		
		Title_first_page.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title_first_page.setHorizontalAlignment(SwingConstants.CENTER);
		Title_first_page.setBounds(0, 0, 476, 46);
		frame.getContentPane().add(Title_first_page);
				
		JLabel Title_second_page = new JLabel("Caracteristiques de l'anomalie");
		Title_second_page.setHorizontalAlignment(SwingConstants.CENTER);
		Title_second_page.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title_second_page.setBounds(0, 0, 476, 46);
		Title_second_page.setVisible(false);
		
		
		frame.getContentPane().add(Title_second_page);
		
		type_gaz = new JTextField();
		type_gaz.setToolTipText("");
		type_gaz.setBounds(185, 106, 96, 20);
		type_gaz.setColumns(10);
		panel.add(type_gaz);
		type_gaz.setVisible(false);
		
		JSpinner niveau_rad = new JSpinner();
		niveau_rad.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		niveau_rad.setBounds(204, 105, 57, 23);
		panel.add(niveau_rad);
		niveau_rad.setVisible(false);
		rad_ano.setVisible(false)
		
		
		
		
		
		

		;
		
		
		
		
		/*
		 * Fonction des boutons
		 */
		
		btnType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Title_first_page.setVisible(false);
				Title_second_page.setVisible(true);
				String type = choix_type_ano.getSelectedItem().toString();
				String phrase = affichage_type_ano.getText();
				affichage_type_ano.setText(phrase + type);
				
				choix_type_ano.setVisible(false);
				btnType.setVisible(false);
				btnBack.setVisible(true);
				affichage_type_ano.setVisible(true);
				choix_bat.setVisible(true);
				choix_level.setVisible(true);
				
				if (type=="Gaz") {
					type_gaz.setVisible(true);
				}
				if (type=="Radiation") {
					niveau_rad.setVisible(true);
				}
				
				btnGene.setVisible(true);
				
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Title_first_page.setVisible(true);
				Title_second_page.setVisible(false);
				choix_type_ano.setVisible(true);
				btnType.setVisible(true);
				btnBack.setVisible(false);
				affichage_type_ano.setVisible(false);
				choix_bat.setVisible(false);
				choix_level.setVisible(false);
				type_gaz.setVisible(false);
				niveau_rad.setVisible(false);
				btnGene.setVisible(false);
				affichage_type_ano.setText("Vous avez sï¿½lï¿½ctionnï¿½ un ï¿½venement de type ");
			}
		});
		
		btnGene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_retour.setVisible(true);
				Title_second_page.setVisible(false);
				panel.setVisible(false);
				
				
				JPanel frame_creation_event = new JPanel();
				frame_creation_event.setLayout(null);
				frame_creation_event.setBounds(0, 0, 466, 233);
				frame.getContentPane().add(frame_creation_event);
				frame_creation_event.add(btn_retour);
				
				
				String type = choix_type_ano.getSelectedItem().toString();
				String localisation = choix_bat.getSelectedItem().toString();
				int level = Integer.parseInt(choix_level.getSelectedItem().toString());
				
				
				Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
				
				if (type == "Gaz") {
					String gaz = type_gaz.getText();
					GazEventSource gaz_source = new GazEventSource(localisation);
					gaz_source.addListener(ecouteur1);
					liste_ano.ajout_ano(gaz_source.genEvent(level, gaz));

					String i4 = gaz_ano.getText();
					gaz_ano.setText(i4 + gaz);
				}
				else if (type == "Incendie") {
					IncendieEventSource inc_source = new IncendieEventSource(localisation);
					inc_source.addListener(ecouteur1);
					liste_ano.ajout_ano(inc_source.genEvent(level));
				}
				else if (type == "Radiation") {
					int value = Integer.parseInt(niveau_rad.getValue().toString());
					RadiationEventSource rad_source = new RadiationEventSource(localisation);
					rad_source.addListener(ecouteur1);
					liste_ano.ajout_ano(rad_source.genEvent(level, value));

					String i4 = rad_ano.getText();
					rad_ano.setText(i4 + value);
					
					rad_ano.setVisible(false);
					niveau_rad.setVisible(false);
					
				}
				
				
				String i1 = type_ano.getText();
				String i2 = lieu_ano.getText();
				String i3 = level_ano.getText();
				
				type_ano.setText(i1 + type);
				lieu_ano.setText(i2 + localisation);
				level_ano.setText(i3 + level);
				
			
				
				
				
				btn_retour.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel.setVisible(true);
						Title_first_page.setVisible(true);
						choix_type_ano.setVisible(true);
						btnType.setVisible(true);
						
						btnBack.setVisible(false);
						affichage_type_ano.setVisible(false);
						choix_bat.setVisible(false);
						choix_level.setVisible(false);
						type_gaz.setVisible(false);
						btnGene.setVisible(false);
						btn_retour.setVisible(false);
					}
				});
				

				
			}
		});
		
		
		
	}
}


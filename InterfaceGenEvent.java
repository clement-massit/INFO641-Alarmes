import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

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
		 * Cr�ation des listes pour les JComboBox
		 */
		
		String[] bat = {"Bâtiment A", "Bâtiment B", "Bâtiment C"};
		String[] anomalie = {"Gaz", "Incendie", "Radiation"};
		String[] level = {"1", "2", "3"};
		
		/*
		 * Cr�ation de la frame/fen�tre
		 */
		
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Cr�ation du panel/calque
		 */
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);		
		/*
		 * Cr�ation des objets d'entr�e
		 */
		
		JComboBox choix_type_ano = new JComboBox(anomalie);
		choix_type_ano.setBounds(120, 91, 92, 20);
		panel.add(choix_type_ano);
		
		JButton btnType = new JButton("Valider le type");
		btnType.setBounds(250, 90, 131, 23);
		panel.add(btnType);
		
		JButton btnBack = new JButton("Retour");
		btnBack.setBounds(367, 199, 89, 23);
		panel.add(btnBack);
		btnBack.setVisible(false);
		
		JLabel affichage_type_ano = new JLabel("Vous avez s\u00E9l\u00E9ctionn\u00E9 un \u00E9venement de type ");
		affichage_type_ano.setHorizontalAlignment(SwingConstants.CENTER);
		affichage_type_ano.setBounds(18, 40, 429, 14);
		panel.add(affichage_type_ano);
		affichage_type_ano.setVisible(false);
		
		JComboBox choix_bat = new JComboBox(bat);	//Choix du type de l'objet -> definis depuis la liste de string 'bat'
		choix_bat.setBounds(120, 65, 92, 20);		//Selection de l'emplacement de l'objet
		panel.add(choix_bat);						//Ajout de l'element au panel
		choix_bat.setVisible(false);				//Rend l'element invisible
		
		JComboBox choix_level = new JComboBox(level);
		choix_level.setBounds(250, 65, 55, 20);
		panel.add(choix_level);
		choix_level.setVisible(false);
		
		JButton btnGene = new JButton("G\u00E9nerer l'\u00E9venement");
		btnGene.setBounds(147, 150, 172, 23);
		panel.add(btnGene);
		btnGene.setVisible(false);
		
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
		
		
		
		JLabel presentation = new JLabel("Vous venez de cr\u00E9er un \u00E9venement ayant ces caract\u00E9ristiques :");
		presentation.setHorizontalAlignment(SwingConstants.CENTER);
		presentation.setBounds(25, 40, 416, 14);
		panel.add(presentation);
		presentation.setVisible(false);
		
		JLabel type_ano = new JLabel("- Type de l'\u00E9venement : ");
		type_ano.setBounds(109, 66, 258, 14);
		panel.add(type_ano);
		type_ano.setVisible(false);
		
		JLabel lieu_ano = new JLabel("- Lieu de l'\u00E9venement : ");
		lieu_ano.setBounds(109, 96, 258, 14);
		panel.add(lieu_ano);
		lieu_ano.setVisible(false);
		
		JLabel level_ano = new JLabel("- Niveau de l'\u00E9venement : ");
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
		rad_ano.setVisible(false);
		
		
		/*
		 * Fonction des boutons
		 */
		
		btnType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				choix_type_ano.setVisible(true);
				btnType.setVisible(true);
				btnBack.setVisible(false);
				affichage_type_ano.setVisible(false);
				choix_bat.setVisible(false);
				choix_level.setVisible(false);
				type_gaz.setVisible(false);
				niveau_rad.setVisible(false);
				btnGene.setVisible(false);
				affichage_type_ano.setText("Vous avez s�l�ctionn� un �venement de type ");
			}
		});
		
		btnGene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					
					gaz_ano.setVisible(true);
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
					
					rad_ano.setVisible(true);
				}
				
				
				btnBack.setVisible(false);
				affichage_type_ano.setVisible(false);
				choix_bat.setVisible(false);
				choix_level.setVisible(false);
				type_gaz.setVisible(false);
				niveau_rad.setVisible(false);
				btnGene.setVisible(false);
				
				String i1 = type_ano.getText();
				String i2 = lieu_ano.getText();
				String i3 = level_ano.getText();
				
				type_ano.setText(i1 + type);
				lieu_ano.setText(i2 + localisation);
				level_ano.setText(i3 + level);
				
				presentation.setVisible(true);
				type_ano.setVisible(true);
				lieu_ano.setVisible(true);
				level_ano.setVisible(true);
				
			}
		});

		
		
		
		
		
	}
}


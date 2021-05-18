import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class MoniteurInterfaceGraphique implements GazEventListener, IncendieEventListener, RadiationEventListener{
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();
	private JFrame frame;
	private final JPanel menaceA_1 = new JPanel();
	private final JPanel menaceA_2 = new JPanel();
	private final JPanel menaceA_3 = new JPanel();
	
	private static JTextField ano1_text = new JTextField();
	private static JTextField ano2_text = new JTextField();
	private static JTextField ano3_text = new JTextField();
	
	


	@Override
	public void onEvent(IncendieEvent inc_event) {
		// TODO Auto-generated method stub
		liste_event.add(inc_event);
		
	}

	@Override
	public void onEvent(GazEvent gaz_event) {
		// TODO Auto-generated method stub
		liste_event.add(gaz_event);
		
		
	}
	@Override
	public void onEvent(RadiationEvent rad_event) {
		// TODO Auto-generated method stub
		liste_event.add(rad_event);
	}
	/**
	 * Launch the application.
	 */
	public static void Moniteur(Liste_anomalie liste_ano) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					MoniteurInterfaceGraphique window = new MoniteurInterfaceGraphique(liste_ano);
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
	public MoniteurInterfaceGraphique(Liste_anomalie liste_ano) {
		initialize(liste_ano);
		
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Liste_anomalie liste_ano) {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panelA = new JPanel();
		panelA.setBounds(20, 70, 340, 458);
		
		JPanel panelB = new JPanel();
		panelB.setBounds(426, 70, 340, 458);
		
		JLabel gestion_moniteur = new JLabel("Gestion des moniteurs");
		gestion_moniteur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gestion_moniteur.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gestion_moniteur, BorderLayout.NORTH);
		
		JLabel moniteurA = new JLabel("Moniteur A");
		moniteurA.setBounds(10, 37, 350, 22);
		moniteurA.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel moniteurB = new JLabel("Moniteur B");
		moniteurB.setBounds(426, 37, 350, 22);
		moniteurB.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		menaceA_1.setBackground(Color.YELLOW);
		menaceA_1.setBounds(10, 31, 320, 135);
		panelA.add(menaceA_1);
		menaceA_1.setLayout(null);
		
		
		
		panel.add(moniteurA);
		panel.add(moniteurB);
		panel.add(panelA);
		panel.add(panelB);
		
		
		
		
		/*
		 * texte pour l'affichage des events
		 */
		
		ano1_text.setBackground(Color.YELLOW);
		ano1_text.setBounds(10, 10, 300, 115);
		ano1_text.setText(liste_ano.getListe_ano_A1());
		menaceA_1.add(ano1_text);
		ano1_text.setVisible(false);
		menaceA_2.setLayout(null);
		
		
		ano2_text.setBackground(Color.ORANGE);
		ano2_text.setBounds(10, 10, 300, 115);
		ano2_text.setText(liste_ano.toString());
		menaceA_2.add(ano2_text);
		ano2_text.setVisible(false);
		menaceA_3.setLayout(null);
		
		
		ano3_text.setBackground(Color.RED);
		ano3_text.setBounds(10, 10, 300, 115);
		ano3_text.setText(liste_ano.toString());
		menaceA_3.add(ano3_text);
		ano3_text.setVisible(false);
		panelA.setLayout(null);
		menaceA_2.setBackground(Color.ORANGE);
		menaceA_2.setBounds(10, 176, 320, 135);
		
		panelA.add(menaceA_2);
		menaceA_3.setBackground(Color.RED);
		menaceA_3.setBounds(10, 323, 320, 135);
		
		panelA.add(menaceA_3);
		panelB.setLayout(null);
		
		
		JPanel menaceB_1 = new JPanel();
		menaceB_1.setBackground(Color.YELLOW);
		menaceB_1.setBounds(10, 31, 320, 135);
		panelB.add(menaceB_1);
		menaceB_1.setLayout(null);
		
		JPanel menaceB_2 = new JPanel();
		menaceB_2.setBackground(Color.ORANGE);
		menaceB_2.setBounds(10, 176, 320, 135);
		panelB.add(menaceB_2);
		menaceB_2.setLayout(null);
		
		JPanel menaceB_3 = new JPanel();
		menaceB_3.setBackground(Color.RED);
		menaceB_3.setBounds(10, 323, 320, 135);
		panelB.add(menaceB_3);
		menaceB_3.setLayout(null);
		
		
		

	}
	
	public static void afficher_liste(Liste_anomalie liste_ano) {
		Collection<AnomalieEvent> lA1 =  new ArrayList<AnomalieEvent>();
		lA1 = liste_ano.getListe_ano_A1();
		
		for (AnomalieEvent ano : lA1) {
			String txt = 
			
		}
	}
}

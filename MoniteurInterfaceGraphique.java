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
	private final JPanel menaceA_2 = new JPanel();
	private final JPanel menaceA_3 = new JPanel();


	@Override
	public void onEvent(IncendieEvent inc_event) {
		// TODO Auto-generated method stub
		liste_event.add(inc_event);
		
	}

	@Override
	public void onEvent(GazEvent gaz_event) {
		// TODO Auto-generated method stub
		liste_event.add(gaz_event);
		System.out.println(gaz_event);
		
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
		panelB.setBounds(426, 70, 350, 458);
		
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
		
		JPanel menaceA_1 = new JPanel();
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
		JTextField ano1_text = new JTextField();
		ano1_text.setBounds(10, 10, 300, 115);
		ano1_text.setText(liste_ano.getListe_ano_A1());
		menaceA_1.add(ano1_text);
		ano1_text.setVisible(false);
		menaceA_2.setLayout(null);
		
		JTextArea ano2_text = new JTextArea();
		ano2_text.setBounds(10, 10, 300, 115);
		ano2_text.setText(liste_ano.toString());
		menaceA_2.add(ano2_text);
		ano2_text.setVisible(false);
		menaceA_3.setLayout(null);
		
		JTextArea ano3_text = new JTextArea();
		ano3_text.setBounds(10, 10, 300, 115);
		ano3_text.setText(liste_ano.toString());
		menaceA_3.add(ano3_text);
		ano3_text.setVisible(false);
		
		JButton Afficher_elementB = new JButton("Afficher la liste");
		Afficher_elementB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panelA.setLayout(null);
		menaceA_2.setBackground(Color.ORANGE);
		menaceA_2.setBounds(10, 176, 320, 135);
		
		panelA.add(menaceA_2);
		menaceA_3.setBackground(Color.RED);
		menaceA_3.setBounds(10, 323, 320, 135);
		
		panelA.add(menaceA_3);
		
		
		JButton Afficher_elementA = new JButton("Afficher la liste");
		Afficher_elementA.setBounds(115, 0, 101, 21);
		panelA.add(Afficher_elementA);
		Afficher_elementA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(liste_ano);
				if (liste_ano.getListe_ano_A2().isEmpty() && liste_ano.getListe_ano_A3().isEmpty()) {
					ano1_text.setVisible(true);
				}
				if (liste_ano.getListe_ano_A1().isEmpty() && liste_ano.getListe_ano_A3().isEmpty()) {
					ano2_text.setVisible(true);
				}
				if (liste_ano.getListe_ano_A1().isEmpty() && liste_ano.getListe_ano_A2().isEmpty()) {
					ano3_text.setVisible(true);
				}
				
				
				
			}
		});
		
		
		
		

		GroupLayout gl_panelB = new GroupLayout(panelB);
		gl_panelB.setHorizontalGroup(
			gl_panelB.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelB.createSequentialGroup()
					.addContainerGap(127, Short.MAX_VALUE)
					.addComponent(Afficher_elementB)
					.addGap(122))
		);
		gl_panelB.setVerticalGroup(
			gl_panelB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelB.createSequentialGroup()
					.addComponent(Afficher_elementB)
					.addContainerGap(437, Short.MAX_VALUE))
		);
		panelB.setLayout(gl_panelB);
		

	}
}

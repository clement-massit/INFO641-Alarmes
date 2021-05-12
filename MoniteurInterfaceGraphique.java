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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class MoniteurInterfaceGraphique implements GazEventListener, IncendieEventListener, RadiationEventListener{
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();
	private JFrame frame;


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
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panelA = new JPanel();
		panelA.setBounds(20, 70, 200, 300);
		
		JPanel panelB = new JPanel();
		panelB.setBounds(500, 70, 200, 300);
		
		JLabel gestion_moniteur = new JLabel("Gestion des moniteurs");
		gestion_moniteur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gestion_moniteur.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gestion_moniteur, BorderLayout.NORTH);
		
		JLabel moniteurA = new JLabel("Moniteur A");
		moniteurA.setBounds(10, 37, 261, 22);
		moniteurA.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel moniteurB = new JLabel("Moniteur B");
		moniteurB.setBounds(476, 38, 250, 22);
		moniteurB.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JPanel menaceA_1 = new JPanel();
		menaceA_1.setBackground(Color.CYAN);
		menaceA_1.setBounds(10, 45, 180, 105);
		panelA.add(menaceA_1);
		menaceA_1.setLayout(null);
		
		
		
		panel.add(moniteurA);
		panel.add(moniteurB);
		panel.add(panelA);
		panel.add(panelB);
		
		JTextArea ano_text = new JTextArea();
		ano_text.setBounds(10, 10, 160, 85);
		ano_text.setText(liste_ano.toString());
		menaceA_1.add(ano_text);
		ano_text.setVisible(false);
		
		JButton Afficher_elementB = new JButton("Afficher la liste");
		Afficher_elementB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		JButton Afficher_elementA = new JButton("Afficher la liste");
		Afficher_elementA.setBounds(49, 0, 101, 21);
		Afficher_elementA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ano_text.setVisible(true);
				
				
			}
		});
		panelA.setLayout(null);
		panelA.add(Afficher_elementA);
		
		
		
		

		GroupLayout gl_panelB = new GroupLayout(panelB);
		gl_panelB.setHorizontalGroup(
			gl_panelB.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelB.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addComponent(Afficher_elementB)
					.addGap(43))
		);
		gl_panelB.setVerticalGroup(
			gl_panelB.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelB.createSequentialGroup()
					.addContainerGap()
					.addComponent(Afficher_elementB)
					.addContainerGap(269, Short.MAX_VALUE))
		);
		panelB.setLayout(gl_panelB);
		

	}
}

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.JList;


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
		frame.setResizable(false);
		frame.setAlwaysOnTop(true);
		frame.setBounds(480, 40, 800, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panelA = new JPanel();
		panelA.setBounds(20, 70, 340, 535);
		
		JPanel panelB = new JPanel();
		panelB.setBounds(426, 70, 340, 535);
		
		JLabel gestion_moniteur = new JLabel("Gestion des moniteurs");
		gestion_moniteur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gestion_moniteur.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(gestion_moniteur, BorderLayout.NORTH);
		
		JPanel menaceA_1 = new JPanel();
		JPanel menaceA_2 = new JPanel();
		JPanel menaceA_3 = new JPanel();
		JPanel menaceB_1 = new JPanel();
		JPanel menaceB_2 = new JPanel();
		JPanel menaceB_3 = new JPanel();
		
		
		JLabel moniteurA = new JLabel("Moniteur A");
		moniteurA.setBounds(10, 37, 350, 22);
		moniteurA.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel moniteurB = new JLabel("Moniteur B");
		moniteurB.setBounds(426, 37, 350, 22);
		moniteurB.setHorizontalAlignment(SwingConstants.CENTER);
		moniteurB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		panel.add(moniteurA);
		panel.add(moniteurB);
		panel.add(panelA);
		panel.add(panelB);
		
		
		menaceA_1.setBackground(Color.YELLOW);
		menaceA_1.setBounds(10, 41, 320, 135);
		


		menaceA_2.setBackground(Color.ORANGE);
		menaceA_2.setBounds(10, 217, 320, 135);
		
		menaceA_3.setBackground(Color.RED);
		menaceA_3.setBounds(10, 393, 320, 135);
		
		menaceB_1.setBackground(Color.YELLOW);
		menaceB_1.setBounds(10, 41, 320, 135);
		
		menaceB_2.setBackground(Color.ORANGE);
		menaceB_2.setBounds(10, 217, 320, 135);
		
		menaceB_3.setBackground(Color.RED);
		menaceB_3.setBounds(10, 393, 320, 135);
		
		
		panelA.add(menaceA_1);
		panelA.add(menaceA_2);
		panelA.add(menaceA_3);
		panelB.add(menaceB_1);
		panelB.add(menaceB_2);
		panelB.add(menaceB_3);
		
		
		
		
		
		DefaultListModel lA1 = liste_ano.getListe_txt_ano_A1();
		DefaultListModel lA2 = liste_ano.getListe_txt_ano_A2();
		DefaultListModel lA3 = liste_ano.getListe_txt_ano_A3();
		DefaultListModel lB1 = liste_ano.getListe_txt_ano_B1();
		DefaultListModel lB2 = liste_ano.getListe_txt_ano_B2();
		DefaultListModel lB3 = liste_ano.getListe_txt_ano_B3();
		
		JList listA1 = new JList(lA1);
		listA1.setBackground(Color.YELLOW);
		menaceA_1.add(listA1);
		JList listA2 = new JList(lA2);
		listA2.setBackground(Color.ORANGE);
		menaceA_2.add(listA2);
		JList listA3 = new JList(lA3);
		listA3.setBackground(Color.RED);
		menaceA_3.add(listA3);
		JList listB1 = new JList(lB1);
		listB1.setBackground(Color.YELLOW);
		menaceB_1.add(listB1);
		JList listB2 = new JList(lB2);
		listB2.setBackground(Color.ORANGE);
		menaceB_2.add(listB2);
		JList listB3 = new JList(lB3);
		listB3.setBackground(Color.RED);
		menaceB_3.add(listB3);
				
		panelA.setLayout(null);
		panelB.setLayout(null);
		
		
				
		////////////////////	BOUTONS TRAITER		/////////////////////////////////
		JButton btn_traiter_A1 = new JButton("Afficher");
		btn_traiter_A1.setBounds(245, 20, 85, 21);
		panelA.add(btn_traiter_A1);
		
		JButton btn_traiter_A2 = new JButton("Afficher");
		btn_traiter_A2.setBounds(245, 196, 85, 21);
		panelA.add(btn_traiter_A2);
		
		JButton btn_traiter_A3 = new JButton("Afficher");
		btn_traiter_A3.setBounds(245, 372, 85, 21);
		panelA.add(btn_traiter_A3);
		
		JButton btn_traiter_B1 = new JButton("Afficher");
		btn_traiter_B1.setBounds(245, 20, 85, 21);
		panelB.add(btn_traiter_B1);
						
		JButton btn_traiter_B2 = new JButton("Afficher");
		btn_traiter_B2.setBounds(245, 196, 85, 21);
		panelB.add(btn_traiter_B2);
				
		JButton btn_traiter_B3 = new JButton("Afficher");
		btn_traiter_B3.setBounds(245, 372, 85, 21);
		panelB.add(btn_traiter_B3);
		
		JButton ok = new JButton("OK");
		
		
		
	

		////////////////////	FRAME & LABEL INFORMATIONS POUR LES ERREURS		/////////////////////////////////
		JFrame infos = new JFrame("INFORMATIONS");
		JLabel informations = new JLabel("Vous avez déjà supprimé l'anomalie sur ce moniteur");
		infos.add(ok);
		ok.setVisible(true);
		
		
		informations.setFont(new Font("Tahoma", Font.ITALIC, 14));
		informations.setForeground(Color.RED);
		informations.setHorizontalAlignment(SwingConstants.CENTER);
		infos.getContentPane().add(informations, BorderLayout.CENTER);
		
		infos.setResizable(false);
		infos.setAlwaysOnTop(true);
		infos.setLocationRelativeTo(null);
		infos.setSize(500, 200);;
		infos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		////////////////////	ACTION PERFORMED SUR LES BOUTONS TRAITER 	/////////////////////////////////
		btn_traiter_A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String hash_code = (String) listA1.getSelectedValue();
					int id = Integer.parseInt(hash_code);
					
					liste_ano.display_selected_anomalie(id, 1);
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}				
			}
		});
		
		btn_traiter_A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lA2.remove(0);
					infos.dispose();
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}
			}
		});
		
		btn_traiter_A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lA3.remove(0);
					infos.dispose();
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}
			}
		});
		
		btn_traiter_B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lB1.remove(0);
					infos.dispose();
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}
			}
		});
		
		btn_traiter_B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lB2.remove(0);
					infos.dispose();
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}
			}
		});
		
		btn_traiter_B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lB3.remove(0);
					infos.dispose();
					
				} catch (Exception e2) {
					infos.setVisible(true);
					
				}
			}
		});
		
		
		
		

	}


	
}

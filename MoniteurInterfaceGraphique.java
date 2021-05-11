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
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MoniteurInterfaceGraphique extends InterfaceGenEvent implements GazEventListener, IncendieEventListener, RadiationEventListener{
	private Collection<AnomalieEvent> liste_event =  new ArrayList<AnomalieEvent>();
	private JFrame frame;
	private JFrame moniteur;
	
	public void display_moniteur() {
		System.out.println(liste_event);
	}

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
	public static void Moniteur() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoniteurInterfaceGraphique window = new MoniteurInterfaceGraphique();
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
	public MoniteurInterfaceGraphique() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 750, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Gestion des moniteurs");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Moniteur A");
		lblNewLabel_1.setBounds(10, 37, 261, 22);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Moniteur B");
		lblNewLabel_2.setBounds(476, 38, 250, 22);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 70, 200, 300);
		
		panel.add(panel_1);
		
		JButton Afficher_element = new JButton("Afficher la liste");
		
		JTabbedPane folder_1 = new JTabbedPane(JTabbedPane.TOP);
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(44)
					.addComponent(Afficher_element)
					.addContainerGap(55, Short.MAX_VALUE))
				.addComponent(folder_1, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(Afficher_element)
					.addGap(39)
					.addComponent(folder_1, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(500, 70, 200, 300);
		panel.add(panel_2);
		panel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		JButton Afficher_element_1 = new JButton("Afficher la liste");
		
		JTabbedPane folder_2 = new JTabbedPane(JTabbedPane.BOTTOM);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(56, Short.MAX_VALUE)
					.addComponent(Afficher_element_1)
					.addGap(43))
				.addComponent(folder_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(Afficher_element_1)
					.addGap(33)
					.addComponent(folder_2, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
		);
		
		folder_1.setVisible(false);
		Afficher_element.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				folder_1.setVisible(true);
				
				showMoniteurA();
			}
		});
		
		
		panel_2.setLayout(gl_panel_2);
		folder_2.setVisible(false);
		Afficher_element_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				folder_2.setVisible(true);
				showMoniteurB();
				 
			}
		});
		
		
	
		
		
	}
	
	
	private void showMoniteurA() {
		//frame.dispose();
		JFrame moniteurA = new JFrame();
	    //moniteurA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    moniteurA.setSize(600,400);
	    moniteurA.setLocationRelativeTo( null );
	    moniteurA.setVisible( true );
	    

		JPanel moniteurA_panel = new JPanel();
		moniteurA.getContentPane().add(moniteurA_panel, BorderLayout.CENTER);
		moniteurA_panel.setLayout(null);
	    
		JLabel MoniteurA = new JLabel("Moniteur A");
		MoniteurA.setBounds(10, 37, 261, 22);
		MoniteurA.setHorizontalAlignment(SwingConstants.CENTER);
		MoniteurA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		moniteurA_panel.add(MoniteurA);
		
		
		
		
		

	}
	private void showMoniteurB() {
		JFrame moniteurB;
		//frame.dispose();
		moniteurB = new JFrame();;
		//moniteurB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    moniteurB.setSize(600,400);
	    moniteurB.setLocationRelativeTo( null );
	    moniteurB.setVisible( true );  
	    
	    JPanel moniteurB_panel = new JPanel();
		moniteurB.getContentPane().add(moniteurB_panel, BorderLayout.CENTER);
		moniteurB_panel.setLayout(null);
	    
		JLabel MoniteurB = new JLabel("Moniteur B");
		MoniteurB.setBounds(10, 37, 261, 22);
		MoniteurB.setHorizontalAlignment(SwingConstants.CENTER);
		MoniteurB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		moniteurB_panel.add(MoniteurB);
		
		System.out.println(liste_event);
		for (AnomalieEvent event1 : liste_event) {
			JLabel event = new JLabel(event1.toString());
			
		}
	    

	}
}

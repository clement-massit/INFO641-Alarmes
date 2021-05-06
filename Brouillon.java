import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Brouillon{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Brouillon window = new Brouillon();
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
	public Brouillon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		String[] bat = {"Bâtiment A", "Bâtiment B", "Bâtiment C"};
		panel.setLayout(null);
		JComboBox comboBox = new JComboBox(bat);
		comboBox.setBounds(73, 6, 92, 20);
		panel.add(comboBox);
		
		String[] anomalie = {"Gaz", "Incendie", "Radiation"};
		JComboBox comboBox_1 = new JComboBox(anomalie);
		comboBox_1.setBounds(175, 6, 87, 20);
		panel.add(comboBox_1);
		
		String[] level = {"1", "2", "3"};
		JComboBox comboBox_2 = new JComboBox(level);
		comboBox_2.setBounds(272, 6, 55, 20);
		panel.add(comboBox_2);
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
				
				if(comboBox_1.getSelectedItem().toString() == "Gaz") {
					GazEventSource gaz_source = new GazEventSource();
					AnomalieEvent anomalie_gaz = new GazEvent(gaz_source);
					gaz_source.addListener(ecouteur1);
					gaz_source.genEvent();
				}
				if(comboBox_1.getSelectedItem().toString() == "Incendie") {
					IncendieEventSource incendie_source = new IncendieEventSource();
					AnomalieEvent anomalie_incendie = new IncendieEvent(incendie_source);
					incendie_source.addListener(ecouteur1);
					incendie_source.genEvent();
				}
				if(comboBox_1.getSelectedItem().toString() == "Radiation") {
					RadiationEventSource radiation_source = new RadiationEventSource();
					AnomalieEvent anomalie_radiation = new RadiationEvent(radiation_source);
					radiation_source.addListener(ecouteur1);
					radiation_source.genEvent();
				}
				
			}
		});
		btnAfficher.setBounds(159, 51, 120, 23);
		panel.add(btnAfficher);		
	}

}

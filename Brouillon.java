import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

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
		frame.setBounds(100, 100, 480, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		String[] bat = {"Bâtiment A", "Bâtiment B", "Bâtiment C"};
		panel.setLayout(null);
		JComboBox comboBox = new JComboBox(bat);
		comboBox.setBounds(120, 83, 92, 20);
		
		
		String[] anomalie = {"Gaz", "Incendie", "Radiation"};
		JComboBox comboBox_1 = new JComboBox(anomalie);
		comboBox_1.setBounds(120, 35, 92, 20);
		panel.add(comboBox_1);
		
		String[] level = {"1", "2", "3"};
		JComboBox comboBox_2 = new JComboBox(level);
		comboBox_2.setBounds(250, 83, 55, 20);
		
		JButton btnGene = new JButton("G\u00E9nerer l'\u00E9venement");
		btnGene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = comboBox_1.getSelectedItem().toString();
				String localisation = comboBox.getSelectedItem().toString();
				int level = Integer.parseInt(comboBox_2.getSelectedItem().toString());
				
				Anomalie_Ecouteur ecouteur1 = new Anomalie_Ecouteur();
				
				if (type == "Gaz") {
					GazEventSource gaz_source = new GazEventSource(localisation);
					gaz_source.addListener(ecouteur1);
					gaz_source.genEvent(level);
				}
				else if (type == "Incendie") {
					IncendieEventSource inc_source = new IncendieEventSource(localisation);
					inc_source.addListener(ecouteur1);
					inc_source.genEvent(level);
				}
				else if (type == "Radiation") {
					RadiationEventSource rad_source = new RadiationEventSource(localisation);
					rad_source.addListener(ecouteur1);
					rad_source.genEvent(level);
				}
				
				
				
			}
		});
		btnGene.setBounds(147, 135, 172, 23);
		
		panel.add(comboBox);
		panel.add(comboBox_2);
		panel.add(btnGene);
		comboBox.setVisible(false);
		comboBox_2.setVisible(false);
		btnGene.setVisible(false);
		
		JButton BtnType = new JButton("Valider le type");
		BtnType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				comboBox_2.setVisible(true);
				btnGene.setVisible(true);
			}
		});
		BtnType.setBounds(250, 34, 131, 23);
		panel.add(BtnType);
		
		
		
	}
}

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceGraphique extends JFrame, Main{
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	
  public InterfaceGraphique(){
	  
	
    this.setTitle("TEST");
    this.setSize(850, 600);
    this.setLocationRelativeTo(null);  
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    String[] bat = {"Bâtiment A", "Bâtiment B", "Bâtiment C"};
	JComboBox Batiments = new JComboBox(bat);
	
	String[] anomalie = {"Gaz", "Incendie", "Radiation"};
	JComboBox Anomalie = new JComboBox(anomalie);
    
	String[] level = {"1", "2", "3"};
	JComboBox Level = new JComboBox(level);
	
	JButton btnNewButton = new JButton("Afficher");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	

	pan.add(Batiments);
	pan.add(Anomalie);
	pan.add(Level);
	pan.add(bouton);
	pan.add(btnNewButton);
	
	this.setContentPane(pan);
    this.setVisible(true);
    
    
	
    
    
    
  }
 
  
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;



public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}
	

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 33, 394, 247);
		getContentPane().add(textArea);
		
		
		
		
		
		
		House h1 = new House(1995,120);
		House h2 = new House(1999,170);
		House h3 = new House(2010,150);

		
	House[] MyHouse = new House[10];
	
	MyHouse[0] = h1;
	MyHouse[1] = h2;
	MyHouse[2] = h3;
		
	
	for(int i = 0; i < MyHouse.length; i++){
		if(MyHouse[i] !=null){
			
			int tid = MyHouse[i].getYear();
			int stor = MyHouse[i].getSize();
			textArea.append("Ett hus är byggt "+tid+" som är "+stor+" kvm stort." + "\n");
			
		}
	}
		
	textArea.append("totalt antal hus:" + House.getNbrHouses());
	
	}

}

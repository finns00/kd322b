
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;


public class Zoo extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animalZoo;
	
	private JTextArea zooArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zoo frame = new Zoo();
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
	public Zoo() {
		
		animalZoo = new ArrayList<Animal>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		zooArea = new JTextArea();
		zooArea.setBounds(10, 11, 414, 240);
		contentPane.add(zooArea);
		
		animalZoo.add(new Dog("Jhon Khan", 19, true));
		animalZoo.add(new Dog("Ken Kon", 9, true));
		animalZoo.add(new Snake("Svan Sven", false));
		animalZoo.add(new Dog("Ping Pong", 12, false));
		animalZoo.add(new Dog("Poki Paki", 3, false));
		animalZoo.add(new Snake("Slim Slam", true));
		
		for(Animal x : animalZoo){
			
			zooArea.append(x.getInfo() + "\n");
			
		}
		
	}
}

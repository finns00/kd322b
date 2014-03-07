import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JTextPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WriteOut extends JFrame {

	private JPanel contentPane;
	private JTextField HumanField;
	private JTextField DogField;
	private JTextPane InfoField;
	private JTextPane ErrorField;
	
	private Dog dog;
	private Human human;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WriteOut frame = new WriteOut();
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
	public WriteOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String newHuman = "";
				
				
				if(HumanField.getText().length() >= 4){
				
					newHuman = HumanField.getText();
					human = new Human(newHuman);
				} else if(HumanField.getText().length() <= 3){
					ErrorField.setText("Måste ha mer än 3 bokstäver för att få skapa människa");
				}
				
				
				
			}
		});
		btnNewHuman.setBounds(123, 52, 89, 23);
		contentPane.add(btnNewHuman);
		
		
		
		
		
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if(human != null){
				
				String newDog = "";
				
				newDog = DogField.getText();
				dog = new Dog(newDog);
				
				human.buyDog(dog);
				
			}else{
				
				ErrorField.setText("Du måste ha en människa för att skapa en hund");
				
			 }
			}
		});
		btnBuyDog.setBounds(123, 96, 89, 23);
		contentPane.add(btnBuyDog);
		
		
		
		
		
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human != null){
				
					InfoField.setText(human.getInfo());
				
				}else{
					
					ErrorField.setText("error");
					
				}
				
				
			}
		});
		btnPrintInfo.setBounds(123, 140, 89, 23);
		contentPane.add(btnPrintInfo);
		
		
		
		
		
		
		
		HumanField = new JTextField();
		HumanField.setBounds(10, 53, 86, 20);
		contentPane.add(HumanField);
		HumanField.setColumns(10);
		
		DogField = new JTextField();
		DogField.setBounds(10, 97, 86, 20);
		contentPane.add(DogField);
		DogField.setColumns(10);
		
		InfoField = new JTextPane();
		InfoField.setBounds(10, 185, 348, 81);
		contentPane.add(InfoField);
		
		ErrorField = new JTextPane();
		ErrorField.setBounds(10, 277, 348, 52);
		contentPane.add(ErrorField);
	}
}

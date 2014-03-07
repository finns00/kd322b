import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField ColorField;
	private JTextField SizeField;
	private JTextField PriceField;
	
	private JTextArea textArea;
	
	BikeStore bikeStore = new BikeStore();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		bikeStore.addBike("blue", 10, 4000);
		bikeStore.addBike("red", 11, 3000);
		bikeStore.addBike("blue", 12, 2000);
		bikeStore.addBike("yellow", 13, 1000);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 11, 315, 240);
		contentPane.add(textArea);
		
		textArea.setText(bikeStore.getAllBikes());
		
		ColorField = new JTextField();
		ColorField.setBounds(335, 65, 86, 20);
		contentPane.add(ColorField);
		ColorField.setColumns(10);
		
		SizeField = new JTextField();
		SizeField.setBounds(335, 96, 86, 20);
		contentPane.add(SizeField);
		SizeField.setColumns(10);
		
		PriceField = new JTextField();
		PriceField.setBounds(335, 129, 86, 20);
		contentPane.add(PriceField);
		PriceField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int size;
				int price;
				
				try{
					
					size = Integer.parseInt(SizeField.getText());
					price = Integer.parseInt(PriceField.getText());
					bikeStore.addBike(ColorField.getText(), size, price);
					textArea.setText(bikeStore.getAllBikes());
						
				}
				catch(NumberFormatException x){
					
				}
				
			}
			
		});
		btnNewButton.setBounds(335, 160, 89, 23);
		contentPane.add(btnNewButton);
	}
}

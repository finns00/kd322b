import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Panel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class FotbollSida2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField txtIdkFotboll;
	private JTextField txtPersonnummer;
	private JTextField txtAdressGtagatanb;
	private JTextField txtTelefon;
	private JTextField txtEpostJuliastengmailse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FotbollSida2 frame = new FotbollSida2();
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
	public FotbollSida2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArlov = new JMenu("Arkiv");
		menuBar.add(mnArlov);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArlov.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArlov.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 52, 104, 229);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Joe"},
				{"Chris"},
				{"Maria"},
				{"Julia"},
				{"Pochi"},
				{"Sasuke"},
				{"Ponyta"},
				{"Sven"},
				{"Alex"},
				{"Axel"},
				{"Alax"},
				{"Exel"},
				{"Pocky"},
				{"Ponny"},
				{null},
			},
			new String[] {
				"Medlemmar"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblJuliaStenberg = new JLabel("Julia Stenberg");
		lblJuliaStenberg.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJuliaStenberg.setBounds(212, 86, 122, 30);
		contentPane.add(lblJuliaStenberg);
		
		txtIdkFotboll = new JTextField();
		txtIdkFotboll.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtIdkFotboll.setText("IDK Fotboll");
		txtIdkFotboll.setBounds(124, 11, 104, 30);
		contentPane.add(txtIdkFotboll);
		txtIdkFotboll.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Tonny\\Downloads\\for work\\Namnl\u00F6s2.png"));
		lblNewLabel.setBounds(134, 52, 68, 83);
		contentPane.add(lblNewLabel);
		
		txtPersonnummer = new JTextField();
		txtPersonnummer.setText("Personnummer: 1934025642");
		txtPersonnummer.setBounds(143, 140, 171, 20);
		contentPane.add(txtPersonnummer);
		txtPersonnummer.setColumns(10);
		
		txtAdressGtagatanb = new JTextField();
		txtAdressGtagatanb.setText("Adress: G\u00F6tagatan 2B");
		txtAdressGtagatanb.setBounds(141, 171, 173, 20);
		contentPane.add(txtAdressGtagatanb);
		txtAdressGtagatanb.setColumns(10);
		
		txtTelefon = new JTextField();
		txtTelefon.setText("Telefon: 0731-298342");
		txtTelefon.setBounds(141, 202, 173, 20);
		contentPane.add(txtTelefon);
		txtTelefon.setColumns(10);
		
		txtEpostJuliastengmailse = new JTextField();
		txtEpostJuliastengmailse.setText("E-post: Julia.Sten@gmail.se");
		txtEpostJuliastengmailse.setBounds(141, 233, 173, 20);
		contentPane.add(txtEpostJuliastengmailse);
		txtEpostJuliastengmailse.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(284, 257, 89, 23);
		contentPane.add(btnSpara);
		
		textField = new JTextField();
		textField.setBounds(125, 52, 248, 229);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Tonny\\Downloads\\fotbollsplan_1193088367_9575552.gif"));
		lblNewLabel_1.setBounds(-35, 0, 448, 291);
		contentPane.add(lblNewLabel_1);
	}
}

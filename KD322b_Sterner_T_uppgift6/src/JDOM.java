import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.JLabel;
import javax.swing.JComboBox;

public class JDOM extends JFrame {

	private JPanel contentPane;

	private Document doc;

	private ArrayList<Program> programsList = new ArrayList<Program>();

	private MyCarvas myCarvas;

	private Program program;

	private int wom;
	private int maw;

	// private MyCarvas myCarvas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDOM frame = new JDOM();
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
	public JDOM() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCarvas = new MyCarvas();
		myCarvas.setBounds(0, 99, 434, 163);
		contentPane.add(myCarvas);

		// läger in hela XML filen in i doc
		doc = openXmlFile("ht2013_antagning.xml");

		JLabel NewLabel = new JLabel("New label");
		NewLabel.setBounds(34, 11, 345, 14);
		contentPane.add(NewLabel);

		String LabelNew = doc.getDocumentElement().getNodeName();

		NewLabel.setText(LabelNew);

		JLabel NewLabel2 = new JLabel("<dynamic>");
		NewLabel2.setBounds(34, 27, 345, 14);
		contentPane.add(NewLabel2);

		// laddar in alla program in i programList
		programsList = loadAllPrograms();

		int LabelNew2 = programsList.size();

		NewLabel2.setText(String.valueOf(LabelNew2));

		JComboBox<Program> comboBox = new JComboBox();
		comboBox.setBounds(34, 52, 345, 20);
		contentPane.add(comboBox);

		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		comboBox.addItemListener(new ItemChangeListener());

	}

	class ItemChangeListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub

			if (event.getStateChange() == ItemEvent.SELECTED) {

				Program program = (Program) event.getItem();

				myCarvas.updateValues(program.getWomen(), program.getMen());

			}

		}

	}

	private Document openXmlFile(String file) {
		Document doc = null;
		try {
			File fXmlFile = new File(file);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();

		// Hämtar alla program
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i < programs.getLength(); i++) {

			// Gör om varje nod i listan till ett element
			Node node = programs.item(i);
			Element elm = (Element) node;

			// Hämta data från elementet
			String name = elm.getElementsByTagName("name").item(0)
					.getTextContent();
			String code = elm.getElementsByTagName("code").item(0)
					.getTextContent();
			int women = Integer.parseInt(elm.getElementsByTagName("women")
					.item(0).getTextContent());
			int men = Integer.parseInt(elm.getElementsByTagName("men").item(0)
					.getTextContent());

			Program program = new Program(name, code, women, men);

			this.wom = women;
			this.maw = men;

			output.add(program);
		}

		return output;

	}

}

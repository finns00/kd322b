
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;


public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private Calculator myCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		
		myCalculator = new Calculator();
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button2.setBounds(86, 124, 58, 41);
		contentPane.add(button2);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button1.setBounds(10, 124, 58, 41);
		contentPane.add(button1);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button3.setBounds(164, 124, 58, 41);
		contentPane.add(button3);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button6.setBounds(164, 180, 58, 41);
		contentPane.add(button6);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button9.setBounds(164, 228, 58, 41);
		contentPane.add(button9);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button8.setBounds(86, 228, 58, 41);
		contentPane.add(button8);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button5.setBounds(86, 176, 58, 41);
		contentPane.add(button5);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button4.setBounds(10, 176, 58, 41);
		contentPane.add(button4);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button7.setBounds(10, 228, 58, 41);
		contentPane.add(button7);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
				textField.setText("x");
			}
		});
		btnX.setBounds(242, 124, 58, 41);
		contentPane.add(btnX);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				textField.setText("-");
			}
		});
		minus.setBounds(242, 176, 58, 41);
		contentPane.add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				textField.setText("+");
			}
		});
		plus.setBounds(242, 232, 58, 89);
		contentPane.add(plus);
		
		JButton likamed = new JButton("=");
		likamed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		likamed.setBounds(164, 280, 58, 41);
		contentPane.add(likamed);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button0.setBounds(10, 280, 58, 41);
		contentPane.add(button0);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 290, 102);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

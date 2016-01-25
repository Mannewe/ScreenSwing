package lecture_classes_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	Calculator myCalculator;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 618);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		JButton button = new JButton("9");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 70));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button.setBounds(29, 31, 246, 235);
		contentPane.add(button);
		
		JButton button_1 = new JButton("+");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 71));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				textField.setText("+");
			}
		});
		button_1.setBounds(330, 31, 246, 235);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("=");
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 71));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(627, 31, 232, 235);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 99));
		textField.setBounds(29, 300, 830, 272);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

package lecture_classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class FrogGui extends JFrame {

	private JPanel contentPane;
	private Frog[] myFrogs;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrogGui frame = new FrogGui();
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
	public FrogGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//skapat en groda med hjälp av Frog-klassen
		//Age 2 m
		//Size 10 cm
		//Name Björn
		Frog frog1 = new Frog(2,10,"Björn");
		
		//Skapat en till groda utifrån samma klass med andra egenskaper
		//Age 12 m
		//Size 30 cm
		//Name Gammelgrodden
		Frog frog2 = new Frog(12, 30, "Gammelgrodden");
		
		//Användning av Frog-klassens metoder
		int björnAge = frog1.getAge();
		int björnSize = frog1.getSize();
		String björnNamn = frog1.getName();
		
		//Array med 3 grodor
		myFrogs = new Frog[3];
		myFrogs[0] = new Frog(1,10,"Lasse");
		myFrogs[1] = new Frog(30,40,"Gandalf");
		myFrogs[2] = new Frog(10,2,"MiniJocke");
		
		//ArrayList
		ArrayList<Frog> frogArmy= new ArrayList<Frog>();
		int numberOfFrogs = 100;
		
		//lagt till 100 identiska grodor i ArrayListan
		for(int i = 0; i < numberOfFrogs; i++){
			frogArmy.add(new Frog(1,10,"Joel"));
		}
		
		textField1 = new JTextField();
		textField1.setText(myFrogs[1].getName() +" "+ myFrogs[2].getName());
		contentPane.add(textField1, BorderLayout.CENTER);
		textField1.setColumns(10);
	}

}

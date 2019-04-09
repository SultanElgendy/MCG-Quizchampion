import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblMcgQuizchampion;
	private JButton btnSpieler_2;
	private JButton btnSpieler_3;
	private JButton btnSpieler_1;
	private JButton btnLaden;
	private JButton btnStart;
	private JTextField txtName_1;
	private JTextField txtName_2;
	private JTextField txtName_3;
	private JLabel lblRegeln;
	private JTextPane txtpnSalamGenosse;
	private final Action action = new SwingAction();
	private final ButtonGroup Spielerzahl = new ButtonGroup();
	private final JRadioButton rdbtnEinfach = new JRadioButton("Einfach");
	private JRadioButton rdbtnMittel;
	private JRadioButton rdbtnSchwer;
	private JLabel lblSchwierigkeitsgrad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
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
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMcgQuizchampion = new JLabel("MCG QuizChampion");
		lblMcgQuizchampion.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMcgQuizchampion.setBounds(389, 11, 252, 68);
		contentPane.add(lblMcgQuizchampion);
		
		btnSpieler_2 = new JButton("Spieler 2");
		Spielerzahl.add(btnSpieler_2);
		btnSpieler_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerZahl(2);
			}
		});
		btnSpieler_2.setForeground(Color.RED);
		btnSpieler_2.setBounds(101, 124, 89, 23);
		contentPane.add(btnSpieler_2);
		
		btnSpieler_3 = new JButton("Spieler 3");
		Spielerzahl.add(btnSpieler_3);
		btnSpieler_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Hauptklasse.setSpielerZahl(3);
			}
		});
		btnSpieler_3.setForeground(Color.RED);
		btnSpieler_3.setBounds(101, 158, 89, 23);
		contentPane.add(btnSpieler_3);
		
		btnSpieler_1 = new JButton("Spieler 1");
		Spielerzahl.add(btnSpieler_1);
		btnSpieler_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Hauptklasse.setSpielerZahl(1);
			}
		});
		btnSpieler_1.setForeground(Color.RED);
		btnSpieler_1.setBounds(101, 90, 89, 23);
		contentPane.add(btnSpieler_1);
		
		btnLaden = new JButton("LADEN");
		btnLaden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLaden.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLaden.setBounds(101, 411, 143, 33);
		contentPane.add(btnLaden);
		
		btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnStart.setBounds(101, 468, 143, 33);
		contentPane.add(btnStart);
		
		txtName_1 = new JTextField();
		txtName_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerName1(txtName_1.getText());
			}
		});
		txtName_1.setText("Name 1");
		txtName_1.setBounds(200, 91, 96, 20);
		contentPane.add(txtName_1);
		txtName_1.setColumns(10);
		
		txtName_2 = new JTextField();
		txtName_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hauptklasse.setSpielerName2(txtName_2.getText());
			}
		});
		txtName_2.setText("Name 2");
		txtName_2.setBounds(200, 125, 96, 20);
		contentPane.add(txtName_2);
		txtName_2.setColumns(10);
		
		txtName_3 = new JTextField();
		txtName_3.setText("Name 3");
		txtName_3.setBounds(200, 159, 96, 20);
		contentPane.add(txtName_3);
		txtName_3.setColumns(10);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegeln.setBounds(355, 90, 89, 23);
		contentPane.add(lblRegeln);
		
		txtpnSalamGenosse = new JTextPane();
		txtpnSalamGenosse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnSalamGenosse.setBounds(355, 124, 391, 110);
		contentPane.add(txtpnSalamGenosse);
		rdbtnEinfach.setBounds(101, 234, 177, 31);
		contentPane.add(rdbtnEinfach);
		
		rdbtnMittel = new JRadioButton("Mittel");
		rdbtnMittel.setBounds(101, 264, 109, 23);
		contentPane.add(rdbtnMittel);
		
		rdbtnSchwer = new JRadioButton("Schwer");
		rdbtnSchwer.setBounds(101, 290, 109, 23);
		contentPane.add(rdbtnSchwer);
		
		lblSchwierigkeitsgrad = new JLabel("Schwierigkeitsgrad");
		lblSchwierigkeitsgrad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSchwierigkeitsgrad.setBounds(99, 192, 152, 40);
		contentPane.add(lblSchwierigkeitsgrad);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

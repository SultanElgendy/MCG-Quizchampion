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
	private JLabel label;

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
		btnSpieler_2.setForeground(Color.RED);
		btnSpieler_2.setBounds(101, 206, 89, 23);
		contentPane.add(btnSpieler_2);
		
		btnSpieler_3 = new JButton("Spieler 3");
		btnSpieler_3.setForeground(Color.RED);
		btnSpieler_3.setBounds(101, 254, 89, 23);
		contentPane.add(btnSpieler_3);
		
		btnSpieler_1 = new JButton("Spieler 1");
		btnSpieler_1.setForeground(Color.RED);
		btnSpieler_1.setBounds(101, 159, 89, 23);
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
		txtName_1.setText("Name");
		txtName_1.setBounds(218, 162, 96, 20);
		contentPane.add(txtName_1);
		txtName_1.setColumns(10);
		
		txtName_2 = new JTextField();
		txtName_2.setText("Name");
		txtName_2.setBounds(218, 207, 96, 20);
		contentPane.add(txtName_2);
		txtName_2.setColumns(10);
		
		txtName_3 = new JTextField();
		txtName_3.setText("Name");
		txtName_3.setBounds(218, 255, 96, 20);
		contentPane.add(txtName_3);
		txtName_3.setColumns(10);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRegeln.setBounds(355, 90, 89, 23);
		contentPane.add(lblRegeln);
		
		label = new JLabel("\u00E4");
		label.setBackground(Color.BLACK);
		label.setBounds(324, 124, 348, 455);
		contentPane.add(label);
	}
}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class GUI_Kategorienwahl extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblWhleEineKategorie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategorienwahl frame = new GUI_Kategorienwahl();
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
	public GUI_Kategorienwahl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("KATEGORIE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(271, 161, 219, 49);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("KATEGORIE\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(271, 246, 219, 49);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("KATE\u00A7GORIE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(271, 326, 219, 49);
		contentPane.add(btnNewButton_2);
		
		lblWhleEineKategorie = new JLabel("w\u00E4hle eine Kategorie:");
		lblWhleEineKategorie.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWhleEineKategorie.setBounds(262, 52, 239, 49);
		contentPane.add(lblWhleEineKategorie);
	}
}

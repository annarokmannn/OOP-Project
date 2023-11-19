package currencyConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Homepage {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 668, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalc = new JButton("Scientific Calculator");
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalc.setBounds(54, 351, 183, 61);
		frame.getContentPane().add(btnCalc);
		
		JButton btnCurrency = new JButton("Currency Converter");
		btnCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currency cr = new currency();
				cr.frame.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnCurrency.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCurrency.setBounds(427, 351, 183, 61);
		frame.getContentPane().add(btnCurrency);
	}
}

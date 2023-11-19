package currencyConverter;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class currency {

	public JFrame frame;
	private JTextField txtAmount;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					currency window = new currency();
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
	public currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 153, 255));
		frame.setBounds(100, 100, 541, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 204));
		panel.setBounds(0, 0, 635, 100);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBounds(100, 23, 380, 42);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 35));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\pink money.jpg"));
		lblNewLabel_5.setBounds(0, 0, 524, 100);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(43, 165, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtAmount = new JTextField();
		txtAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAmount.setBounds(214, 157, 184, 32);
		frame.getContentPane().add(txtAmount);
		txtAmount.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(43, 213, 133, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(43, 264, 133, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"RM", "USD", "EUR", "JPY", "KRW", "SGD", "IDR", "TL"}));
		txtFrom.setBounds(214, 208, 184, 29);
		frame.getContentPane().add(txtFrom);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"RM", "USD", "EUR", "JPY", "KRW", "SGD", "IDR", "TL"}));
		txtTo.setBounds(214, 259, 184, 29);
		frame.getContentPane().add(txtTo);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		
		
		btnConvert.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double amount = Double.parseDouble(txtAmount.getText());
		        double convertedAmount = 0;

		        String fromCurrency = txtFrom.getSelectedItem().toString();
		        String toCurrency = txtTo.getSelectedItem().toString();

		        // Perform conversion based on selected currencies
		        if (fromCurrency.equals("RM")) {
		            switch (toCurrency) {
		                case "USD":
		                    convertedAmount = RM.toUSD(amount);
		                    break;
		                case "JPY":
		                    convertedAmount = RM.toJPY(amount);
		                    break;
		                case "KRW":
		                    convertedAmount = RM.toKRW(amount);
		                    break;
		                case "EUR":
		                    convertedAmount = RM.toEUR(amount);
		                    break;		 
		                case "IDR":
		                    convertedAmount = RM.toIDR(amount);
		                    break;		     
		                case "SGD":
		                    convertedAmount = RM.toSGD(amount);
		                    break;		
		                case "TL":
		                    convertedAmount = RM.toTL(amount);
		                    break;		                  
		            }
		        } else if (fromCurrency.equals("USD")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = USD.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = USD.toJPY(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = USD.toKRW(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = USD.toEUR(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = USD.toIDR(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = USD.toSGD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = USD.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("JPY")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = JPY.toRM(amount);
	                    break;
	                case "USD":
	                    convertedAmount = JPY.toUSD(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = JPY.toKRW(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = JPY.toEUR(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = JPY.toIDR(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = JPY.toSGD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = JPY.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("KRW")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = KRW.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = KRW.toJPY(amount);
	                    break;
	                case "USD":
	                    convertedAmount = KRW.toUSD(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = KRW.toEUR(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = KRW.toIDR(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = KRW.toSGD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = KRW.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("EUR")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = EUR.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = EUR.toJPY(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = EUR.toKRW(amount);
	                    break;
	                case "USD":
	                    convertedAmount = EUR.toUSD(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = EUR.toIDR(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = EUR.toSGD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = EUR.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("IDR")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = IDR.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = IDR.toJPY(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = IDR.toKRW(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = IDR.toEUR(amount);
	                    break;		 
	                case "USD":
	                    convertedAmount =IDR.toUSD(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = IDR.toSGD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = IDR.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("SGD")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = SGD.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = SGD.toJPY(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = SGD.toKRW(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = SGD.toEUR(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = SGD.toIDR(amount);
	                    break;		     
	                case "USD":
	                    convertedAmount = SGD.toUSD(amount);
	                    break;		
	                case "TL":
	                    convertedAmount = SGD.toTL(amount);
	                    break;		                  
		            }
		        } else if (fromCurrency.equals("TL")) {
		            switch (toCurrency) {
	                case "RM":
	                    convertedAmount = TL.toRM(amount);
	                    break;
	                case "JPY":
	                    convertedAmount = TL.toJPY(amount);
	                    break;
	                case "KRW":
	                    convertedAmount = TL.toKRW(amount);
	                    break;
	                case "EUR":
	                    convertedAmount = TL.toEUR(amount);
	                    break;		 
	                case "IDR":
	                    convertedAmount = TL.toIDR(amount);
	                    break;		     
	                case "SGD":
	                    convertedAmount = TL.toSGD(amount);
	                    break;		
	                case "USD":
	                    convertedAmount = TL.toUSD(amount);
	                    break;		                  
		            }
		        }
		        // Format and display the result
		        DecimalFormat decimalFormat = new DecimalFormat("#.##");
		        String formattedResult = decimalFormat.format(convertedAmount);
		        txtResult.setText(formattedResult);
		        txtResult.setForeground(Color.BLACK);
		    }
		});

		btnConvert.setBounds(203, 376, 119, 38);
		frame.getContentPane().add(btnConvert);
		
		JLabel lblNewLabel_4 = new JLabel("Amount :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(43, 316, 76, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResult.setBackground(new Color(255, 255, 255));
		txtResult.setForeground(new Color(0, 0, 0));
		txtResult.setBounds(214, 309, 184, 32);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(347, 378, 107, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAmount.setText("");
				txtResult.setText("");
			}
		});
		btnClear.setBounds(85, 377, 96, 36);
		frame.getContentPane().add(btnClear);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage hp = new Homepage();
				hp.frame.setVisible(true);
				
			}
		});
		btnBack.setBounds(10, 111, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}
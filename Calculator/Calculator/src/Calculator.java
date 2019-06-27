import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 252, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 211, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//-------------------Row1---------------------

		JButton btnarr = new JButton("←");
		btnarr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnarr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder strB=new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					backspace=strB.toString();
					textField.setText(backspace);
					
				}
			}
		});
		btnarr.setBounds(10, 54, 53, 50);
		frame.getContentPane().add(btnarr);
		
		JButton btnclr = new JButton("C");
		btnclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText(null);
			}
		});
		btnclr.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnclr.setBounds(66, 54, 49, 50);
		frame.getContentPane().add(btnclr);
		
		
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="%";
			}
		});
		btnper.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnper.setBounds(117, 53, 58, 50);
		frame.getContentPane().add(btnper);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnplus.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnplus);
		
		
		//-------------------Row2---------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
			
		});
		btnminus.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnminus);
		
		//---------------------Row3---------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber=textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn6);
	
		JButton btnmul = new JButton("*");
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnmul.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnmul);
		
		//-------------------Row4---------------------
		
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber=textField.getText()+btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(10, 222, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=textField.getText()+btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setBounds(66, 222, 50, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=textField.getText()+btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(122, 222, 50, 50);
				frame.getContentPane().add(btn3);
				
				JButton btndiv = new JButton("/");
				btndiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum=Double.parseDouble(textField.getText());
						textField.setText("");
						operations="/";
					}
				});
				btndiv.setBounds(178, 222, 50, 50);
				frame.getContentPane().add(btndiv);
				
				//---------------------Row4---------------
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String EnterNumber=textField.getText()+btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(10, 278, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btndot = new JButton(".");
				btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber=textField.getText()+btndot.getText();
						textField.setText(EnterNumber);
						
					}
				});
				btndot.setBounds(66, 278, 50, 50);
				frame.getContentPane().add(btndot);
				
				JButton btnpm = new JButton("±");
				btnpm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						double ops=Double.parseDouble(String.valueOf(textField.getText()));
						ops=ops *(-1);
						textField.setText(String.valueOf(ops));
					}
				});
				btnpm.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnpm.setBounds(122, 278, 50, 50);
				frame.getContentPane().add(btnpm);
				
				JButton btnequals = new JButton("=");
				btnequals.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnequals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					String answer;
					 secondnum=Double.parseDouble(textField.getText());
					 if(operations == "+") {
						 result=firstnum+secondnum;
						 answer=String.format("%.2f", result);
						 textField.setText(answer);
					 }else if(operations == "-"){
						 result=firstnum - secondnum;
						 answer=String.format("%.2f", result);
						 textField.setText(answer);
					 }
					 else if(operations == "*"){
						 result=firstnum * secondnum;
						 answer=String.format("%.2f", result);
						 textField.setText(answer);
					 }
					 else if(operations == "/"){
						 result=firstnum / secondnum;
						 answer=String.format("%.2f", result);
						 textField.setText(answer);
					 }
					
					 else if(operations == "%"){
						 result=firstnum % secondnum;
						 answer=String.format("%.2f", result);
						 textField.setText(answer);
					 }
					
					
					
					
					}
					
				});
				btnequals.setBounds(178, 278, 50, 50);
				frame.getContentPane().add(btnequals);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;


public class Example1 {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example1 window = new Example1();
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
	int sum=0;
	public Example1() {
		initialize();
	}

	private JTextField output;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setFont(new Font("Symath", Font.PLAIN, 11));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Memory card\\Kaptai Naval\\5.jpg"));
		frame.setBounds(490, 184, 336, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		input = new JTextField();
		input.setForeground(Color.BLACK);
		input.setBounds(25, 23, 278, 33);
		frame.getContentPane().add(input);
		input.setColumns(10);
		input.setText("");
		output = new JTextField();
		output.setBounds(25, 76, 278, 33);
		frame.getContentPane().add(output);
		output.setColumns(10);
		output.setText("0");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(336, 205, 35, -24);
		frame.getContentPane().add(btnNewButton);
		
		JButton one = new JButton("1");
		one.setFont(new Font("Tahoma", Font.PLAIN, 14));
		one.setForeground(Color.BLACK);
		one.setBackground(Color.CYAN);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			input.setText(input.getText()+"1");
			}
		});
		one.setBounds(25, 132, 60, 23);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.setFont(new Font("Tahoma", Font.PLAIN, 14));
		two.setBackground(Color.CYAN);
		two.setForeground(Color.BLACK);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"2");
			}
		});
		two.setBounds(95, 132, 60, 23);
		frame.getContentPane().add(two);
		
		JButton three = new JButton(" 3");
		three.setFont(new Font("Tahoma", Font.PLAIN, 14));
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"3");
			}
		});
		three.setForeground(Color.BLACK);
		three.setBackground(Color.CYAN);
		three.setBounds(165, 132, 60, 23);
		frame.getContentPane().add(three);
		
		JButton addition = new JButton(" +");
		addition.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addition.setForeground(Color.BLUE);
		addition.setBackground(Color.DARK_GRAY);
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"+");
			}
		});
		addition.setBounds(235, 132, 68, 23);
		frame.getContentPane().add(addition);
		
		JButton four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.PLAIN, 14));
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"4");
			}
		});
		four.setBackground(Color.CYAN);
		four.setForeground(Color.BLACK);
		four.setBounds(25, 166, 60, 23);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.PLAIN, 14));
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"5");
			}
		});
		five.setBackground(Color.CYAN);
		five.setForeground(Color.BLACK);
		five.setBounds(95, 166, 60, 23);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.PLAIN, 14));
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"6");
			}
		});
		six.setForeground(Color.BLACK);
		six.setBackground(Color.CYAN);
		six.setBounds(165, 166, 60, 23);
		frame.getContentPane().add(six);
		
		JButton substract = new JButton("-");
		substract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		substract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"-");
			}
		});
		substract.setForeground(Color.BLUE);
		substract.setBackground(Color.DARK_GRAY);
		substract.setBounds(235, 166, 68, 23);
		frame.getContentPane().add(substract);
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.PLAIN, 14));
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"7");
			}
		});
		seven.setBackground(Color.CYAN);
		seven.setForeground(Color.BLACK);
		seven.setBounds(25, 200, 60, 23);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"8");
			}
		});
		eight.setForeground(Color.BLACK);
		eight.setBackground(Color.CYAN);
		eight.setBounds(95, 200, 60, 23);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"9");
			}
		});
		nine.setForeground(Color.BLACK);
		nine.setBackground(Color.CYAN);
		nine.setBounds(165, 200, 60, 23);
		frame.getContentPane().add(nine);
		
		JButton multiply = new JButton("*");
		multiply.setFont(new Font("Tahoma", Font.PLAIN, 14));
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"*");
			}
		});
		multiply.setForeground(Color.BLUE);
		multiply.setBackground(Color.DARK_GRAY);
		multiply.setBounds(235, 200, 68, 23);
		frame.getContentPane().add(multiply);
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"0");
			}
		});
		zero.setForeground(Color.BLACK);
		zero.setBackground(Color.CYAN);
		zero.setBounds(25, 234, 60, 23);
		frame.getContentPane().add(zero);
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("Tahoma", Font.PLAIN, 14));
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText()+"/");
			}
		});
		divide.setBackground(Color.DARK_GRAY);
		divide.setForeground(Color.BLUE);
		divide.setBounds(235, 234, 68, 23);
		frame.getContentPane().add(divide);
		
		JButton equal = new JButton("=");
		equal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		equal.setForeground(Color.BLACK);
		equal.setBackground(Color.GREEN);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=input.getText();
				char[] ara=new char[1000];
				int l=s.length();
				ara=s.toCharArray();
				int j=0,sum=0,sum1=0,flag=0;
				char ch=0;
				for(int i=0;i<l;i++){
					if((ara[i]=='+'||ara[i]=='-'||ara[i]=='*'||ara[i]=='/'||i==l-1) && flag==0){
						ch=ara[i];
						flag=1;
						sum=sum1;
						sum1=0;
					}
				else if(ara[i]=='+'||ara[i]=='-'||ara[i]=='*'||ara[i]=='/'){
					if(ch=='+'){
						sum+=sum1;
						sum1=0;
						ch=ara[i];
					}
					else if(ch=='-'){
						sum-=sum1;
						sum1=0;
						ch=ara[i];
					}
					else if(ch=='*'){
						sum*=sum1;
						sum1=0;
						ch=ara[i];
					}
					else if(ara[i]=='/'){
						sum/=sum1;
						sum1=0;
						ch=ara[i];
						System.out.println(sum);
					}
				}
				else{
					sum1=sum1*10+(ara[i]-'0');
					if(i==l-1){
						if(ch=='+'){
							sum+=sum1;
						}
						else if(ch=='-'){
							sum-=sum1;
						}
						else if(ch=='*'){
							sum*=sum1;
						}
						else if(ara[i]=='/'){
							sum/=sum1;
						}
					}
				}
				}
				output.setText(Integer.toString(sum));
			}
			
		});
		output.setText("0");
		equal.setBounds(214, 276, 89, 33);
		frame.getContentPane().add(equal);
		
		JButton clear = new JButton("CLR");
		clear.setBackground(Color.CYAN);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				output.setText("0");
			}
		});
		clear.setFont(new Font("Tahoma", Font.PLAIN, 17));
		clear.setForeground(Color.RED);
		clear.setBounds(116, 234, 109, 28);
		frame.getContentPane().add(clear);
		
		JButton btnNewButton_1 = new JButton("   Special\r\n Function");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Special.main(null);
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		btnNewButton_1.setBounds(25, 278, 155, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Launcher.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(186, 320, 117, 33);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}

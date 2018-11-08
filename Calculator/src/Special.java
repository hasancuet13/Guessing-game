import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;


public class Special {

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Special window = new Special();
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
	public Special() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(490, 184, 334, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnFirstNmber = new JTextPane();
		txtpnFirstNmber.setForeground(Color.BLUE);
		txtpnFirstNmber.setEditable(false);
		txtpnFirstNmber.setBackground(Color.CYAN);
		txtpnFirstNmber.setFont(new Font("Segoe Print", Font.ITALIC, 16));
		txtpnFirstNmber.setText("   First Number");
		txtpnFirstNmber.setBounds(10, 24, 150, 34);
		frame.getContentPane().add(txtpnFirstNmber);
		
		num1 = new JTextField();
		num1.setForeground(Color.BLUE);
		num1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		num1.setBounds(180, 24, 126, 34);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		JTextPane second = new JTextPane();
		second.setForeground(Color.BLUE);
		second.setBackground(Color.CYAN);
		second.setEditable(false);
		second.setFont(new Font("Segoe Print", Font.ITALIC, 16));
		second.setText("  Second Number\r\n");
		second.setBounds(10, 82, 150, 34);
		frame.getContentPane().add(second);
		
		num2 = new JTextField();
		num2.setForeground(Color.BLUE);
		num2.setFont(new Font("Tahoma", Font.ITALIC, 17));
		num2.setBounds(180, 82, 126, 34);
		frame.getContentPane().add(num2);
		num2.setColumns(10);
		//num2.setVisible(true);
		
		JButton power = new JButton("POWER");
		power.setForeground(Color.BLUE);
		power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(num1.getText());
				int n2=Integer.parseInt(num2.getText());
				int power=1;
				for(int i=1;i<=n2;i++){
					power=power*n1;
				}
				output.setText(Integer.toString(power));
			}
		});
		power.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		power.setBounds(10, 214, 209, 40);
		frame.getContentPane().add(power);
		
		JButton square = new JButton("SQUARE ROOT");
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//second.setVisible(false);
				//num2.setVisible(false);
				int n1=Integer.parseInt(num1.getText());
				double n3=Math.sqrt(n1);
				output.setText(Double.toString(n3));
			}
		});
		square.setForeground(Color.BLUE);
		square.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		square.setBounds(10, 261, 209, 40);
		frame.getContentPane().add(square);
		
		JButton mod = new JButton("MODULUS");
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(num1.getText());
				int n2=Integer.parseInt(num2.getText());
				int n3=n1%n2;
				output.setText(Integer.toString(n3));
			}
		});
		mod.setForeground(Color.BLUE);
		mod.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		mod.setBounds(10, 307, 209, 40);
		frame.getContentPane().add(mod);
		
		JTextPane result = new JTextPane();
		result.setEditable(false);
		result.setForeground(Color.BLUE);
		result.setBackground(Color.CYAN);
		result.setFont(new Font("Segoe Print", Font.ITALIC, 18));
		result.setText("      Result");
		result.setBounds(93, 127, 150, 34);
		frame.getContentPane().add(result);
		
		output = new JTextField();
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setEditable(false);
		output.setBackground(Color.WHITE);
		output.setForeground(Color.BLUE);
		output.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		output.setBounds(10, 169, 296, 34);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText("");
				num2.setText("");
				//num2.setVisible(true);
				output.setText("0");
			}
		});
		btnNewButton.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		btnNewButton.setBounds(10, 354, 162, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton ba = new JButton("BACK");
		ba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Example1.main(null);
			}
		});
		ba.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ba.setBackground(Color.LIGHT_GRAY);
		ba.setForeground(Color.RED);
		ba.setBounds(202, 354, 104, 34);
		frame.getContentPane().add(ba);
	}
}

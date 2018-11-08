import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Start {

	private JFrame frame;
	private JTextField showname;
	private JButton btnNewButton_1;
	private JTextPane txtpnInsertAName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(490, 184, 315, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane name = new JTextPane();
		name.setForeground(Color.BLUE);
		name.setEditable(false);
		name.setFont(new Font("Segoe Print", Font.ITALIC, 20));
		name.setText("    Enter Your Name");
		name.setBounds(22, 25, 259, 48);
		frame.getContentPane().add(name);
		
		showname = new JTextField();
		showname.setForeground(Color.BLUE);
		showname.setFont(new Font("Tahoma", Font.ITALIC, 20));
		showname.setBounds(32, 98, 232, 48);
		frame.getContentPane().add(showname);
		showname.setColumns(10);
		
		JButton btnNewButton = new JButton(" START\r\n  GAME");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=showname.getText();
				char[] ch=new char[100];
				ch=s.toCharArray();
				if(s.equals(null)){
					Start.main(null);
					JOptionPane.showMessageDialog(null,"Insert A Name...!!");
				}
				else{
				frame.setVisible(false);
				
				Game.main(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 20));
		btnNewButton.setBounds(51, 199, 195, 60);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Launcher.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(82, 276, 135, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		txtpnInsertAName = new JTextPane();
		txtpnInsertAName.setEditable(false);
		txtpnInsertAName.setBackground(Color.CYAN);
		txtpnInsertAName.setForeground(Color.RED);
		txtpnInsertAName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnInsertAName.setText("  Insert A Name First...");
		txtpnInsertAName.setBounds(101, 157, 180, 31);
		frame.getContentPane().add(txtpnInsertAName);
	}

}

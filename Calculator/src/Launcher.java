import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Launcher {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Launcher window = new Launcher();
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
	public Launcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(490, 184, 331, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Calculator");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Example1.main(null);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Sakkal Majalla", Font.ITALIC, 27));
		btnNewButton_1.setBounds(36, 125, 239, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("About");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Project Calculator\n\n      Created By\n\n  Omar Sharif   Id:  1304003\n Neehar Tushar   Id:  1304017  \n\n Special Thanks to \n   Masudur Rahman \n\n     CUET(CSE FAMILY)");
			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Sakkal Majalla", Font.ITALIC, 28));
		btnNewButton_2.setBounds(36, 198, 239, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice=JOptionPane.showConfirmDialog(null,"Really Exit ?","Confirmation",JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION){
				System.exit(0);
				}
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Sakkal Majalla", Font.ITALIC, 28));
		btnNewButton_3.setBounds(70, 262, 179, 40);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Guessing Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Start.main(null);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Sakkal Majalla", Font.ITALIC, 27));
		btnNewButton.setBounds(36, 57, 239, 40);
		frame.getContentPane().add(btnNewButton);
	}

}

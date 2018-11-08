import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class Game {

	private JFrame frame;
	private JTextField gettry;
	private JTextField showtry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int n, NumberTowin=(int)(Math.random()*10);;
	/**
	 * @wbp.nonvisual location=-39,219
	 */
	private final JTextField textField = new JTextField();
	private JTextField guess;
	private JTextField box1;
	private JTextField com;
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.MAGENTA);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(490, 184, 321, 399);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//guess.setText("Enter Your Guess..");
		
		gettry = new JTextField();
		gettry.setForeground(Color.GREEN);
		gettry.setFont(new Font("Tahoma", Font.ITALIC, 16));
		gettry.setBounds(23, 117, 125, 36);
		frame.getContentPane().add(gettry);
		gettry.setColumns(10);
		
		showtry = new JTextField();
		showtry.setForeground(Color.WHITE);
		showtry.setBackground(Color.RED);
		showtry.setFont(new Font("Segoe Print", Font.ITALIC, 16));
		showtry.setEditable(false);
		showtry.setBounds(23, 178, 264, 36);
		frame.getContentPane().add(showtry);
		showtry.setColumns(10);
		showtry.setVisible(false);
		
		JButton retry = new JButton("Retry");
		retry.setForeground(Color.GREEN);
		retry.setBackground(Color.LIGHT_GRAY);
		retry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					com.setText("");
					com.setText("  Computer Again Guessed.." );
					guess.setText("");
					guess.setText("      Guess Again..");
					gettry.setEditable(true);
					showtry.setVisible(false);
					box1.setVisible(false);
			 NumberTowin=(int)(Math.random()*10);
			 n=0;
			}
		});
		retry.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		retry.setBounds(23, 291, 117, 36);
		frame.getContentPane().add(retry);
		
		JButton back = new JButton("Back");
		back.setForeground(Color.RED);
		back.setBackground(Color.LIGHT_GRAY);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Start.main(null);
			}
		});
		back.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		back.setBounds(188, 291, 117, 36);
		frame.getContentPane().add(back);
		
		JButton ftry = new JButton("Try");
		ftry.setForeground(Color.BLUE);
		ftry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n++;
				int x=Integer.parseInt(gettry.getText());
				try {
					Thread.sleep(700);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(x==NumberTowin){
					showtry.setVisible(true);
					showtry.setText("Congrates...");
					showtry.setBackground(Color.green);
					box1.setVisible(true);
					
					int l=(10-n+1);
					int m=(l*100)/10;
					if(m<0) m=0;
					box1.setText("Your accuracy "+m+"%");
					gettry.setEditable(false);
					n=0;
				}
				else{
					showtry.setVisible(true);
					showtry.setText("Try Again..");
					showtry.setBackground(Color.red);
				}
				gettry.setText("");
			}
		});
		ftry.setFont(new Font("Tahoma", Font.ITALIC, 17));
		ftry.setBounds(162, 117, 125, 36);
		frame.getContentPane().add(ftry);
		
		guess = new JTextField();
		guess.setForeground(Color.BLUE);
		guess.setEditable(false);
		guess.setFont(new Font("Tahoma", Font.ITALIC, 17));
		guess.setText("          Enter Your Guess....");
		guess.setBounds(23, 70, 264, 36);
		frame.getContentPane().add(guess);
		guess.setColumns(10);
		
		box1 = new JTextField();
		box1.setForeground(Color.PINK);
		box1.setBackground(Color.GREEN);
		box1.setFont(new Font("Segoe Print", Font.ITALIC, 17));
		box1.setEditable(false);
		box1.setBounds(23, 235, 264, 36);
		frame.getContentPane().add(box1);
		box1.setColumns(10);
		
		com = new JTextField();
		com.setForeground(Color.BLUE);
		com.setEditable(false);
		com.setFont(new Font("Tahoma", Font.ITALIC, 17));
		com.setText("        Computer Guessed");
		com.setBounds(23, 22, 264, 36);
		frame.getContentPane().add(com);
		com.setColumns(10);
		box1.setVisible(false);
	}

}

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class GuesserGame extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	int pn1;
	int pn2;
	int pn3;
	int cn;
	String msg="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuesserGame frame = new GuesserGame();
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
	public GuesserGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(193, 238, 191));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGuesserGame = new JLabel("GUESSER GAME");
		lblGuesserGame.setForeground(new Color(0, 0, 0));
		lblGuesserGame.setFont(new Font("Constantia", Font.BOLD, 18));
		lblGuesserGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuesserGame.setBounds(221, 11, 186, 29);
		contentPane.add(lblGuesserGame);
		
		JLabel lblPlayer = new JLabel("PLAYER 1");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setFont(new Font("Castellar", Font.BOLD, 17));
		lblPlayer.setForeground(new Color(0, 0, 0));
		lblPlayer.setBounds(181, 82, 102, 23);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_2 = new JLabel("PLAYER2");
		lblPlayer_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_2.setForeground(new Color(0, 0, 0));
		lblPlayer_2.setFont(new Font("Castellar", Font.BOLD, 17));
		lblPlayer_2.setBounds(181, 142, 102, 23);
		contentPane.add(lblPlayer_2);
		
		JLabel lblPlayer_1 = new JLabel("PLAYER3");
		lblPlayer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer_1.setForeground(new Color(0, 0, 0));
		lblPlayer_1.setFont(new Font("Castellar", Font.BOLD, 17));
		lblPlayer_1.setBounds(181, 201, 102, 23);
		contentPane.add(lblPlayer_1);
		
		JLabel lblComputer = new JLabel("COMPUTER");
		lblComputer.setHorizontalAlignment(SwingConstants.CENTER);
		lblComputer.setForeground(new Color(0, 0, 0));
		lblComputer.setFont(new Font("Castellar", Font.BOLD, 17));
		lblComputer.setBounds(181, 280, 108, 21);
		contentPane.add(lblComputer);
		
		t1 = new JTextField();
		t1.setBounds(323, 86, 155, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(323, 146, 155, 20);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(323, 205, 155, 20);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(323, 283, 155, 20);
		contentPane.add(t4);
		
		JButton generate = new JButton("GENERATE");
		generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CODE HERE
				pn1=Integer.valueOf(t1.getText());
				pn2=Integer.valueOf(t2.getText());
				pn3=Integer.valueOf(t3.getText());
				Random rand = new Random();
				cn = rand.nextInt(10);
				t4.setText(String.valueOf(cn));
				
			
				
			}
		});
		generate.setFont(new Font("Sitka Text", Font.BOLD, 14));
		generate.setForeground(new Color(0, 0, 0));
		generate.setBackground(new Color(255, 255, 255));
		generate.setBounds(265, 328, 138, 23);
		contentPane.add(generate);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(323, 374, 155, 20);
		contentPane.add(t5);
		
		JButton result = new JButton("RESULT");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Result code here
				int res=compare(pn1,pn2,pn3,cn);
				if (res==1)
				{
					msg="PLAYER 1 WINS";
					t5.setText(msg);
				}
				if (res==2)
				{
					msg="PLAYER 2 WINS";
					t5.setText(msg);
				}
				if (res==3)
				{
					msg="PLAYER 3 WINS";
					t5.setText(msg);
				}
				if (res==-1)
				{
					msg="COMPUTER WINS";
					t5.setText(msg);
				}
				
			}
		});
		result.setFont(new Font("Sitka Text", Font.BOLD, 14));
		result.setBackground(new Color(255, 255, 255));
		result.setForeground(new Color(0, 0, 0));
		result.setBounds(181, 374, 102, 27);
		contentPane.add(result);
		ImageIcon img = new ImageIcon(this.getClass().getResource("user.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Puli\\eclipse-workspace\\Project-2\\src\\user2.png"));
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("user.png"));
		lblNewLabel_1.setBounds(82, 118, 64, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Puli\\eclipse-workspace\\Project-2\\src\\user3.png"));
		lblNewLabel_2.setBounds(82, 182, 64, 64);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Puli\\eclipse-workspace\\Project-2\\src\\computer.png"));
		lblNewLabel_3.setBounds(92, 256, 50, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Puli\\eclipse-workspace\\Project-2\\src\\user.png"));
		lblNewLabel.setBounds(82, 51, 64, 64);
		contentPane.add(lblNewLabel);
		
	}
	public int compare(int t1,int t2,int t3,int t4)
	{
		int res=0;
		if(cn ==t1) {
			return 1;
		}
		else if(cn ==t2) {
			return 2;
		}
		else if(cn ==t3) {
			return 3;
		}
		else {
			return -1;
		}
	}
}

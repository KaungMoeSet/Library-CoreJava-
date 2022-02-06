import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Library extends JFrame {
	static Library lbframe;
	private JPanel panel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				lbframe = new Library();
				lbframe.setVisible(true);
			}			
		});

	}

	public Library() {
		panel = new JPanel();			
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);	
		this.setResizable(false);
		this.setTitle("Login Page");
		
		JLabel label = new JLabel("Library Management");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setForeground(new Color(98,148,127));
		panel.add(label);
		
		JButton adminbtn = new JButton("Admin Login");
		adminbtn.setBounds(150, 60, 180, 50);
		adminbtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		adminbtn.setFocusable(false);
		adminbtn.setForeground(Color.WHITE);
		adminbtn.setBackground(new Color(66, 103, 178));
		adminbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				lbframe.dispose();
			}		
		});
		
		JButton lbbtn = new JButton("Librarian Login");
		lbbtn.setBounds(150, 120, 180, 50);
		lbbtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		lbbtn.setFocusable(false);
		lbbtn.setForeground(Color.WHITE);
		lbbtn.setBackground(new Color(66, 103, 178));
		lbbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin.main(new String[]{});
				lbframe.dispose();
			}		
		});		
		this.add(adminbtn);
		this.add(lbbtn);
		this.add(panel);
	}
}

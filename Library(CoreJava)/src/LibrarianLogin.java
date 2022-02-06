import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogin extends JFrame {
	static LibrarianLogin admlgn;
	private JPanel panel;
	private JLabel title, namelbl, passlbl;
	private JTextField nameField;
	private JPasswordField passField;
	private JButton loginbtn, backbtn;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					admlgn = new LibrarianLogin();
					admlgn.setVisible(true);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
	}

	public LibrarianLogin() {
		panel = new JPanel();
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);	
		this.setResizable(false);
		this.setTitle("Login Page");
		
		title = new JLabel("Librarian Login");
		title.setFont(new Font("Tahoma", Font.PLAIN, 30));
		title.setForeground(new Color(98,148,127));
		
		namelbl = new JLabel("Enter Name :");
		namelbl.setBounds(25, 50, 150, 30);
		namelbl.setFont(new Font("Serif",Font.BOLD,20));		
		nameField = new JTextField();
		nameField.setBounds(190, 50, 150, 30);
		
		passlbl = new JLabel("Enter Password :");
		passlbl.setBounds(25, 100, 150, 30);
		passlbl.setFont(new Font("Serif",Font.BOLD,20));	
		passField = new JPasswordField();
		passField.setBounds(190, 100, 150, 30);
		
		loginbtn = new JButton("Login");
		loginbtn.setBounds(50, 150, 150, 50);
		loginbtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		loginbtn.setFocusable(false);
		loginbtn.setForeground(Color.WHITE);
		loginbtn.setBackground(new Color(66, 103, 178));
		loginbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		backbtn = new JButton("Back");
		backbtn.setBounds(250, 150, 180, 50);
		backbtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		backbtn.setFocusable(false);
		backbtn.setForeground(Color.WHITE);
		backbtn.setBackground(new Color(66, 103, 178));
		backbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[] {});
				admlgn.dispose();
			}
			
		});
		
		panel.add(title);
		this.add(namelbl);
		this.add(passlbl);
		this.add(nameField);
		this.add(passField);
		this.add(loginbtn);
		this.add(backbtn);
		this.add(panel);
	}
}

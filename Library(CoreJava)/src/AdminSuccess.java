import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminSuccess extends JFrame {
	static AdminSuccess frame;
	private JPanel panel;
	private JLabel label;
	private JButton addLbrnBtn, viewLbrnBtn, delLbrnBtn, LogoutBtn;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				frame = new AdminSuccess();
				frame.setVisible(true);
			}
			
		});
	}

	public AdminSuccess() {
		panel = new JPanel();
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);	
		this.setResizable(false);
		this.setTitle("Login as Admin");
		
		label = new JLabel("Admin Section");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setForeground(new Color(98,148,127));
		panel.add(label);
		
		addLbrnBtn = new JButton("Add Librarian");
		addLbrnBtn.setBounds(150, 80, 180, 50);
		addLbrnBtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		addLbrnBtn.setFocusable(false);
		addLbrnBtn.setForeground(Color.WHITE);
		addLbrnBtn.setBackground(new Color(66, 103, 178));
		addLbrnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LibrarianForm.main(new String[] {});
				frame.dispose();
			}
			
		});
		
		viewLbrnBtn = new JButton("View Librarian");
		viewLbrnBtn.setBounds(150, 140, 180, 50);
		viewLbrnBtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		viewLbrnBtn.setFocusable(false);
		viewLbrnBtn.setForeground(Color.WHITE);
		viewLbrnBtn.setBackground(new Color(66, 103, 178));
		viewLbrnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLibrarian.main(new String[] {});
				frame.dispose();
			}
			
		});
			
		delLbrnBtn = new JButton("Delete Librarian");
		delLbrnBtn.setBounds(150, 200, 180, 50);
		delLbrnBtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		delLbrnBtn.setFocusable(false);
		delLbrnBtn.setForeground(Color.WHITE);
		delLbrnBtn.setBackground(new Color(66, 103, 178));
		delLbrnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteLibrarian.main(new String[] {});
				frame.dispose();
			}
			
		});
		
		LogoutBtn = new JButton("Logout");
		LogoutBtn.setBounds(150, 260, 180, 50);
		LogoutBtn.setFont(new Font("Comic Sans",Font.BOLD,18));
		LogoutBtn.setFocusable(false);
		LogoutBtn.setForeground(Color.WHITE);
		LogoutBtn.setBackground(new Color(66, 103, 178));
		LogoutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[] {});
				frame.dispose();
			}
			
		});
			
		this.add(addLbrnBtn);
		this.add(viewLbrnBtn);
		this.add(delLbrnBtn);
		this.add(LogoutBtn);
		this.add(panel);
	}
}

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
		this.setSize(500, 500);
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
				
			}
			
		});
		
		viewLbrnBtn = new JButton("View Librarian");
		viewLbrnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		delLbrnBtn = new JButton("Delete Librarian");
		delLbrnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		LogoutBtn = new JButton("Logout");
		LogoutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[] {});
				frame.dispose();
			}
			
		});
			
		this.add(addLbrnBtn);
		this.add(panel);
	}
}

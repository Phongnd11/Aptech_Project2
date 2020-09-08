package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JButton btnLogin;
	private JButton btnExitLogin;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtUser;
	private JPasswordField txtPassWord;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(desktopPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
		);

		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoginActionPerformed(e);
			}
		});

		btnLogin.setBounds(89, 210, 89, 23);
		desktopPane.add(btnLogin);
		
		btnExitLogin = new JButton("Exit");
		btnExitLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitLoginActionPerformed(e);
			}
		});
		btnExitLogin.setBounds(229, 210, 89, 23);
		desktopPane.add(btnExitLogin);
		
		lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(165, 35, 76, 32);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("User");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(63, 115, 46, 14);
		desktopPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("PassWord");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(63, 146, 78, 14);
		desktopPane.add(lblNewLabel_3);
		
		txtUser = new JTextField();
		txtUser.setBounds(151, 112, 195, 20);
		desktopPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassWord = new JPasswordField();
		txtPassWord.setBounds(151, 143, 195, 20);
		desktopPane.add(txtPassWord);
		
		lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 424, 306);
		desktopPane.add(lblNewLabel);
		
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnExitLoginActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void btnLoginActionPerformed(ActionEvent e) {
		String user = txtUser.getText();
		String password = new String(txtPassWord.getPassword());
		if(user.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(this, "Input Id and Password", "ERROR", JOptionPane.ERROR_MESSAGE);
			txtPassWord.setText("");
		}
		if(user.equals("123") && password.equals("123")) {
//			new User(user).setVisible(true);
			this.dispose();
		}
		
	}
}

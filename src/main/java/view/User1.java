package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.FlowLayout;

public class User1 extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JLabel lblName;
	private JLabel lblNewLabel_3;
	private JLabel lblGender;
	private JLabel lblNewLabel_5;
	private JLabel lblDSW;
	private JDesktopPane desktopPane_1;
	private JLabel lblNewLabel_2;
	private JButton btnProject;
	private JButton btnPersonal;
	private JButton btnNewButton_2;
	private JButton btnNotification;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblImage2;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JPanel panelNotification;
	private JPanel panelPersonalDetails;
	private JButton btnNewButton_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_12;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JPanel panelProject;
	private JTextField textField;
	private JLabel lblNewLabel_7;
	private JPanel panelTransfer;
	private JLabel lblNewLabel_13;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1 frame = new User1();
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
	public User1() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				thisComponentShown(e);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(128, 128, 128));
		
		desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 626, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
				.addComponent(desktopPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
		);
		
		lblNewLabel_2 = new JLabel("Company IT");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 11, 139, 39);
		desktopPane_1.add(lblNewLabel_2);
		
		btnProject = new JButton("Project");
		btnProject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProject.setForeground(Color.WHITE);
		btnProject.setBackground(new Color(128, 0, 0));
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});
		btnProject.setBounds(305, 72, 128, 52);
		desktopPane_1.add(btnProject);
		
		btnPersonal = new JButton("Personal details");
		btnPersonal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPersonal.setBackground(Color.BLUE);
		btnPersonal.setForeground(Color.WHITE);
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		btnPersonal.setBounds(156, 72, 128, 52);
		desktopPane_1.add(btnPersonal);
		
		btnNewButton_2 = new JButton("Transfer");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(138, 43, 226));
		btnNewButton_2.setBounds(455, 72, 128, 52);
		desktopPane_1.add(btnNewButton_2);
		
		btnNotification = new JButton("Notification");
		btnNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNotificationActionPerformed(e);
			}
		});
		btnNotification.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNotification.setForeground(Color.WHITE);
		btnNotification.setBackground(new Color(34, 139, 34));
		btnNotification.setBounds(10, 72, 128, 52);
		desktopPane_1.add(btnNotification);
		
//panel Project
//		panelProject = new JPanel();
//		panelProject.setBackground(Color.LIGHT_GRAY);
//		panelProject.setBounds(10, 135, 616, 416);
//		desktopPane_1.add(panelProject);
//		
//		textField = new JTextField();
//		textField.setColumns(10);
//		
//		lblNewLabel_7 = new JLabel("Search");
//		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		
//		JScrollPane scrollPane_1 = new JScrollPane();
//		
//		lblNewLabel_13 = new JLabel("Current Project");
//		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		
//		textField_2 = new JTextField();
//		textField_2.setColumns(10);
//		GroupLayout gl_panelProject = new GroupLayout(panelProject);
//		gl_panelProject.setHorizontalGroup(
//			gl_panelProject.createParallelGroup(Alignment.TRAILING)
//				.addGroup(gl_panelProject.createSequentialGroup()
//					.addContainerGap(419, Short.MAX_VALUE)
//					.addComponent(lblNewLabel_7)
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap())
//				.addGroup(gl_panelProject.createSequentialGroup()
//					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//				.addGroup(Alignment.LEADING, gl_panelProject.createSequentialGroup()
//					.addGap(20)
//					.addGroup(gl_panelProject.createParallelGroup(Alignment.LEADING)
//						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblNewLabel_13))
//					.addContainerGap(457, Short.MAX_VALUE))
//		);
//		gl_panelProject.setVerticalGroup(
//			gl_panelProject.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panelProject.createSequentialGroup()
//					.addGap(139)
//					.addComponent(lblNewLabel_13)
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//					.addGap(236)
//					.addGroup(gl_panelProject.createParallelGroup(Alignment.BASELINE)
//						.addComponent(lblNewLabel_7)
//						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
//		);
//		panelProject.setLayout(gl_panelProject);

//End panel Project
	
//panel Personal Details
//		panelPersonalDetails = new JPanel();
//		panelPersonalDetails.setBounds(10, 135, 616, 416);
//		desktopPane_1.add(panelPersonalDetails);
//		
//		btnNewButton_1 = new JButton("Change Password");
//		
//		textField_1 = new JTextField();
//		textField_1.setColumns(10);
//		
//		lblNewLabel_12 = new JLabel("Search");
//		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		
//		scrollPane = new JScrollPane();
//		GroupLayout gl_panelPersonalDetails = new GroupLayout(panelPersonalDetails);
//		gl_panelPersonalDetails.setHorizontalGroup(
//			gl_panelPersonalDetails.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panelPersonalDetails.createSequentialGroup()
//					.addGroup(gl_panelPersonalDetails.createParallelGroup(Alignment.LEADING)
//						.addGroup(gl_panelPersonalDetails.createSequentialGroup()
//							.addContainerGap()
//							.addComponent(btnNewButton_1)
//							.addPreferredGap(ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
//							.addComponent(lblNewLabel_12)
//							.addPreferredGap(ComponentPlacement.UNRELATED)
//							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
//						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE))
//					.addContainerGap())
//		);
//		gl_panelPersonalDetails.setVerticalGroup(
//			gl_panelPersonalDetails.createParallelGroup(Alignment.LEADING)
//				.addGroup(gl_panelPersonalDetails.createSequentialGroup()
//					.addContainerGap()
//					.addGroup(gl_panelPersonalDetails.createParallelGroup(Alignment.BASELINE)
//						.addComponent(btnNewButton_1)
//						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//						.addComponent(lblNewLabel_12))
//					.addPreferredGap(ComponentPlacement.UNRELATED)
//					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
//					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//		);
//		
//		table_1 = new JTable();
//		scrollPane.setViewportView(table_1);
//		panelPersonalDetails.setLayout(gl_panelPersonalDetails);
		
//End Panel Personal Details
		
		panelNotification = new JPanel();
		panelNotification.setBackground(Color.WHITE);
		panelNotification.setBounds(10, 135, 616, 416);
		desktopPane_1.add(panelNotification);
		GroupLayout gl_panelNotification = new GroupLayout(panelNotification);
		gl_panelNotification.setHorizontalGroup(
			gl_panelNotification.createParallelGroup(Alignment.LEADING)
				.addGap(0, 616, Short.MAX_VALUE)
		);
		gl_panelNotification.setVerticalGroup(
			gl_panelNotification.createParallelGroup(Alignment.LEADING)
				.addGap(0, 416, Short.MAX_VALUE)
		);
		panelNotification.setLayout(gl_panelNotification);
		
		lblImage2 = new JLabel("New label");
		Image lblimage2 = new ImageIcon(this.getClass().getResource("/bg2.jpg")).getImage().getScaledInstance(641, 551, Image.SCALE_DEFAULT);
		lblImage2.setIcon(new ImageIcon(lblimage2));
		lblImage2.setBounds(0, 0, 641, 551);
		desktopPane_1.add(lblImage2);
		
		panelTransfer = new JPanel();
		panelTransfer.setBounds(10, 137, 616, 414);
		desktopPane_1.add(panelTransfer);
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(56, 28, 120, 120);
		Image img = new ImageIcon(this.getClass().getResource("/Account1.png")).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setBounds(10, 177, 100, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblName = new JLabel("Ngô Hùng Cường");
		lblName.setBounds(120, 172, 111, 30);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBackground(Color.WHITE);
		
		lblNewLabel_3 = new JLabel("Gender:");
		lblNewLabel_3.setBounds(10, 213, 100, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblGender = new JLabel("Male");
		lblGender.setBounds(120, 213, 111, 14);
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_5 = new JLabel("Date start work:");
		lblNewLabel_5.setBounds(10, 251, 100, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblDSW = new JLabel("2020-12-12");
		lblDSW.setBounds(120, 251, 111, 14);
		lblDSW.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_4 = new JLabel("Branch:");
		lblNewLabel_4.setBounds(10, 291, 100, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_6 = new JLabel("Sài Gòn");
		lblNewLabel_6.setBounds(120, 291, 111, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_8 = new JLabel("Chức vụ:");
		lblNewLabel_8.setBounds(10, 330, 100, 17);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_9 = new JLabel("Nhân viên");
		lblNewLabel_9.setBounds(120, 330, 102, 17);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_10 = new JLabel("Phòng ban:");
		lblNewLabel_10.setBounds(10, 373, 100, 14);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_11 = new JLabel("Số  6");
		lblNewLabel_11.setBounds(120, 365, 102, 24);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		desktopPane.setLayout(null);
		desktopPane.add(lblNewLabel);
		desktopPane.add(lblNewLabel_1);
		desktopPane.add(lblName);
		desktopPane.add(lblNewLabel_3);
		desktopPane.add(lblGender);
		desktopPane.add(lblNewLabel_5);
		desktopPane.add(lblDSW);
		desktopPane.add(lblNewLabel_4);
		desktopPane.add(lblNewLabel_6);
		desktopPane.add(lblNewLabel_8);
		desktopPane.add(lblNewLabel_9);
		desktopPane.add(lblNewLabel_10);
		desktopPane.add(lblNewLabel_11);
		Image lblimage1 = new ImageIcon(this.getClass().getResource("/bg1.jpg")).getImage().getScaledInstance(253, 551, Image.SCALE_DEFAULT);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		panelNotification.setVisible(false);
		panelProject.setVisible(true);
		panelPersonalDetails.setVisible(false);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		panelNotification.setVisible(false);
		panelProject.setVisible(false);
		panelPersonalDetails.setVisible(true);
	}
	protected void thisComponentShown(ComponentEvent e) {
		panelPersonalDetails.setVisible(false);
		panelNotification.setVisible(false);
		panelProject.setVisible(false);
	}
	protected void btnNotificationActionPerformed(ActionEvent e) {
		panelNotification.setVisible(true);
		panelProject.setVisible(false);
		panelPersonalDetails.setVisible(false);
	}
}

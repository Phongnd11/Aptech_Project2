package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.FlowLayout;

public class User extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JLabel lblNewLabel_1;
	private JLabel lblImageAccount;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblName;
	private JLabel lblGender;
	private JLabel lblDateJoin;
	private JLabel lblBranch;
	private JLabel lblPosition;
	private JLabel lblDepartment;
	private JDesktopPane desktopPane_1;
	private JLabel lblNewLabel_6;
	private JButton btnNotification;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panelNotification;
	private JButton btnSearchNotification;
	private JTextField txtSearchNotification;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel panelPersonalDetails;
	private JButton btnComfirmNotification;
	private JButton btnSearchPersonalDetails;
	private JTextField txtSearchPersonalDetails;
	private JButton btnPasswordChange;
	private JPanel panelProject;
	private JButton btnNewButton_3;
	private JTextField textField;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JPanel panelTransfer;
	private JButton btnChangeProject;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox;
	private JLabel lblNewLabel_8;
	private JTextField textField_1;
	private JLabel lblNewLabel_9;
	private JScrollPane scrollPane_3;
	private JTextPane textPane;
	private JDesktopPane desktopPane_2;
	private JPanel panelPasswordChange;
	private JPanel panelTable;
	private JLabel lblNewLabel_10;
	private JTextField txtCurrentPassword;
	private JLabel lblNewLabel_11;
	private JTextField txtPasswordNew;
	private JLabel lblNewLabel_12;
	private JTextField txtReEnterPassword;
	private JButton btnChangePassword;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JButton btnExitChangePassword;
	private JLabel lblBg1;
	private JLabel lblNewLabel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		
		desktopPane_1 = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 978, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(desktopPane_1, Alignment.LEADING)
						.addComponent(desktopPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 661, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		lblNewLabel_6 = new JLabel("Company");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(22, 11, 130, 42);
		desktopPane_1.add(lblNewLabel_6);
		
// JButton JFrame User
		btnNotification = new JButton("Notification");
		btnNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNotificationActionPerformed(e);
			}
		});
		btnNotification.setBounds(74, 112, 170, 50);
		desktopPane_1.add(btnNotification);
		
		btnNewButton = new JButton("Personal details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});
		btnNewButton.setBounds(297, 112, 170, 50);
		desktopPane_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Project");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		btnNewButton_1.setBounds(513, 112, 170, 50);
		desktopPane_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Transfer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2ActionPerformed(e);
			}
		});
		btnNewButton_2.setBounds(745, 112, 170, 50);
		desktopPane_1.add(btnNewButton_2);
// End Button JFrame Userq

// Panel Notification
		
		panelNotification = new JPanel();
		panelNotification.setVisible(false);
		panelNotification.setBounds(44, 192, 898, 436);
		desktopPane_1.add(panelNotification);
		
		btnSearchNotification = new JButton("Search");
		
		txtSearchNotification = new JTextField();
		txtSearchNotification.setColumns(10);
		
		scrollPane = new JScrollPane();
		
		btnComfirmNotification = new JButton("Marked As Read");
		GroupLayout gl_panelNotification = new GroupLayout(panelNotification);
		gl_panelNotification.setHorizontalGroup(
			gl_panelNotification.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelNotification.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnComfirmNotification, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
					.addComponent(txtSearchNotification, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnSearchNotification, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
		);
		gl_panelNotification.setVerticalGroup(
			gl_panelNotification.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelNotification.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelNotification.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSearchNotification, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearchNotification)
						.addComponent(btnComfirmNotification))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panelNotification.setLayout(gl_panelNotification);
		
//End Panel Notification

// Panel Personal Details
		panelPersonalDetails = new JPanel();
		panelPersonalDetails.setVisible(false);
		panelPersonalDetails.setBounds(44, 192, 898, 436);
		desktopPane_1.add(panelPersonalDetails);
		
		btnSearchPersonalDetails = new JButton("search");
		
		txtSearchPersonalDetails = new JTextField();
		txtSearchPersonalDetails.setColumns(10);
		
		btnPasswordChange = new JButton("Password Change");
		btnPasswordChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPasswordChangeActionPerformed(e);
			}
		});
		
		desktopPane_2 = new JDesktopPane();
		GroupLayout gl_panelPersonalDetails = new GroupLayout(panelPersonalDetails);
		gl_panelPersonalDetails.setHorizontalGroup(
			gl_panelPersonalDetails.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPersonalDetails.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPasswordChange, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
					.addComponent(txtSearchPersonalDetails, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSearchPersonalDetails, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(desktopPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
		);
		gl_panelPersonalDetails.setVerticalGroup(
			gl_panelPersonalDetails.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPersonalDetails.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelPersonalDetails.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSearchPersonalDetails)
						.addComponent(txtSearchPersonalDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPasswordChange))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(desktopPane_2, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
		);
		
		//panel Change Password
		
		panelPasswordChange = new JPanel();
		panelPasswordChange.setVisible(false);
		panelPasswordChange.setBounds(0, 0, 898, 391);
		desktopPane_2.add(panelPasswordChange);
		
		lblNewLabel_10 = new JLabel("Current Password:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtCurrentPassword = new JTextField();
		txtCurrentPassword.setColumns(10);
		
		lblNewLabel_11 = new JLabel("Enter your new password:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtPasswordNew = new JTextField();
		txtPasswordNew.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Re-enter your password:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtReEnterPassword = new JTextField();
		txtReEnterPassword.setColumns(10);
		
		btnChangePassword = new JButton("Change");
		
		btnExitChangePassword = new JButton("Exit");
		btnExitChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitChangePasswordActionPerformed(e);
			}
		});
		GroupLayout gl_panelPasswordChange = new GroupLayout(panelPasswordChange);
		gl_panelPasswordChange.setHorizontalGroup(
			gl_panelPasswordChange.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPasswordChange.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_panelPasswordChange.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPasswordChange.createSequentialGroup()
							.addComponent(btnChangePassword, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExitChangePassword, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
						.addComponent(lblNewLabel_12)
						.addComponent(lblNewLabel_11)
						.addComponent(lblNewLabel_10)
						.addComponent(txtPasswordNew)
						.addComponent(txtReEnterPassword)
						.addComponent(txtCurrentPassword, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
					.addGap(590))
		);
		gl_panelPasswordChange.setVerticalGroup(
			gl_panelPasswordChange.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPasswordChange.createSequentialGroup()
					.addGap(52)
					.addComponent(lblNewLabel_10)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCurrentPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtPasswordNew, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_12)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtReEnterPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addGroup(gl_panelPasswordChange.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnChangePassword)
						.addComponent(btnExitChangePassword))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		panelPasswordChange.setLayout(gl_panelPasswordChange);
		//Panel Change Password
		
		panelTable = new JPanel();
		panelTable.setBounds(0, 0, 898, 391);
		desktopPane_2.add(panelTable);
		
		scrollPane_1 = new JScrollPane();
		GroupLayout gl_panelTable = new GroupLayout(panelTable);
		gl_panelTable.setHorizontalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
		);
		gl_panelTable.setVerticalGroup(
			gl_panelTable.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
		);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		panelTable.setLayout(gl_panelTable);
		panelPersonalDetails.setLayout(gl_panelPersonalDetails);

//End Personal Details
		
//Panel Project
		panelProject = new JPanel();
		panelProject.setVisible(false);
		panelProject.setBounds(44, 192, 898, 436);
		desktopPane_1.add(panelProject);
		
		btnNewButton_3 = new JButton("Search");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		GroupLayout gl_panelProject = new GroupLayout(panelProject);
		gl_panelProject.setHorizontalGroup(
			gl_panelProject.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelProject.createSequentialGroup()
					.addContainerGap(570, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(scrollPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
		);
		gl_panelProject.setVerticalGroup(
			gl_panelProject.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelProject.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelProject.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_3)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		panelProject.setLayout(gl_panelProject);
		
//End Panel Project
		
// Panel Transfer
		panelTransfer = new JPanel();
		panelTransfer.setVisible(false);
		panelTransfer.setBounds(46, 192, 884, 436);
		desktopPane_1.add(panelTransfer);
		
		btnChangeProject = new JButton("Change Project");
		
		lblNewLabel_7 = new JLabel("Select Project");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		comboBox = new JComboBox();
		
		lblNewLabel_8 = new JLabel("The project is participating");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Reason for transfer");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		scrollPane_3 = new JScrollPane();
		GroupLayout gl_panelTransfer = new GroupLayout(panelTransfer);
		gl_panelTransfer.setHorizontalGroup(
			gl_panelTransfer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTransfer.createSequentialGroup()
					.addGap(57)
					.addGroup(gl_panelTransfer.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnChangeProject, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_8, Alignment.LEADING)
						.addComponent(textField_1, Alignment.LEADING)
						.addComponent(lblNewLabel_7, Alignment.LEADING)
						.addComponent(comboBox, Alignment.LEADING, 0, 407, Short.MAX_VALUE)
						.addComponent(lblNewLabel_9, Alignment.LEADING)
						.addComponent(scrollPane_3, Alignment.LEADING))
					.addContainerGap(420, Short.MAX_VALUE))
		);
		gl_panelTransfer.setVerticalGroup(
			gl_panelTransfer.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panelTransfer.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewLabel_8)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_7)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(lblNewLabel_9)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(49)
					.addComponent(btnChangeProject)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		
		textPane = new JTextPane();
		scrollPane_3.setViewportView(textPane);
		panelTransfer.setLayout(gl_panelTransfer);
		
		lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_13.setBounds(0, 0, 978, 661);
		desktopPane_1.add(lblNewLabel_13);

//End Panel Transfer
		
		lblImageAccount = new JLabel("New label");
		lblImageAccount.setBounds(35, 26, 208, 148);
		Image img = new ImageIcon(this.getClass().getResource("/Account1.png")).getImage().getScaledInstance(208, 148, Image.SCALE_DEFAULT);
		lblImageAccount.setIcon(new ImageIcon(img));
		desktopPane.add(lblImageAccount);
		
		lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 213, 70, 24);
		desktopPane.setLayout(null);
		desktopPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 248, 70, 24);
		desktopPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("Date Join:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 283, 70, 24);
		desktopPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Branch:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 318, 70, 24);
		desktopPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Position:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 353, 70, 24);
		desktopPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Department:");
		lblNewLabel_5.setBounds(10, 388, 70, 24);
		desktopPane.add(lblNewLabel_5);
		
		lblName = new JLabel("Ngô Hùng Cường");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(106, 214, 157, 24);
		desktopPane.add(lblName);
		
		lblGender = new JLabel("Male");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGender.setBounds(106, 249, 157, 24);
		desktopPane.add(lblGender);
		
		lblDateJoin = new JLabel("2020/12/12");
		lblDateJoin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDateJoin.setBounds(106, 284, 157, 24);
		desktopPane.add(lblDateJoin);
		
		lblBranch = new JLabel("Sài Gòn, Việt Nam");
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBranch.setBounds(106, 319, 157, 24);
		desktopPane.add(lblBranch);
		
		lblPosition = new JLabel("Staff");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPosition.setBounds(106, 354, 157, 24);
		desktopPane.add(lblPosition);
		
		lblDepartment = new JLabel("IT");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDepartment.setBounds(106, 388, 157, 24);
		desktopPane.add(lblDepartment);
		
		lblBg1 = new JLabel("New label");
		lblBg1.setBackground(Color.LIGHT_GRAY);
		lblBg1.setBounds(0, 1, 273, 660);
		desktopPane.add(lblBg1);
		
		
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNotificationActionPerformed(ActionEvent e) {
		panelNotification.setVisible(true);
		panelPersonalDetails.setVisible(false);
		panelProject.setVisible(false);
		panelTransfer.setVisible(false);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		panelNotification.setVisible(false);
		panelPersonalDetails.setVisible(true);
		panelProject.setVisible(false);
		panelTransfer.setVisible(false);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		panelNotification.setVisible(false);
		panelPersonalDetails.setVisible(false);
		panelProject.setVisible(true);
		panelTransfer.setVisible(false);
	}
	protected void btnNewButton_2ActionPerformed(ActionEvent e) {
		panelNotification.setVisible(false);
		panelPersonalDetails.setVisible(false);
		panelProject.setVisible(false);
		panelTransfer.setVisible(true);
	}
	protected void btnPasswordChangeActionPerformed(ActionEvent e) {
		panelPasswordChange.setVisible(true);
		panelTable.setVisible(false);
	}
	protected void btnExitChangePasswordActionPerformed(ActionEvent e) {
		panelPasswordChange.setVisible(false);
		panelTable.setVisible(true);
	}
}

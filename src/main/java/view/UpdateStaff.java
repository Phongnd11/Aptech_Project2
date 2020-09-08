package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UpdateStaff extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JButton btnUpdateStaff;
	private JButton txtResetUpdateStaff;
	private JTextField txtUpdateIDStaff;
	private JTextField txtUpdatePassword;
	private JTextField txtUpdateName;
	private JTextField txtUpdateDepartment;
	private JTextField txtUpdatePosition;
	private JScrollPane scrollPane;
	private JTextPane txtUpdateAddress;
	private JTextField txtUpdateEducation;
	private JTextField txtUpdateSpecialize;
	private JTextField txtUpdatePhone;
	private JTextField txtUpdateEmail;
	private JTextField txtUpdateDateJoin;
	private JButton btnExitUpdateStaff;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStaff frame = new UpdateStaff();
					frame.setUndecorated(true);
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
	public UpdateStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("ID Staff");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_3 = new JLabel("Department");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_4 = new JLabel("Position");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_6 = new JLabel("Education");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_7 = new JLabel("Specialize");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_10 = new JLabel("Date Join");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnUpdateStaff = new JButton("Update Staff");
		
		txtResetUpdateStaff = new JButton("Reset");
		txtResetUpdateStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		
		txtUpdateIDStaff = new JTextField();
		txtUpdateIDStaff.setColumns(10);
		
		txtUpdatePassword = new JTextField();
		txtUpdatePassword.setColumns(10);
		
		txtUpdateName = new JTextField();
		txtUpdateName.setColumns(10);
		
		txtUpdateDepartment = new JTextField();
		txtUpdateDepartment.setColumns(10);
		
		txtUpdatePosition = new JTextField();
		txtUpdatePosition.setColumns(10);
		
		scrollPane = new JScrollPane();
		
		txtUpdateEducation = new JTextField();
		txtUpdateEducation.setColumns(10);
		
		txtUpdateSpecialize = new JTextField();
		txtUpdateSpecialize.setColumns(10);
		
		txtUpdatePhone = new JTextField();
		txtUpdatePhone.setColumns(10);
		
		txtUpdateEmail = new JTextField();
		txtUpdateEmail.setColumns(10);
		
		txtUpdateDateJoin = new JTextField();
		txtUpdateDateJoin.setColumns(10);
		
		btnExitUpdateStaff = new JButton("Exit");
		btnExitUpdateStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitUpdateStaffActionPerformed(e);
			}
		});
		
		lblNewLabel_11 = new JLabel("Update Staff");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(255)
					.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(214, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(97)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_9)
								.addComponent(lblNewLabel_10))
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtUpdateDateJoin)
								.addComponent(txtUpdateEmail)
								.addComponent(txtUpdatePhone)
								.addComponent(txtUpdateSpecialize)
								.addComponent(txtUpdateEducation)
								.addComponent(txtUpdatePosition)
								.addComponent(txtUpdateDepartment)
								.addComponent(txtUpdateName)
								.addComponent(txtUpdateIDStaff)
								.addComponent(txtUpdatePassword, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
								.addComponent(scrollPane)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnUpdateStaff, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtResetUpdateStaff, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnExitUpdateStaff, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addGap(96))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_11)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtUpdateIDStaff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtUpdatePassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtUpdateName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtUpdateDepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtUpdatePosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtUpdateEducation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(txtUpdateSpecialize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(txtUpdatePhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(txtUpdateEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(txtUpdateDateJoin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtResetUpdateStaff)
						.addComponent(btnUpdateStaff)
						.addComponent(btnExitUpdateStaff))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		txtUpdateAddress = new JTextPane();
		scrollPane.setViewportView(txtUpdateAddress);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		txtUpdateAddress.setText("");
		txtUpdateDateJoin.setText("");
		txtUpdateDepartment.setText("");
		txtUpdateEducation.setText("");
		txtUpdateEmail.setText("");
		txtUpdateIDStaff.setText("");
		txtUpdateName.setText("");
		txtUpdatePassword.setText("");
		txtUpdatePhone.setText("");
		txtUpdatePosition.setText("");
		txtUpdateSpecialize.setText("");
		
	}
	protected void btnExitUpdateStaffActionPerformed(ActionEvent e) {
		this.dispose();
	}
}

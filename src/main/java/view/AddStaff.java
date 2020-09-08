package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddStaff extends JFrame {

	private JPanel contentPane;
	private JButton btnCreateStaff;
	private JButton btnExitAddStaff;
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
	private JTextField txtAddPassWord;
	private JTextField txtAddName;
	private JTextField txtAddDepartment;
	private JTextField txtAddPosition;
	private JScrollPane scrollPane;
	private JTextPane txtAddAddress;
	private JTextField txtAddEducation;
	private JTextField txtAddPhone;
	private JTextField txtAddEmail;
	private JTextField txtAddDateJoin;
	private JTextField txtAddSpecialize;
	private JTextField txtAddIDStaff;
	private JButton btnResetAddProject;
	private JLabel blbTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff frame = new AddStaff();
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
	public AddStaff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnCreateStaff = new JButton("Create");
		
		btnExitAddStaff = new JButton("Exit");
		btnExitAddStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitAddStaffActionPerformed(e);
			}
		});
		
		lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_2 = new JLabel("Department");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_3 = new JLabel("Position");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_4 = new JLabel("ID Staff");
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
		
		txtAddIDStaff = new JTextField();
		txtAddIDStaff.setColumns(10);
		
		txtAddPassWord = new JTextField();
		txtAddPassWord.setColumns(10);
		
		txtAddName = new JTextField();
		txtAddName.setColumns(10);
		
		txtAddDepartment = new JTextField();
		txtAddDepartment.setColumns(10);
		
		txtAddPosition = new JTextField();
		txtAddPosition.setColumns(10);
		
		scrollPane = new JScrollPane();
		
		txtAddEducation = new JTextField();
		txtAddEducation.setColumns(10);
		
		txtAddSpecialize = new JTextField();
		txtAddSpecialize.setColumns(10);
		
		txtAddPhone = new JTextField();
		txtAddPhone.setColumns(10);
		
		txtAddEmail = new JTextField();
		txtAddEmail.setColumns(10);
		
		txtAddDateJoin = new JTextField();
		txtAddDateJoin.setColumns(10);
		
		btnResetAddProject = new JButton("Reset");
		btnResetAddProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnResetAddProjectActionPerformed(e);
			}
		});
		
		blbTitle = new JLabel("Add Staff");
		blbTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(109, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnCreateStaff, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnResetAddProject, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnExitAddStaff, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(2)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_5)
												.addComponent(lblNewLabel_3)
												.addComponent(lblNewLabel_6)
												.addComponent(lblNewLabel_7)
												.addComponent(lblNewLabel_10)
												.addComponent(lblNewLabel_9)
												.addComponent(lblNewLabel_8))))
									.addGap(43)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtAddEmail, 317, 317, 317)
										.addComponent(txtAddPhone, 317, 317, 317)
										.addComponent(txtAddSpecialize, 317, 317, 317)
										.addComponent(txtAddPosition, 317, 317, 317)
										.addComponent(txtAddPassWord, 317, 317, 317)
										.addComponent(txtAddIDStaff, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtAddName, 317, 317, 317)
										.addComponent(txtAddDepartment, 317, 317, 317)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtAddEducation, 317, 317, 317)
										.addComponent(txtAddDateJoin, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 171, GroupLayout.PREFERRED_SIZE)
							.addComponent(blbTitle, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(160)))
					.addGap(96))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addComponent(blbTitle)
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtAddIDStaff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtAddPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtAddName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtAddDepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtAddPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtAddEducation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(txtAddSpecialize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAddPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(txtAddEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(txtAddDateJoin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnResetAddProject)
						.addComponent(btnExitAddStaff)
						.addComponent(btnCreateStaff))
					.addContainerGap())
		);
		
		txtAddAddress = new JTextPane();
		scrollPane.setViewportView(txtAddAddress);
		contentPane.setLayout(gl_contentPane);
	}

	protected void btnExitAddStaffActionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void btnResetAddProjectActionPerformed(ActionEvent e) {
		txtAddAddress.setText("");
		txtAddDateJoin.setText("");
		txtAddDepartment.setText("");
		txtAddEducation.setText("");
		txtAddEmail.setText("");
		txtAddIDStaff.setText("");
		txtAddName.setText("");
		txtAddPassWord.setText("");
		txtAddPhone.setText("");
		txtAddPosition.setText("");
		txtAddSpecialize.setText("");
		
	}
}

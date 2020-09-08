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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Color;

public class UpdateProject extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtUpdateIDProject;
	private JTextField txtUpdateNameProject;
	private JTextField txtUpdateDepartment;
	private JScrollPane scrollPane;
	private JTextPane txtUpdateDescription;
	private JTextField txtUpdateTienTrinh;
	private JTextField txtUpdateProjectType;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProject frame = new UpdateProject();
//					frame.setResizable(false);
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
	public UpdateProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnNewButton = new JButton("Update");
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		
		lblNewLabel = new JLabel("ID Project");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_1 = new JLabel("Department");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_2 = new JLabel("Description");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_3 = new JLabel("Tien Trinh");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_4 = new JLabel("Project type");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_5 = new JLabel("Name Project");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtUpdateIDProject = new JTextField();
		txtUpdateIDProject.setEnabled(false);
		txtUpdateIDProject.setColumns(10);
		
		txtUpdateNameProject = new JTextField();
		txtUpdateNameProject.setColumns(10);
		
		txtUpdateDepartment = new JTextField();
		txtUpdateDepartment.setColumns(10);
		
		scrollPane = new JScrollPane();
		
		txtUpdateTienTrinh = new JTextField();
		txtUpdateTienTrinh.setColumns(10);
		
		txtUpdateProjectType = new JTextField();
		txtUpdateProjectType.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Update Project");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtUpdateProjectType, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
						.addComponent(txtUpdateTienTrinh, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtUpdateDepartment)
							.addComponent(txtUpdateNameProject)
							.addComponent(txtUpdateIDProject, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
					.addGap(80))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(142)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addComponent(lblNewLabel_6)
					.addContainerGap(218, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_6)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtUpdateIDProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtUpdateNameProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtUpdateDepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(49)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtUpdateTienTrinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(txtUpdateProjectType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		txtUpdateDescription = new JTextPane();
		scrollPane.setViewportView(txtUpdateDescription);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		this.dispose();
	}
}

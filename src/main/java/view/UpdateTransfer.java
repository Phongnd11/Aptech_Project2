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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UpdateTransfer extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtProjectStaff;
	private JComboBox cbbTransferStaff;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateTransfer frame = new UpdateTransfer();
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
	public UpdateTransfer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Update Transfer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtProjectStaff = new JTextField();
		txtProjectStaff.setEnabled(false);
		txtProjectStaff.setColumns(10);
		
		cbbTransferStaff = new JComboBox();
		
		lblNewLabel_1 = new JLabel("Select Staff");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("The project is participating");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnNewButton = new JButton("Update");
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(new Color(211, 211, 211));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		
		lblNewLabel_3 = new JLabel("New Project");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		comboBox = new JComboBox();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(170)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)
							.addGap(223)
							.addComponent(lblNewLabel_2)
							.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(cbbTransferStaff, Alignment.LEADING, 0, 221, Short.MAX_VALUE)
									.addComponent(comboBox, Alignment.LEADING, 0, 221, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
									.addGap(9)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtProjectStaff, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)))
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbbTransferStaff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtProjectStaff, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		this.dispose();
	}
}

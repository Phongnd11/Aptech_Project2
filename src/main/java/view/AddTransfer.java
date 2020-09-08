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
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddTransfer extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JComboBox cbbStaffAddTransfer;
	private JLabel lblNewLabel_2;
	private JComboBox cbbProjectAddTransfer;
	private JButton btnAddTransfer;
	private JButton btnExitAddTransfer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTransfer frame = new AddTransfer();
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
	public AddTransfer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Add Transfer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_1 = new JLabel("Select Staff");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbbStaffAddTransfer = new JComboBox();
		
		lblNewLabel_2 = new JLabel("Select Project");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbbProjectAddTransfer = new JComboBox();
		
		btnAddTransfer = new JButton("Add Transfer");
		
		btnExitAddTransfer = new JButton("Exit");
		btnExitAddTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExitAddTransferActionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(177)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(cbbStaffAddTransfer, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(cbbProjectAddTransfer, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(96, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(130)
					.addComponent(btnAddTransfer)
					.addGap(18)
					.addComponent(btnExitAddTransfer, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(27)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbStaffAddTransfer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbProjectAddTransfer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddTransfer)
						.addComponent(btnExitAddTransfer))
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void btnExitAddTransferActionPerformed(ActionEvent e) {
		this.dispose();
	}
}

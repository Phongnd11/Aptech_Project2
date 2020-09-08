package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bao.BaoBranch;
import entity.Branch;
import modal.ComboItem;
import modal.ResultsMessage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BranchInsert extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtId;
	private JLabel lblBranchName;
	private JTextField txtName;
	private JButton btnSave;
	private JButton btnCancel;
	private DepartmentInsert frameDepa = new DepartmentInsert();

	public BranchInsert(int type, DepartmentInsert fm) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.frameDepa=fm;
		lblNewLabel = new JLabel("Branch ID");
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		lblBranchName = new JLabel("Branch Name");
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSave_actionPerformed(e);
			}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnCancel_actionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBranchName)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(btnSave)
							.addGap(33)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtId)
							.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)))
					.addGap(21))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblBranchName))
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnSave))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	protected void do_btnSave_actionPerformed(ActionEvent e) {
		Branch branch = new Branch(txtId.getText(),txtName.getText(), true);
		ResultsMessage rs = new BaoBranch().insert(branch);
		if(rs.getNum() > 0 ) {
			frameDepa.comboBoxRemoveItem();
			frameDepa.comboBoxSetValue();
			frameDepa.comboBoxSelectItem(txtId.getText());
		}
		rs.showMessage(this);
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}

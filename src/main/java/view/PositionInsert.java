package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bao.BaoBranch;
import bao.BaoPosition;
import entity.Branch;
import entity.Position;
import helper.SetTileFrame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

public class PositionInsert extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtId;
	private JLabel lblBranchName;
	private JTextField txtName;
	private JButton btnSave;
	private JButton btnCancel;
	private int type;
	private JLabel lblTitle;
	private String id;
	private JCheckBox chckStatus;
	
	public PositionInsert() {}
	public PositionInsert(int type, String id) {
		this.type =type;
		this.id = id;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("Position ID");
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		lblBranchName = new JLabel("Position Name");
		
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
		
		lblTitle = new JLabel(SetTileFrame.getTitle(this.type, "Position"));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setForeground(Color.BLUE);
		
		chckStatus = new JCheckBox("Status");
		chckStatus.setVisible(false);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(168)
					.addComponent(btnSave)
					.addGap(62)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(114)
					.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addGap(17))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBranchName)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckStatus, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtId, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
								.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
							.addGap(17))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(16)
					.addComponent(lblTitle)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblBranchName))
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addComponent(chckStatus)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnSave))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		if(this.type==2) {
			loadFrameWhenEdit();
		}else {
			this.setVisible(true);
		}
	}
	
	protected void loadFrameWhenEdit() {
		Position pos = new BaoPosition().getFromId(this.id);
		if(pos.getId() != null) {
			txtId.setText(pos.getId());
			txtName.setText(pos.getName());
			chckStatus.setSelected(pos.isStatus());
			
			chckStatus.setVisible(true);
			txtId.setEditable(false);
			this.setVisible(true);
		}
		
	}
	
	protected void do_btnSave_actionPerformed(ActionEvent e) {
		if(type == 1) {
			new BaoPosition().insert(new Position(txtId.getText(), txtName.getText(), true)).showMessage(this);
		}else {
			new BaoPosition().update(new Position(txtId.getText(), txtName.getText(), chckStatus.isSelected())).showMessage(this);
		}
		
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}

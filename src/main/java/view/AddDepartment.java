package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bao.BaoBranch;
import bao.BaoDepartment;
import bao.BaoGetComboBox;
import bao.BaoPosition;
import entity.Branch;
import entity.CurrentUser;
import entity.Department;
import entity.Position;
import helper.GetArrayIndexJList;
import helper.GetIndexComboID;
import helper.SetTileFrame;
import modal.ComboItem;
import modal.ResultsMessage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;

public class AddDepartment extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblId;
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField txtId;
	private JTextField txtName;
	private JLabel lblBranchId;
	private List<ComboItem> listCB;
	private JButton btnNew;
	private JComboBox cbBranch;
	private CurrentUser cuser;
	private int type;
	private String id;
	private DepartmentManager dm;
	private int index;
	private JCheckBox chkStatus;
	private JLabel lblTitle;

	public AddDepartment() {}
	public AddDepartment(int type, String id, DepartmentManager dm, int index, CurrentUser cuser) {
		this.type=type;
		this.id=id;
		this.dm=dm;
		this.index=index;
		this.cuser=cuser;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblName = new JLabel("Name");
		
		lblId = new JLabel("ID");
		
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
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		lblBranchId = new JLabel("Branch ID");
		
		cbBranch = new JComboBox();
		
		btnNew = new JButton("+");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNew_actionPerformed(e);
			}
		});
		
		chkStatus = new JCheckBox("Status");
		chkStatus.setVisible(false);
		
		lblTitle = new JLabel(SetTileFrame.getTitle(this.type, "Position"));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setForeground(Color.BLUE);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(txtId, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBranchId, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
											.addGap(31)
											.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(18)
											.addComponent(cbBranch, 0, 251, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(12))
										.addComponent(chkStatus)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblId))
						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblName))
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(lblBranchId))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNew))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chkStatus)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnSave))
					.addGap(26))
		);
		contentPane.setLayout(gl_contentPane);
		firstLoad();
	}
	
	protected void firstLoad() {
		comboBoxSetValue();
		
		if(this.type==2) {
			loadFrameWhenEdit();
		}else {
			this.setVisible(true);
		}
	}
	
	protected void loadFrameWhenEdit() {
		Department dep = new BaoDepartment().getFromId(id);
		if(dep.getId() != null) {
			txtId.setText(dep.getId());
			txtName.setText(dep.getName());
			comboBoxSelectItem(dep.getBranch_id());
			chkStatus.setSelected(dep.isStatus());
			chkStatus.setVisible(true);
			txtId.setEditable(false);
			
			this.setVisible(true);
		}else 
			new ResultsMessage(-1, "["+id+"] - is not exits!").showMessage(this);
	}
	
	public void comboBoxRemoveItem() {
		cbBranch.removeAllItems();
	}
	
	public void comboBoxSetValue() {
		listCB = new BaoGetComboBox().getList("Branch", cuser.getUsername());
		for (ComboItem item :listCB) {
			cbBranch.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	
	public void comboBoxSelectItem(String id) {
		int index = GetIndexComboID.getIndex(listCB, id);
		if(index > -1) {
			cbBranch.setSelectedIndex(index);
		}
	}
	
	protected void do_btnSave_actionPerformed(ActionEvent e) {
		
		
		if(type == 1) {
			ResultsMessage rm = new BaoDepartment().insert(new Department(txtId.getText(), txtName.getText(), ((ComboItem)cbBranch.getSelectedItem()).getId(), true));
			if(rm.getNum()>0)
				dm.addNewToTable(txtId.getText());
			rm.showMessage(this);
		}else {
			ResultsMessage rm = new BaoDepartment().update(new Department(txtId.getText(), txtName.getText(), ((ComboItem)cbBranch.getSelectedItem()).getId(), chkStatus.isSelected()));
			if(rm.getNum()>0)
				dm.updateListFromID(index, txtId.getText());
			rm.showMessage(this);
		}
	}
	
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	protected void do_btnNew_actionPerformed(ActionEvent e) {
		new AddBranch(1,null, this, null,0).setVisible(true);
	}
}

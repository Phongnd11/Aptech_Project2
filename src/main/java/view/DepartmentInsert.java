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
import entity.Branch;
import entity.Department;
import helper.GetIndexComboID;
import modal.ComboItem;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DepartmentInsert extends JFrame {

	private JPanel contentPane;
	private JLabel lblName;
	private JLabel lblId;
	private JButton btnSave;
	private JButton btnCancel;
	private JTextField txtId;
	private JTextField txtName;
	private JLabel lblBranchId;
	public JComboBox cbBranch;
	public List<ComboItem> listCB;
	private JButton btnNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentInsert frame = new DepartmentInsert();
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
	public DepartmentInsert() {
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
		comboBoxSetValue();
		
		btnNew = new JButton("+");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNew_actionPerformed(e);
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
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
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(cbBranch, 0, 241, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNew, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)))))
					.addGap(26))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
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
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnSave))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void comboBoxRemoveItem() {
		cbBranch.removeAllItems();
	}
	
	public void comboBoxSetValue() {
		listCB = new BaoGetComboBox().getList("Branch");
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
		new BaoDepartment().insert(new Department(txtId.getText(), txtName.getText(), ((ComboItem)cbBranch.getSelectedItem()).getId(), true)).showMessage(this);;
	}
	
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	protected void do_btnNew_actionPerformed(ActionEvent e) {
		new BranchInsert(1, this).setVisible(true);
	}
}

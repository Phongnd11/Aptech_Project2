package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import bao.BaoGetComboBox;
import bao.BaoTransfer;
import entity.CurrentUser;
import entity.Emp_project;
import entity.Project_branch;
import entity.Transfer;
import modal.ComboItem;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class UserTransfer extends JInternalFrame {
	private JLabel lblNewLabel;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel panel_1;
	private List<Transfer> list;
	private int i = 0;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JComboBox cbbNewProject;
	private JLabel lblNewLabel_4;
	private JScrollPane scrollPane_1;
	private JTextPane txtPane;
	private JButton btnComfirm;
	private List<ComboItem> listCB;
	private List<ComboItem> listCB1;
	private JComboBox cbbOldProject;
	private CurrentUser cuser;
	
	public UserTransfer(CurrentUser cuser) {
		this.cuser = cuser;
		setBounds(0, 0, 900, 430);
		
		lblNewLabel = new JLabel("Transfer");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
							.addGap(10))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(12, Short.MAX_VALUE))
		);
		
		panel = new JPanel();
		tabbedPane.addTab("   History   ", null, panel, null);
		
		scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		//Load table transfer
		loadListTransfer();
		
		panel_1 = new JPanel();
		tabbedPane.addTab("   Transfer   ", null, panel_1, null);
		
		lblNewLabel_1 = new JLabel("Transfer Project");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblNewLabel_2 = new JLabel("Curren Project");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_3 = new JLabel("Select the project you want to transfer");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbbNewProject = new JComboBox();
		comboBoxSetValue();
		
		lblNewLabel_4 = new JLabel("Reason for transfer");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		scrollPane_1 = new JScrollPane();
		
		btnComfirm = new JButton("Comfirm");
		btnComfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnComfirmActionPerformed(e);
			}
		});
		
		cbbOldProject = new JComboBox();
		comboBoxSetValue1();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(66)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(cbbOldProject, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cbbNewProject, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4, Alignment.LEADING)
						.addComponent(lblNewLabel_3, Alignment.LEADING)
						.addComponent(lblNewLabel_2, Alignment.LEADING)
						.addComponent(btnComfirm, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(492, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbOldProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(cbbNewProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addComponent(btnComfirm)
					.addContainerGap())
		);
		
		txtPane = new JTextPane();
		scrollPane_1.setViewportView(txtPane);
		panel_1.setLayout(gl_panel_1);
		getContentPane().setLayout(groupLayout);
//		BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI());
//		for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
//		    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
//		}
	}
	
	private void loadListTransfer() {
		list = new BaoTransfer().getTranfer(cuser.getUsername());
		DefaultTableModel defaultTable = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table.setModel(defaultTable);

		defaultTable.addColumn("#");
		defaultTable.addColumn("id");
		defaultTable.addColumn("Old Project");
		defaultTable.addColumn("New Project");
		defaultTable.addColumn("Reason");
		defaultTable.addColumn("Censorship");
		i = 0;
		for (Transfer transf : list) {
			if (transf.isUser_watch()) {
				defaultTable.addRow(new Object[] { ++i, transf.getId(), transf.getOldProject(), transf.getNewProject(),
						transf.getReason(), transf.isCensorship() ? "Accept" : "Refuse" 
							});
			}else {
				defaultTable.addRow(new Object[] { ++i, transf.getId(), transf.getOldProject(), transf.getNewProject(),
						transf.getReason(), "Waiting for approval"
							});
			}
		}
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getColumnModel().getColumn(4).setPreferredWidth(267);
		table.getColumnModel().getColumn(5).setPreferredWidth(150);
	}
	
	private void comboBoxSetValue() {
		listCB = new BaoGetComboBox().getList("project", null);
		for (ComboItem item :listCB) {
			cbbNewProject.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	private void comboBoxSetValue1() {
		listCB1 = new BaoGetComboBox().getList("project", cuser.getUsername());
		for (ComboItem item :listCB) {
			cbbOldProject.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	protected void btnComfirmActionPerformed(ActionEvent e) {
		String newProject = ((ComboItem) cbbNewProject.getSelectedItem()).getId();
		String oldProject = ((ComboItem) cbbOldProject.getSelectedItem()).getId();
		String reason = txtPane.getText();
		
		if(reason.equals("")) {
			JOptionPane.showMessageDialog(this, "Fail: You must fill out all information.", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
			new BaoTransfer().insert(cuser.getUsername(), oldProject, newProject, reason).showMessage(null);
		}
		
		
	}
}

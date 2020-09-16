package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bao.BaoEmp_info;
import bao.BaoEmployee;
import bao.BaoGetComboBox;
import entity.CurrentUser;
import entity.Emp_info;
import helper.SetTileFrame;
import modal.ComboItem;
import modal.EmployeeView;
import modal.ListComboItem;
import modal.ListGender;
import modal.ResultsMessage;

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
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JLabel blbTitle;
	private int type;
	private String id;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtID;
	private JTextField txtName;
	private JButton btnSave;
	private JButton btnCancel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtEducation;
	private JTextField txtSpecialize;
	private JTextField txtPhone;
	private int btntype;
	private JCheckBox chbStatus;
	private JComboBox cbxDepartment;
	private List<ComboItem> listCBPosition;
	private List<ComboItem> listCBDepartment;
	private List<ComboItem> listGender;
	private JComboBox cbxPosition;
	private JLabel lblNewLabel_9;
	private JDateChooser calDate;
	private CurrentUser cuser;
	private JLabel lblNewLabel_10;
	private JComboBox cbGender;
	private EmployeeManager em;
	private int index;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddEmployee frame = new AddEmployee();
//					frame.setUndecorated(true);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
//	public AddEmployee(int type, String id, DepartmentManager dm, int index, CurrentUser cuser){	
//	}
//	public AddEmployee() {
	public AddEmployee(int type, String id, EmployeeManager em, int index, CurrentUser cuser) {
		this.type = type;
		this.id = id;
		this.cuser = cuser;
		this.em = em;
		this.index = index;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 641, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		blbTitle = new JLabel(SetTileFrame.getTitle(this.type, "Employee"));
		blbTitle.setForeground(Color.BLUE);
		blbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		blbTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSaveActionPerformed(e);
			}
		});
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1ActionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(blbTitle, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(191, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(blbTitle, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		
		panel = new JPanel();
		tabbedPane.addTab("   Profile   ", null, panel, null);
		
		lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_3 = new JLabel("Department:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_4 = new JLabel("Position");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtID = new JTextField();
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		chbStatus = new JCheckBox("Status");
		chbStatus.setVisible(false);
		
		cbxDepartment = new JComboBox();
		comboBoxSetValue1();
		
		cbxPosition = new JComboBox();
		comboBoxSetValue2();
		
		lblNewLabel_9 = new JLabel("Date Join");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		calDate = new JDateChooser();
		calDate.setDateFormatString("yyyy-MM-dd");
		calDate.setDate(new Date());
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(50))
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_9)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)))
					.addGap(34)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(chbStatus, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxPosition, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cbxDepartment, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtID)
						.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
						.addComponent(calDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(cbxDepartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(cbxPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_9)
						.addComponent(calDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(chbStatus)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("   Details   ", null, panel_1, null);
		
		lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_6 = new JLabel("Education");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_7 = new JLabel("Specialize");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		
		txtEducation = new JTextField();
		txtEducation.setColumns(10);
		
		txtSpecialize = new JTextField();
		txtSpecialize.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Gender");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cbGender = new JComboBox();
		comboBoxSetValue3();
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(cbGender)
						.addComponent(txtPhone)
						.addComponent(txtSpecialize)
						.addComponent(txtEducation)
						.addComponent(txtAddress)
						.addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
					.addGap(141))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(11))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(cbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(txtAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtEducation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(txtSpecialize, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(txtPhone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
		if(type != 1) {
			LoadFrameWhenEdit();
		}else {
			this.setVisible(true);
		}
	}
	
	private void LoadFrameWhenEdit() {
		EmployeeView emp = new BaoEmployee().getFromId(id);
		if(emp.getId() != null) {
			txtID.setText(emp.getId());
			txtName.setText(emp.getName());
			cbGender.setSelectedIndex(new ListComboItem().findIdToIndex(emp.getGender()));
			cbxDepartment.setSelectedIndex(new ListComboItem(listCBDepartment).findIdToIndex(emp.getDepartment_id()));
			cbxPosition.setSelectedIndex(new ListComboItem(listCBPosition).findIdToIndex(emp.getPosition_id()));
			txtAddress.setText(emp.getAddress());
			txtEducation.setText(emp.getEducation());
			txtSpecialize.setText(emp.getSpecialize());
			txtPhone.setText(emp.getPhone());
			txtEmail.setText(emp.getEmail());
			calDate.setDate(emp.getDatejoin() == null ? null : java.sql.Date.valueOf(emp.getDatejoin()));
			chbStatus.setSelected(emp.isStatus());
			
			chbStatus.setVisible(true);
			txtID.setEditable(false);
			
			this.setVisible(true);
			
			if(type==3) {
				btnSave.setText("Edit");
				visibleFrame(false);
			}
		}
	}
	
	private void visibleFrame(boolean bool) {
		txtID.setEnabled(bool);
		txtName.setEnabled(bool);
		cbGender.setEnabled(bool);
		cbxDepartment.setEnabled(bool);
		cbxPosition.setEnabled(bool);
		txtAddress.setEnabled(bool);
		txtEducation.setEnabled(bool);
		txtSpecialize.setEnabled(bool);
		txtPhone.setEnabled(bool);
		txtEmail.setEnabled(bool);
		calDate.setEnabled(bool);
		chbStatus.setEnabled(bool);
	}
	
	protected void btnNewButton_1ActionPerformed(ActionEvent e) {
		this.dispose();
	}
	
	private void comboBoxSetValue1() {
		listCBDepartment = new BaoGetComboBox().getList("Department", cuser.getUsername());
		for (ComboItem item :listCBDepartment) {
			cbxDepartment.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	
	private void comboBoxSetValue2() {
		listCBPosition = new BaoGetComboBox().getListAll("Position", cuser.getUsername());
		for (ComboItem item :listCBPosition) {
			cbxPosition.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	
	private void comboBoxSetValue3() {
		listGender = new BaoGetComboBox().getListGender();
		for (ComboItem item :listGender) {
			cbGender.addItem(new ComboItem(item.getId(), item.getValue()));
		}
	}
	
	protected void btnSaveActionPerformed(ActionEvent e) {
		if(type==3) {
			type=2;
			btnSave.setText("Save");
			visibleFrame(true);
		}else {
			LocalDate datejoin = calDate.getDate() == null ? null : calDate.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			String gender = cbGender.getSelectedItem() == null ? null : ((ComboItem) cbGender.getSelectedItem()).getId();
			if(type==1) {
				EmployeeView empV = new EmployeeView(txtID.getText(), txtName.getText(), ((ComboItem) cbxDepartment.getSelectedItem()).getId() , ((ComboItem) cbxPosition.getSelectedItem()).getId(), true,
						txtAddress.getText(), txtEducation.getText(), txtSpecialize.getText(), txtPhone.getText(), txtEmail.getText(), datejoin, gender);
				ResultsMessage rm = new BaoEmployee().insert(empV);
//				update
				rm.showMessage(this);
			} else {
				EmployeeView empV = new EmployeeView(txtID.getText(), txtName.getText(), ((ComboItem) cbxDepartment.getSelectedItem()).getId() , ((ComboItem) cbxPosition.getSelectedItem()).getId(), chbStatus.isSelected(),
						txtAddress.getText(), txtEducation.getText(), txtSpecialize.getText(), txtPhone.getText(), txtEmail.getText(), datejoin, gender);
				ResultsMessage rm = new BaoEmployee().update(empV);
//				update
				rm.showMessage(this);
			}
		}	
	}
}

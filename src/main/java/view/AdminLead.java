package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.FlowLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class AdminLead extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JLabel lblLogo;
	private JButton btnDataProject;
	private JButton btnDataStaff;
	private JButton btnDataTransfer;
	private JDesktopPane desktopPane_1;
	private JLabel lblBg1;
	private JLabel lblCompany;
	private JRadioButton rdbtnBranch1;
	private JRadioButton rdbtnBranch2;
	private JRadioButton rdbtnBranch3;
	private JScrollPane scrollPane;
	private JButton btnAddProject;
	private JButton btnUpdateProject;
	private JButton btnDeleteProject;
	private JTextField txtSearchProject;
	private JButton btnSearchProject;
	private JLabel lblBackground2;
	private JTable table;
	private JPanel panelStaff;
	private JButton btnAddStaff;
	private JButton btnUpdateStaff;
	private JButton btnDeleteStaff;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JButton btnSearchStaff;
	private JTextField txtSearchStaff;
	private JPanel panelProject;
	private JPanel PanelTranfer;
	private JScrollPane scrollPane_2;
	private JButton btnAddTransfer;
	private JButton btnUpdateTransfer;
	private JButton btnDeleteTransfer;
	private JButton btnBranch;
	private JButton btnSearchTransfer;
	private JTextField txtSearchTransfer;
	private JButton btnConfirmTransfer;
	private JButton btnRefuseTransfer;
	private JPanel panelBranch;
	private JScrollPane scrollPane_3;
	private JButton btnSearchBranch;
	private JButton btnAddBranch;
	private JButton btnUpdateBranch;
	private JButton btnDeleteBranch;
	private JTextField txtSearchBranch;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLead frame = new AdminLead();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
	public AdminLead() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		
		desktopPane_1 = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 1064, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(54, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(desktopPane_1, Alignment.LEADING)
						.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		lblCompany = new JLabel("Company");
		lblCompany.setForeground(Color.WHITE);
		lblCompany.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCompany.setBounds(10, 11, 147, 32);
		desktopPane_1.add(lblCompany);
		
		rdbtnBranch1 = new JRadioButton("Chi nhanh 1");
		buttonGroup.add(rdbtnBranch1);
		rdbtnBranch1.setBounds(314, 60, 386, 23);
		desktopPane_1.add(rdbtnBranch1);
		
		rdbtnBranch2 = new JRadioButton("Chi nhanh 2");
		buttonGroup.add(rdbtnBranch2);
		rdbtnBranch2.setBounds(314, 86, 386, 23);
		desktopPane_1.add(rdbtnBranch2);
		
		rdbtnBranch3 = new JRadioButton("chi nhanh 3");
		buttonGroup.add(rdbtnBranch3);
		rdbtnBranch3.setBounds(314, 112, 386, 23);
		desktopPane_1.add(rdbtnBranch3);

// Panel Staff
		panelStaff = new JPanel();
		panelStaff.setVisible(false);
		panelStaff.setBounds(24, 154, 1011, 496);
		desktopPane_1.add(panelStaff);
		btnAddStaff = new JButton("Add Staff");
		btnAddStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddStaffActionPerformed(e);
			}
		});
		
		btnUpdateStaff = new JButton("Update Staff");
		btnUpdateStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateStaffActionPerformed(e);
			}
		});
		
		btnDeleteStaff = new JButton("Delete Staff");
		
		scrollPane_1 = new JScrollPane();
		
		btnSearchStaff = new JButton("Search");
		
		txtSearchStaff = new JTextField();
		txtSearchStaff.setColumns(10);
		GroupLayout gl_panelStaff = new GroupLayout(panelStaff);
		gl_panelStaff.setHorizontalGroup(
			gl_panelStaff.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelStaff.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAddStaff, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateStaff, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteStaff, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addGap(323)
					.addComponent(txtSearchStaff, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSearchStaff, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
		);
		gl_panelStaff.setVerticalGroup(
			gl_panelStaff.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelStaff.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelStaff.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddStaff)
						.addComponent(btnUpdateStaff)
						.addComponent(btnDeleteStaff)
						.addComponent(txtSearchStaff, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearchStaff))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		panelStaff.setLayout(gl_panelStaff);
// End Panel Staff		

		
// Panel Project
		panelProject = new JPanel();
		panelProject.setVisible(false);
		panelProject.setBounds(24, 154, 1011, 496);
		desktopPane_1.add(panelProject);
		
		scrollPane = new JScrollPane();
		
		btnAddProject = new JButton("Add Project");
		btnAddProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddProjectActionPerformed(e);
			}
		});
		
		btnUpdateProject = new JButton("Update Project");
		btnUpdateProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateProjectActionPerformed(e);
			}
		});
		
		btnDeleteProject = new JButton("Delete Project");		
		txtSearchProject = new JTextField();
		txtSearchProject.setColumns(10);
		
		btnSearchProject = new JButton("Search");
		GroupLayout gl_panelProject = new GroupLayout(panelProject);
		gl_panelProject.setHorizontalGroup(
			gl_panelProject.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelProject.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAddProject, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateProject, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteProject, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGap(276)
					.addComponent(txtSearchProject, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSearchProject, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(30, Short.MAX_VALUE))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
		);
		gl_panelProject.setVerticalGroup(
			gl_panelProject.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelProject.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelProject.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddProject)
						.addComponent(btnUpdateProject)
						.addComponent(btnDeleteProject)
						.addComponent(txtSearchProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearchProject))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panelProject.setLayout(gl_panelProject);
		
// End Panel Project
		
// Panel Transfer
		PanelTranfer = new JPanel();
		PanelTranfer.setVisible(false);
		PanelTranfer.setBounds(24, 154, 1011, 496);
		desktopPane_1.add(PanelTranfer);
		
		scrollPane_2 = new JScrollPane();
		
		btnAddTransfer = new JButton("Add Tranfer");
		btnAddTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddTransferActionPerformed(e);
			}
		});
		
		btnUpdateTransfer = new JButton("Update Transfer");
		btnUpdateTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnUpdateTransferActionPerformed(e);
			}
		});
		
		btnDeleteTransfer = new JButton("Delete Transfer");
		
		btnSearchTransfer = new JButton("Search");
		
		txtSearchTransfer = new JTextField();
		txtSearchTransfer.setColumns(10);
		
		btnConfirmTransfer = new JButton("Comfirm");
		
		btnRefuseTransfer = new JButton("Refuse");
		GroupLayout gl_PanelTranfer = new GroupLayout(PanelTranfer);
		gl_PanelTranfer.setHorizontalGroup(
			gl_PanelTranfer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelTranfer.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAddTransfer, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateTransfer, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteTransfer, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnConfirmTransfer, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRefuseTransfer, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addComponent(txtSearchTransfer, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSearchTransfer, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
				.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
		);
		gl_PanelTranfer.setVerticalGroup(
			gl_PanelTranfer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelTranfer.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_PanelTranfer.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddTransfer)
						.addComponent(btnUpdateTransfer)
						.addComponent(btnDeleteTransfer)
						.addComponent(btnConfirmTransfer)
						.addComponent(btnRefuseTransfer)
						.addComponent(txtSearchTransfer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearchTransfer))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
		);
		
		table_3 = new JTable();
		scrollPane_2.setViewportView(table_3);
		PanelTranfer.setLayout(gl_PanelTranfer);	
// End Transfer
		
// Panel branch
		
		panelBranch = new JPanel();
		panelBranch.setVisible(false);
		panelBranch.setBounds(24, 154, 1011, 496);
		desktopPane_1.add(panelBranch);
		
		scrollPane_3 = new JScrollPane();
		
		btnSearchBranch = new JButton("Search");
		
		btnAddBranch = new JButton("Add Branch");
		
		btnUpdateBranch = new JButton("Update  Branch");
		
		btnDeleteBranch = new JButton("Delete Branch");
		
		txtSearchBranch = new JTextField();
		txtSearchBranch.setColumns(10);
		GroupLayout gl_panelBranch = new GroupLayout(panelBranch);
		gl_panelBranch.setHorizontalGroup(
			gl_panelBranch.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelBranch.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnAddBranch, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnUpdateBranch, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnDeleteBranch, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(224)
					.addComponent(txtSearchBranch, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSearchBranch, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
				.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
		);
		gl_panelBranch.setVerticalGroup(
			gl_panelBranch.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBranch.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelBranch.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddBranch)
						.addComponent(btnUpdateBranch)
						.addComponent(btnDeleteBranch)
						.addComponent(txtSearchBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearchBranch))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		scrollPane_3.setViewportView(table_2);
		panelBranch.setLayout(gl_panelBranch);
		
// end Panel Branch
		
		lblBackground2 = new JLabel("New label");
		Image imgbg2 = new ImageIcon(this.getClass().getResource("/bg2.jpg")).getImage().getScaledInstance(1064, 674, Image.SCALE_DEFAULT);
		lblBackground2.setIcon(new ImageIcon(imgbg2));
		lblBackground2.setBounds(0, 0, 1064, 674);
		desktopPane_1.add(lblBackground2);
		

		
		lblLogo = new JLabel("New label");
		Image imglogo = new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage().getScaledInstance(187, 174, Image.SCALE_DEFAULT);
		lblLogo.setIcon(new ImageIcon(imglogo));
		lblLogo.setBounds(20, 11, 177, 174);
		desktopPane.add(lblLogo);
		
		btnDataProject = new JButton("Project management");
		btnDataProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDataProjectActionPerformed(e);
			}
		});
		btnDataProject.setBounds(0, 277, 223, 50);
		desktopPane.add(btnDataProject);
		
		btnDataStaff = new JButton("Staff manager");
		btnDataStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDataStaffActionPerformed(e);
			}
		});

		btnDataStaff.setBounds(0, 325, 223, 50);
		desktopPane.add(btnDataStaff);
		
		btnDataTransfer = new JButton("Manage transfer");
		btnDataTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDataTransferActionPerformed(e);
			}
		});
	
		btnDataTransfer.setBounds(0, 374, 223, 50);
		desktopPane.add(btnDataTransfer);
		
		btnBranch = new JButton("Branch manager");
		btnBranch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBranchActionPerformed(e);
			}
		});
		btnBranch.setBounds(0, 421, 223, 50);
		desktopPane.add(btnBranch);
		
		lblBg1 = new JLabel("New label");
		Image imgBg1 = new ImageIcon(this.getClass().getResource("/bg3.jpg")).getImage().getScaledInstance(700, 674, Image.SCALE_DEFAULT);
		lblBg1.setIcon(new ImageIcon(imgBg1));
		lblBg1.setBounds(0, 0, 223, 674);
		desktopPane.add(lblBg1);
		
		
		contentPane.setLayout(gl_contentPane);
	}
	
	protected void btnDataProjectActionPerformed(ActionEvent e) {
		panelProject.setVisible(true);
		PanelTranfer.setVisible(false);
		panelStaff.setVisible(false);
		panelBranch.setVisible(false);
	}

	protected void btnDataStaffActionPerformed(ActionEvent e) {
		panelStaff.setVisible(true);
		panelProject.setVisible(false);
		PanelTranfer.setVisible(false);
		panelBranch.setVisible(false);
	}
	protected void btnDataTransferActionPerformed(ActionEvent e) {
		PanelTranfer.setVisible(true);
		panelStaff.setVisible(false);
		panelProject.setVisible(false);
		panelBranch.setVisible(false);
	}
	protected void btnBranchActionPerformed(ActionEvent e) {
		panelBranch.setVisible(true);
		PanelTranfer.setVisible(false);
		panelStaff.setVisible(false);
		panelProject.setVisible(false);
	}

	protected void btnAddProjectActionPerformed(ActionEvent e) {
//		AddProject.main(null);
	}
	protected void btnAddStaffActionPerformed(ActionEvent e) {
		AddStaff.main(null);
	}
	protected void btnUpdateStaffActionPerformed(ActionEvent e) {
		UpdateStaff.main(null);
	}
	protected void btnAddTransferActionPerformed(ActionEvent e) {
		AddTransfer.main(null);
	}
	
	protected void btnUpdateTransferActionPerformed(ActionEvent e) {
		UpdateTransfer.main(null);
	}
	
	protected void btnUpdateProjectActionPerformed(ActionEvent e) {
		UpdateProject.main(null);
	}
}

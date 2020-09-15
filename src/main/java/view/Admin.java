package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bao.BaoBranch;
import bao.BaoPosition;
import entity.Branch;
import entity.CurrentUser;
import entity.Position;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JLabel lblLogo;
	private JButton btnProject;
	private JButton btnStaff;
	private JButton btnTransfer;
	private JLabel lblBg1;
	private JDesktopPane desktopPane_1;
	private JLabel lblNewLabel_6;
	private JLabel lblBackground2;
	private JLabel lblNewLabel_7;
	private JPanel panelProject;
	private JTable tblProject;
	private JPanel panelStaff;
	private JButton btnBranch;
	private JPanel panelBranch;
	private JTable tblBranch;
	private JPanel panelTransfer;
	private JButton btnPosition;
	private JPanel panelPosition;
	private JTable tblPosition;
	private JMenuItem mntmAdd;
	private JMenuItem mntmEdit;
	private JMenuItem mntmDelete;
	private JMenuItem mntmReload;
	private JPanel panel;
	private JDesktopPane desktopPane_2;
	private int i = 0;
	private JButton btnDepartment;
	private CurrentUser cuser = new CurrentUser();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin(null);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Admin(CurrentUser cuser) {
		this.cuser=cuser;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		desktopPane = new JDesktopPane();

		desktopPane_1 = new JDesktopPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(18)
								.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(desktopPane_1,
										GroupLayout.PREFERRED_SIZE, 1080, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(46, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(40)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(desktopPane, Alignment.LEADING).addComponent(desktopPane_1,
										Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
						.addContainerGap(77, Short.MAX_VALUE)));

		lblNewLabel_6 = new JLabel("Company IT");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_6.setBounds(21, 21, 147, 32);
		desktopPane_1.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("Branch:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(0, 64, 981, 46);
		desktopPane_1.add(lblNewLabel_7);

		panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(48, 121, 1001, 475);
		desktopPane_1.add(panel);

		desktopPane_2 = new JDesktopPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(desktopPane_2,
				GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(desktopPane_2,
				GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE));
		panel.setLayout(gl_panel);

		lblBackground2 = new JLabel("New label");
		Image imgbg2 = new ImageIcon(this.getClass().getResource("../img/bg2.jpg")).getImage().getScaledInstance(1093, 699,
				Image.SCALE_DEFAULT);
		lblBackground2.setIcon(new ImageIcon(imgbg2));
		lblBackground2.setBounds(0, 0, 1080, 622);
		desktopPane_1.add(lblBackground2);

		lblLogo = new JLabel("New label");
		Image imglogo = new ImageIcon(this.getClass().getResource("../img/img1.jpg")).getImage().getScaledInstance(180, 160,
				Image.SCALE_DEFAULT);
		lblLogo.setIcon(new ImageIcon(imglogo));
		lblLogo.setBounds(10, 11, 180, 160);
		desktopPane.add(lblLogo);

		btnProject = new JButton("Project management");
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnProjectActionPerformed(e);
			}
		});
		btnProject.setBounds(0, 441, 204, 50);
		desktopPane.add(btnProject);

		btnStaff = new JButton("Employee manager");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStaffActionPerformed(e);
			}
		});
		btnStaff.setBounds(0, 491, 204, 50);
		desktopPane.add(btnStaff);

		btnTransfer = new JButton("Transfer Manager");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTransferActionPerformed(e);
			}
		});
		btnTransfer.setBounds(0, 391, 204, 50);
		desktopPane.add(btnTransfer);

		btnPosition = new JButton("Position Manager");
		btnPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPositionActionPerformed(e);
			}
		});
		
		btnPosition.setBounds(0, 293, 204, 50);
		desktopPane.add(btnPosition);

		btnBranch = new JButton("Branch Manager");
		btnBranch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBranchActionPerformed(e);
			}
		});
		
		btnDepartment = new JButton("Department Manager");
		btnDepartment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDepartmentActionPerformed(e);
			}
		});
		btnDepartment.setBounds(0, 342, 204, 50);
		desktopPane.add(btnDepartment);
		
		btnBranch.setBounds(0, 243, 204, 50);
		desktopPane.add(btnBranch);

		lblBg1 = new JLabel("New label");
		Image imgBg1 = new ImageIcon(this.getClass().getResource("../img/bg3.jpg")).getImage().getScaledInstance(700, 717,
				Image.SCALE_DEFAULT);
		lblBg1.setIcon(new ImageIcon(imgBg1));
		lblBg1.setBounds(0, -3, 204, 625);
		desktopPane.add(lblBg1);
		
		contentPane.setLayout(gl_contentPane);
	}

	protected void btnProjectActionPerformed(ActionEvent e) {
		if (i != 1) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			ProjectManager sub = new ProjectManager();
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 1;
		}

	}

	protected void btnStaffActionPerformed(ActionEvent e) {
		if (i != 2) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			EmployeeManager sub = new EmployeeManager(cuser);
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 2;
		}
	}

	protected void btnTransferActionPerformed(ActionEvent e) {
		if (i != 3) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			TransferManager sub = new TransferManager();
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 3;
		}

	}

	protected void btnBranchActionPerformed(ActionEvent e) {
		if (i != 4) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			BranchManager sub = new BranchManager(cuser);
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 4;
		}
	}

	protected void btnPositionActionPerformed(ActionEvent e) {
		if (i != 5) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			PositionManager sub = new PositionManager(cuser);
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 5;
		}
	}
	protected void btnDepartmentActionPerformed(ActionEvent e) {
		if (i != 6) {
			panel.setVisible(true);
			desktopPane_2.removeAll();
			DepartmentManager sub = new DepartmentManager(cuser);
			sub.setVisible(true);
			desktopPane_2.add(sub);
			i = 6;
		}
	}
}

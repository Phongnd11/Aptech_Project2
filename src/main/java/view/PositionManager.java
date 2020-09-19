package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.DefaultRowSorter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

import bao.BaoBranch;
import bao.BaoPosition;
import bao.BaoProject;
import entity.Branch;
import entity.CurrentUser;
import entity.GetProject;
import entity.Position;
import modal.ResultsMessage;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

import java.awt.Font;
import java.awt.Point;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.FocusAdapter;

public class PositionManager extends JInternalFrame {
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnLoad;
	private JTextField txtFilter;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel;
	private JMenuItem mntmAdd;
	private JMenuItem mntmEdit;
	private JMenuItem mntmDelete;
	private JMenuItem mntmReload;
	private int i;
	private List<Position> list;
	private JButton btnLoadAll;
	private CurrentUser cuser = new CurrentUser();
	
	public PositionManager(CurrentUser cuser) {
		this.cuser = cuser;
		setBounds(-15, -27, 1030, 505);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddActionPerformed(e);
			}
		});
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditActionPerformed(e);
			}
		});
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteActionPerformed(e);
			}
		});
		
		btnLoad = new JButton("Active");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoadActionPerformed(e);
			}
		});
		
		txtFilter = new JTextField("Search");
		txtFilter.setForeground(Color.GRAY);
		txtFilter.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				txtFilterKeyPressed(e);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				txtFilterKeyReleased(e);
			}
		});
		txtFilter.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtFilterFocusGained(e);
			}
			@Override
			public void focusLost(FocusEvent e) {
				txtFilterFocusLost(e);
			}
		});
		txtFilter.setColumns(10);
		
		scrollPane = new JScrollPane();
		
		lblNewLabel = new JLabel("Position Manager");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		btnLoadAll = new JButton("Load All");
		btnLoadAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoadAllActionPerformed(e);
			}
		});
	
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
							.addContainerGap())
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLoad, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLoadAll, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEdit, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtFilter, 319, 319, 319)
							.addContainerGap(91, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLoad)
						.addComponent(btnLoadAll)
						.addComponent(btnAdd)
						.addComponent(btnEdit)
						.addComponent(btnDelete)
						.addComponent(txtFilter, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setAutoCreateRowSorter(true);
	
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		table.addMouseListener(new MouseAdapter() {
		    public void mousePressed(MouseEvent e) {
		        doubleClickRowOnTable(e);
		    }
		});
//		
//		BasicInternalFrameUI basicInternalFrameUI = ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI());
//		for (MouseListener listener : basicInternalFrameUI.getNorthPane().getMouseListeners()) {
//		    basicInternalFrameUI.getNorthPane().removeMouseListener(listener);
//		}
	}
	
	protected void btnLoadActionPerformed(ActionEvent e) {
		
		list = new BaoPosition().getAll(cuser.getUsername(), false);
		loadListToTable();
	}
	protected void btnLoadAllActionPerformed(ActionEvent e) {
		list = new BaoPosition().getAll(cuser.getUsername(), true);
		loadListToTable();
	}
	
	protected void btnAddActionPerformed(ActionEvent e) {
		new AddPosition(1, null, cuser, 0, this);
	}
	
	protected void btnEditActionPerformed(ActionEvent e) {
		
		int row = table.getSelectedRow();
		if(row == -1) {
			JOptionPane.showMessageDialog(this, "Select Row on table", "Error", JOptionPane.ERROR_MESSAGE);
		}else {
			new AddPosition(2,(String) table.getValueAt(row, 1) , cuser, (Integer) table.getValueAt(row, 0) -1, this);
		}
	}
	
	protected void btnDeleteActionPerformed(ActionEvent e) {
		int row = table.getSelectedRow();
		if(row == -1) {
			JOptionPane.showMessageDialog(this, "Select Row on table", "Error", JOptionPane.ERROR_MESSAGE);
		}else {

			if(!(boolean) table.getValueAt(row, 6)) {
				JOptionPane.showMessageDialog(this, "Status is fasle!", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				String id = (String) table.getValueAt(row, 1);
				int confirm = JOptionPane.showConfirmDialog(this, "Confirm delete ID: " + id, "Confirm", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					ResultsMessage rm = new BaoPosition().delete(id);
					int index = (int) table.getValueAt(row, 0);
					rm.showMessage(null);
					if(rm.getNum() == 2)
						updateListFromID(index -1, id);
					if(rm.getNum() == 1)
						btnLoadActionPerformed(e);
				}
			}
		}
	}
	
	private void loadListToTable() {
		DefaultTableModel defaultTable = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table.setModel(defaultTable);
		
		defaultTable.addColumn("#");
		defaultTable.addColumn("Id");
		defaultTable.addColumn("Name");
		defaultTable.addColumn("Branch");
		defaultTable.addColumn("List Branch");
		defaultTable.addColumn("List Department");
		defaultTable.addColumn("Status");
		i=0;
		for(Position po : list) {
			defaultTable.addRow(new Object[] {
				++i, po.getId(), po.getName(), po.getBranch_id(),po.getListBranch(),po.getListDepartment(), po.isStatus()
			});
		}
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(5).setPreferredWidth(300);
		table.getColumnModel().getColumn(6).setPreferredWidth(50);
		createPopupMenu();
	}
	
	 public void addNewToTable(String id) {
		Position po = new BaoPosition().getFromId(id);
    	list.add(po);
    	DefaultTableModel model = (DefaultTableModel) table.getModel();
    	model.addRow(new Object[] {
    			++i, po.getId(), po.getName(), po.getBranch_id(),po.getListBranch(),po.getListDepartment(), po.isStatus()
		});
	 }
	 
	public void updateListFromID(int index, String id) {
		Position po = new BaoPosition().getFromId(id);
		list.set(index, po);
		loadListToTable();
	}
	
	private void createPopupMenu() {
		mntmReload = new JMenuItem("Branch Active");
		mntmReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLoadActionPerformed(e);
			}
		});
		
        mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddActionPerformed(e);
			}
		});
		
		mntmEdit = new JMenuItem("Edit");
		mntmEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditActionPerformed(e);
			}
		});
		
		mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDeleteActionPerformed(e);
			}
		});
		
		JPopupMenu popup = new JPopupMenu();
        popup.add(mntmReload);
        popup.add(mntmAdd);
        popup.add(mntmEdit);
        popup.add(mntmDelete);
        MouseListener popupListener = new PopupListener(popup);
        table.addMouseListener(popupListener);
        clearFind();
    }
    
    private class PopupListener extends MouseAdapter {

        private JPopupMenu popup;

        PopupListener(JPopupMenu popupMenu) {
            popup = popupMenu;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            maybeShowPopup(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (table.getSelectedRow() != -1) {
                maybeShowPopup(e);
            }
        }

        private void maybeShowPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }
	
	protected void doubleClickRowOnTable(MouseEvent e) {
		JTable table =(JTable) e.getSource();
        Point point = e.getPoint();
        int row = table.rowAtPoint(point);
        if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
        	new AddPosition(2,(String) table.getValueAt(row, 1) , cuser, (Integer) table.getValueAt(row, 0) -1, this);
        }
	}
	
	protected void do_txtFind(KeyEvent e, String find) {
		DefaultRowSorter sorter =(DefaultRowSorter) table.getRowSorter();
		sorter.setRowFilter(RowFilter.regexFilter(find));
		sorter.setSortKeys(null);
	}
	
	protected void do_txtFind(KeyEvent e, String find, int index) {
		DefaultRowSorter sorter =(DefaultRowSorter) table.getRowSorter();
		sorter.setRowFilter(RowFilter.regexFilter(find, index));
		sorter.setSortKeys(null);
	}
	
	protected void txtFilterKeyReleased(KeyEvent e) {
		do_txtFind(e, txtFilter.getText());
	}
	
	protected void txtFilterFocusGained(FocusEvent e) {
		if (txtFilter.getText().equals("Search")) {
			txtFilter.setText("");
			txtFilter.setForeground(Color.BLACK);
        }
	}
	
	protected void txtFilterFocusLost(FocusEvent e) {
		if (txtFilter.getText().equals("")) {
			txtFilter.setText("Search");
			txtFilter.setForeground(Color.GRAY);
        }
	}
	
	private void clearFind() {
    	txtFilter.setText("Search");
		txtFilter.setForeground(Color.GRAY);
    }

	protected void txtFilterKeyPressed(KeyEvent e) {
		do_txtFind(e, txtFilter.getText());
	}

}

package bao;

import java.util.ArrayList;
import java.util.List;

import dao.DaoGetComboBox;
import modal.ComboItem;

public class BaoGetComboBox {
	List<ComboItem> list = new ArrayList<ComboItem>();
	
	public List<ComboItem> getList(String exspres, String userLoginID){	
		return new DaoGetComboBox().getCB(false, exspres, userLoginID);
	}
	
	public List<ComboItem> getListAll(String exspres, String userLoginID){	
		return new DaoGetComboBox().getCB(true, exspres, userLoginID);
	}
}

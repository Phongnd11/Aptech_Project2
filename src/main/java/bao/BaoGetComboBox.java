package bao;

import java.util.ArrayList;
import java.util.List;

import dao.DaoGetComboBox;
import modal.ComboItem;

public class BaoGetComboBox {
	List<ComboItem> list = new ArrayList<ComboItem>();
	
	public List<ComboItem> getList(String exspres){	
		return new DaoGetComboBox().getCB(false, exspres);
	}
	
	public List<ComboItem> getListAll(String exspres){	
		return new DaoGetComboBox().getCB(true, exspres);
	}
}

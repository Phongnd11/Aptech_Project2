package modal;

import java.util.ArrayList;
import java.util.List;

public class ListGender {
	private List<Gender> list = new ArrayList<Gender>();

	public ListGender() {
		list.add(new Gender("0","Famale"));
		list.add(new Gender("1","Male"));
		list.add(new Gender("2","Order"));
	}
	public ListGender(List<Gender> list) {
		this.list = list;
	}
	public List<Gender> getList() {
		return list;
	}
	public void setList(List<Gender> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "ListGender [list=" + list + "]";
	}
	
}

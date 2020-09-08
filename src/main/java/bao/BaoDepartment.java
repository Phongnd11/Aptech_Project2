package bao;

import java.util.List;


import dao.DaoDepartment;

import entity.Department;
import modal.ResultsMessage;

public class BaoDepartment {
	ResultsMessage rsmess = new ResultsMessage();
	
	public Department getfromId(String id) {
		return new DaoDepartment().getfromId(id);
	}
	
	public List<Department> getall(boolean getall){
		return new DaoDepartment().getall(getall);
	}
	
	public ResultsMessage insert(Department obj) {
		return new DaoDepartment().insert(obj);
	}
	public ResultsMessage update(Department obj) {
		return new DaoDepartment().update(obj);
	}
	public ResultsMessage delete(String id) {
		return new DaoDepartment().delete(id);
	}
}

package bao;

import java.util.List;

import dao.DaoEmployee;
import entity.Employee;
import modal.EmployeeView;
import modal.ResultsMessage;

public class BaoEmployee {
	
	public List<EmployeeView> getAll(String userLoginId, boolean getall){
		return new DaoEmployee().getAll(userLoginId, getall);
	}
	
	public ResultsMessage insert(Employee obj) {
		return new DaoEmployee().insert(obj);
	}
	public ResultsMessage update(Employee obj) {
		return new DaoEmployee().update(obj);
	}
	public ResultsMessage delete(String id) {
		return new DaoEmployee().delete(id);
	}
}

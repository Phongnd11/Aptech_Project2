package bao;

import dao.DaoEmployee;
import entity.Employee;
import modal.ResultsMessage;

public class BaoEmployee {
	ResultsMessage rsmess = new ResultsMessage();
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

package bao;

import java.util.List;

import dao.DaoAssignment;
import entity.Assignment;
import entity.AssignmentUser;
import modal.ResultsMessage;

public class BaoAssignment {
	ResultsMessage rsmess = new ResultsMessage();
	
	public Assignment getfromId(String id) {
		return new DaoAssignment().getfromId(id);
	}
	
	public List<Assignment> getall(boolean getall){
		return new BaoAssignment().getall(getall);
	}
	
	public ResultsMessage insert(Assignment obj) {
		return new DaoAssignment().insert(obj);
	}
	public ResultsMessage update(Assignment obj) {
		return new DaoAssignment().update(obj);
	}
	public ResultsMessage delete(int id) {
		return new DaoAssignment().delete(id);
	}
	
	public List<AssignmentUser> getAssignmentUser(String id){
		return new DaoAssignment().getAssignmentUser(id);
	}
}

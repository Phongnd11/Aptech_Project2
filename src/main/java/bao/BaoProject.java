package bao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.DaoProject;
import entity.GetProject;
import entity.Project;
import modal.ResultsMessage;

public class BaoProject {
	ResultsMessage rsmess = new ResultsMessage();

	public List<GetProject> getAllProjectFirt(boolean getall){
		
		return new DaoProject().getAllProject(true, null, getall, null, null, null, null, null, null);
	
	}
	
	public List<GetProject> getAllProject(String id, boolean getall, String type_id, String department_id, String branch_id, String name, LocalDate date1, LocalDate date2){
		return new DaoProject().getAllProject(false , id, getall, type_id, department_id, branch_id, name, date1, date2);
	
	}
	
	public GetProject getGProjectFromID(String id, boolean getall) {
		return new DaoProject().getGetProject(id, getall);
	}
	
	public Project getFromID(String id) {
		return new DaoProject().getFromID(id);
	}
	public ResultsMessage insert(Project obj) {
		return new DaoProject().insert(obj);
	}
	public ResultsMessage update(Project obj) {
		return new DaoProject().update(obj);
	}
	public ResultsMessage delete(String id) {
		return new DaoProject().delete(id);
	}
}

package bao;

import java.util.ArrayList;
import java.util.List;

import dao.DaoProject;
import entity.GetProject;
import entity.Project;
import modal.ResultsMessage;

public class BaoProject {
	ResultsMessage rsmess = new ResultsMessage();
	
	public List<GetProject> getAllProject(boolean getall){
		return new DaoProject().getAllProject(null, getall);
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

package bao;

import java.util.List;


import dao.DaoTransfer;
import entity.Project;
import entity.Transfer;
import entity.TransferView;
import modal.ResultsMessage;

public class BaoTransfer {
	ResultsMessage rsmess = new ResultsMessage();
	
	public List<Transfer> getTranfer(String id){
		return new DaoTransfer().getTransfer(id);
	}
	
	public List<Transfer> getTranferAdmin(String branch,int status){
		return new DaoTransfer().getTransferAdmin(branch, status);
	};
	
	public List<TransferView> getTranferView(String employee_id, String department_id, boolean getAll, String userLoginId){
		return new DaoTransfer().getTranferView(employee_id,department_id,getAll,userLoginId);
	}
	
	public ResultsMessage insert(String username, String oldProject, String newProject, String reason) {
		return new DaoTransfer().insert(username, oldProject, newProject, reason);
	}
	
	public ResultsMessage delete(String id) {
		return new DaoTransfer().delete(id);
	}
	
	public ResultsMessage insertDepartmentT(String id, String oldv, String newv, String description) {
		return new DaoTransfer().insertDepartmentTransfer(id, oldv, newv, description);
	}
	
	public ResultsMessage dpTransferAccectp(String id, String userLoginId, boolean check) {
		return new DaoTransfer().dpTransferAccectp(id, userLoginId, check);
	}
	
}

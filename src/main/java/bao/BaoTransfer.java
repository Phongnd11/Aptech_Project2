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
	
	public List<TransferView> getTranferView(String userLoginId, boolean getAll){
		return new DaoTransfer().getTranferView(userLoginId, getAll);
	}
	
	public ResultsMessage insert(String username, String oldProject, String newProject, String reason) {
		return new DaoTransfer().insert(username, oldProject, newProject, reason);
	}
	
	public ResultsMessage delete(String id) {
		return new DaoTransfer().delete(id);
	}
	
	public ResultsMessage insertDepartment(TransferView obj) {
		return new DaoTransfer().insertDepartment(obj);
	}
	
}

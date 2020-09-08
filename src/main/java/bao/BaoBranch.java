package bao;

import java.util.List;

import dao.DaoBranch;
import entity.Branch;
import modal.ResultsMessage;

public class BaoBranch {
	ResultsMessage rsmess = new ResultsMessage();
	
	public Branch getfromId(String id) {
		return new DaoBranch().getfromId(id);
	}
	
	public List<Branch> getall(boolean getall){
		return new DaoBranch().getall(getall);
	}
	
	public ResultsMessage insert(Branch obj) {
		return new DaoBranch().insert(obj);
	}
	public ResultsMessage update(Branch obj) {
		return new DaoBranch().update(obj);
	}
	public ResultsMessage delete(String id) {
		return new DaoBranch().delete(id);
	}
}
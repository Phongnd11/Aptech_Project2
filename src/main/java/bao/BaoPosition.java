package bao;

import java.util.List;

import javax.swing.JOptionPane;

import dao.DaoPosition;
import entity.Position;
import modal.ResultsMessage;

public class BaoPosition {
	ResultsMessage rsmess = new ResultsMessage();
	
	public ResultsMessage insert(Position obj) {
		return new DaoPosition().insert(obj);
	}
	public ResultsMessage update(Position obj) {
		return new DaoPosition().update(obj);
	}
	public ResultsMessage delete(String id) {
		return new DaoPosition().delete(id);
	}
	
	public Position getFromId(String id) {
		return new DaoPosition().getfromId(id);
	}
	
	public List<Position> getAllPosition(boolean getall){
		return new DaoPosition().getall(true);
	}
}

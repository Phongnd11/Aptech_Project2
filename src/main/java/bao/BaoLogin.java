package bao;

import dao.DaoLogin;
import entity.CurrentUser;

public class BaoLogin {
	public CurrentUser getLogin(String username, String password) {
		return new DaoLogin().getLogin(username, password);
	}
}

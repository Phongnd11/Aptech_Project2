package bao;

import dao.DaoSystemInfo;
import entity.SystemInfo;

public class BaoSystemInfo {
	public static int get(String name) {
		return new DaoSystemInfo().get(name);
	}
}

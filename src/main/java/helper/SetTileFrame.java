package helper;

public class SetTileFrame {
	private static String title;
	public static String getTitle(int type, String name) {
		switch (type) {
			case 1: {
				title = "Add " + name; break;
			}
			case 2: {
				title = "Edit " + name; break;
			}
			default:
				title = "defatul"; break;
		}
		return title;
	}
}

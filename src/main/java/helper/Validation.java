package helper;

import java.util.regex.*;

public class Validation {
	public static boolean CheckRegex(String regex, String inputCheck) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputCheck);
		return matcher.matches();
	}
}

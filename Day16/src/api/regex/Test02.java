package api.regex;

import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[!@#$]).{8,20}$";
		String password = "1qwepoiertsd@";
		
		System.out.println(Pattern.matches(regex, password));
	}

}

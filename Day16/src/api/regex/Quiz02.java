package api.regex;

import java.util.regex.Pattern;

public class Quiz02 {

	public static void main(String[] args) {
		String regexBirth = "^[19]|[20][0-9]{2}[-/]?(0[1-9]|1[0-2])[-/]?(0[1-9]|1[0-9]|2[0-9]|3[0-1])$";
		
		String date = "2000/01/12";
		
		if(Pattern.matches(regexBirth, date))
			System.out.println("올바른 형식입니다.");
		else
			System.out.println("잘못된 형식입니다.");
	}

}

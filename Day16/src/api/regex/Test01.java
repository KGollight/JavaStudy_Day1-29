package api.regex;

import java.util.regex.Pattern;

public class Test01 {

	public static void main(String[] args) {
		
		String phone = "010-1212-3434";
//		String regex = "01[016789]-"
//				+ "[0123456789][0123456789][0123456789][0123456789]-"
//				+ "[0123456789][0123456789][0123456789][0123456789]";
//		String regex = "^01[016-9]-[0-9]{4}-[0-9]{4}$";
		String regex = "^01[016-9](-?[0-9]{4}){2}$";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		
		System.out.println(Pattern.matches(regex, phone));
	}

}

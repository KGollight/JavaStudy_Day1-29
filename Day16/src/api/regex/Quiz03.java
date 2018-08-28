package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz03 {

	public static void main(String[] args) {
//		String regex = "^[a-z0-9-_]{6,25}[@][a-z][a-z0-9]{7,19}[.]((net)|(co)[.](kr)|(com)|(go)[.](kr)|(ac)[.](kr))$";
		String regex = "^[a-z0-9-_]{6,25}[@][a-z][a-z0-9]{7,19}(\\.net|\\.co\\.kr|\\.com|\\.go\\.kr|\\.ac\\.kr)$";
		
//		String mail = "welfsdklfj@naverelel.com";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("***이메일을 입력하세요***");
		String mail = s.next();
		
		s.close();
		
		if(Pattern.matches(regex, mail))
			System.out.println("올바른 메일 형식입니다.");
		else

			System.out.println("잘못된 메일 형식입니다.");
	}

}

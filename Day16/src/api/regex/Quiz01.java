package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String idCheck = "^[a-zA-Z1-9]{8,20}$";
		String pwCheck = "^[a-zA-Z1-9!@#$]{8,20}$";
		String nameCheck = "^[°¡-ÆR]{2,7}$";
		
		String id, pw, name;
		
		while(true) {
			System.out.print("¾ÆÀÌµğ ÀÔ·Â : ");
			id = s.next();
			if(Pattern.matches(idCheck, id)) {
				System.out.println("¿Ã¹Ù¸¥ ¾ÆÀÌµğÀÔ´Ï´Ù.");
				break;
			}
			else
				System.out.println("Àß¸øµÇ ¾ÆÀÌµğ Çü½ÄÀÔ´Ï´Ù.");
		}
		
		while(true) {
			System.out.print("\nºñ¹Ğ¹øÈ£ ÀÔ·Â : ");
			pw = s.next();
			
			if(Pattern.matches(pwCheck, pw)) {
				System.out.println("¿Ã¹Ù¸¥ ºñ¹Ğ¹øÈ£ÀÔ´Ï´Ù.");
				break;
			}
			else
				System.out.println("Àß¸øµÇ ºñ¹Ğ¹øÈ£ Çü½ÄÀÔ´Ï´Ù.");
		}
		
		while(true) {
			System.out.print("\nÀÌ¸§ ÀÔ·Â : ");
			name = s.next();
			
			if(Pattern.matches(nameCheck, name)) {
				System.out.println("¿Ã¹Ù¸¥ ÀÌ¸§ÀÔ´Ï´Ù.");
				break;
			}
			else
				System.out.println("Àß¸øµÇ ÀÌ¸§ Çü½ÄÀÔ´Ï´Ù.");
		}
		
		s.close();
	}

}

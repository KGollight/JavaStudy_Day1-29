package api.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try{
				System.out.println("***´Ð³×ÀÓÀ» ÀÔ·ÂÇÏ¼¼¿ä***");
				String nickname = s.next();

				String regex = "^[°¡-ÆR]{2,6}$";
				if(!Pattern.matches(regex, nickname))
					throw new Exception("ÇÑ±Û 2~6ÀÚ·Î ´Ð³×ÀÓÀ» ¼³Á¤ÇÏ¼¼¿ä...");
				
				if(nickname.contains("¿î¿µÀÚ"))
					throw new Exception("¿î¿µÀÚ´Â Æ÷ÇÔÇÒ ¼ö ¾ø´Â ´Ü¾îÀÔ´Ï´Ù...");
				
				break;
			}
			catch(Exception e){
				System.out.println("[¿À·ù] : "+e.getMessage());
			}
		}
		
		s.close();
	}

}

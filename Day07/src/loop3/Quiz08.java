package loop3;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/* StringÀÌ¶ó´Â ÀÚ·áÇüÀº ÂüÁ¶Çü ÀÚ·áÇüÀ¸·Î¼­ ´ÙÀ½°ú °°Àº ¸í·É 2°¡Áö°¡ ³»ÀåµÇ¾î ÀÖ½À´Ï´Ù.
		 * .length()	¹®ÀÚ °³¼ö¸¦ ¹İÈ¯
		 * .charAt(i)	i¹øÂ° ±ÛÀÚ¸¦ char·Î ¹İÈ¯
		 * »ç¿ëÀÚ¿¡°Ô ¹®ÀÚ¿­À» ÇÑ °³ ÀÔ·Â¹Ş¾Æ ÇÑ±Û·Î¸¸ ÀÌ·ç¾îÁ® ÀÖ´ÂÁö¸¦ ÆÇÁ¤ÇÏ¿© Ãâ·ÂÇÏ¼¼¿ä
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("¹®ÀÚ¿­À» ÀÔ·ÂÇÏ¼¼¿ä...");
		String text = s.next();
		int ea = text.length();
		System.out.println("±ÛÀÚ ¼ö : "+ea);
		
		s.close();
		
		char han;
		int count=0;
		
		for(int i=0; i<ea; i++) {
			han = text.charAt(i);
			if(han>='°¡' && han<='ÆR') {
				count++;
			}
		}
		if(ea==count)
			System.out.println("ÇÑ±Û·Î¸¸ ÀÌ·ç¾îÁ®ÀÖ½À´Ï´Ù.");
		else
			System.out.println("°¡¿±°í µüÇÑÀÚ·Î´Ù...");
	}
}

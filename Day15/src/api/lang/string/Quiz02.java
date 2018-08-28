package api.lang.string;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = "";
		int count=0;
		
		while(true) {
			System.out.print("¾ÆÀÌµğ ÀÔ·Â : ");
			id=s.next();
			
			for(int i=0; i<id.length(); i++) {
				if(id.charAt(i)>='°¡' && id.charAt(i)<='ÆR') {
					System.out.println("Àß¸øµÈ ¾ÆÀÌµğÀÔ´Ï´Ù.");
					count++;
				}
			}
			
			boolean korean = count == id.length();
			boolean idLength = id.length()<2 && id.length()>6;
			boolean admin = id.contains("¿î¿µÀÚ");
			
			if(!idLength)
				System.out.println("¾ÆÀÌµğÀÇ ±æÀÌ°¡ ¸ÂÁö ¾Ê½À´Ï´Ù.");
			else if(!korean)
				System.out.println("¾ÆÀÌµğ°¡ ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.");
			else if(!admin)
				System.out.println("¾ÆÀÌµğ¿¡ ¿î¿µÀÚ°¡ Æ÷ÇÔµÇ¾îÀÖ½À´Ï´Ù.");
			else
				break;
		}
		
		s.close();
		
		System.out.println(id.length());
		System.out.println("ÀÔ·Â¹ŞÀº ¾ÆÀÌµğ : "+id);
	}

}

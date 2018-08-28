package api.lang.string;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String start = "¹Ù³ª³ª";
		
		while(true) {

			System.out.println(start+"! ÄôÄôµû!");
			String word = s.next();
			
			int count=0;
			for(int i=0; i<word.length(); i++) {
				if(word.charAt(i)>='°¡' && word.charAt(i)<='ÆR')
					count++;
			}
			boolean korean = count==word.length();
			boolean length = word.length()==3;
			boolean correct = start.charAt(start.length()-1)==word.charAt(0);
			
			if(!korean || !length || !correct) {
				System.out.println("°ÔÀÓ ¿À¹ö...");
				break;
			}
			
			String tmp = word;
			start = tmp;
		}
		s.close();
	}

}

package api.lang.string;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		String[] slang = {"신발끈", "수박씨", "시베리아", "조카", "샹들리에", 
				"식빵", "쌍쌍바", "젓가락", "족구", "십장생", "후레지아", "된장"};
		
		//System.out.println(slang.length);
		Scanner s = new Scanner(System.in);
		
		System.out.print("문장 입력 : ");
		String word = s.nextLine();

		s.close();
		
		int start=0, end=0;
		for(int i=0; i<slang.length; i++) {
//			if(word.contains(slang[i])) {
//				start = word.indexOf(slang[i]);
//				end = start+slang[i].length()-1;
//			}
			word = word.replace(slang[i], "***");
		}

		System.out.println(word);
	}

}

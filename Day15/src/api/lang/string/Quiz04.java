package api.lang.string;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		String[] slang = {"�Ź߲�", "���ھ�", "�ú�����", "��ī", "���鸮��", 
				"�Ļ�", "�ֹֽ�", "������", "����", "�����", "�ķ�����", "����"};
		
		//System.out.println(slang.length);
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
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

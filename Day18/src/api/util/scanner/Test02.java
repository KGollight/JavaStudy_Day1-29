package api.util.scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		Scanner ���� - ������
		
//		String color = "����/��Ȳ/���/�ʷ�/�Ķ�/����/����";
		String color = "����/��Ȳ-���+�ʷ�=�Ķ�?����~����";
		
		Scanner s = new Scanner(color);
//		������(delimiter) ����
//		s.useDelimiter("/");
		s.useDelimiter("[/+=?~-]");
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
	}

}

package api.lang.string;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = "";
		int count=0;
		
		while(true) {
			System.out.print("���̵� �Է� : ");
			id=s.next();
			
			for(int i=0; i<id.length(); i++) {
				if(id.charAt(i)>='��' && id.charAt(i)<='�R') {
					System.out.println("�߸��� ���̵��Դϴ�.");
					count++;
				}
			}
			
			boolean korean = count == id.length();
			boolean idLength = id.length()<2 && id.length()>6;
			boolean admin = id.contains("���");
			
			if(!idLength)
				System.out.println("���̵��� ���̰� ���� �ʽ��ϴ�.");
			else if(!korean)
				System.out.println("���̵� �ѱ��� �ƴմϴ�.");
			else if(!admin)
				System.out.println("���̵� ��ڰ� ���ԵǾ��ֽ��ϴ�.");
			else
				break;
		}
		
		s.close();
		
		System.out.println(id.length());
		System.out.println("�Է¹��� ���̵� : "+id);
	}

}

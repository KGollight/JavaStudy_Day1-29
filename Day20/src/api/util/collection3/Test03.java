package api.util.collection3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("<�� ��ȣ�� �Է��ϼ���> ���� Ű : 0");
			int num = s.nextInt();
			
			if(num==0)
				break;
			
//			if(set.contains(num))
//				System.out.println(num+"���� �̹� ���� ���̾ ��ȸ���� �������� �ʽ��ϴ�.");
//			
//			else {
//				System.out.println(num+"�� ���� ��ȸ���� 1 �����մϴ�.");
//				set.add(num);
//			}
			
//			���� : set�� add ��ü�� ���͸��� �ǹǷ� ����� ������ �ļ�ó���� ����
			if(set.add(num))
				System.out.println(num+"�� ���� ��ȸ���� 1 �����մϴ�.");
			
			else 
				System.out.println(num+"���� �̹� ���� ���̾ ��ȸ���� �������� �ʽ��ϴ�.");
		}
		
		s.close();
		
		System.out.println("���α׷��� �����մϴ�.");
	}

}

package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("### ���� �̸��� �Է��ϼ��� ###");
			String nation = s.next();
			
			if(list.contains(nation)) {
				System.out.println("*** ���� ����!!! ***");
				break;
			}
			else
				list.add(nation);
		}
		
		s.close();
		
		System.out.println("\n���� ���� : "+list.size());
		System.out.println("��� : "+list);
	}

}

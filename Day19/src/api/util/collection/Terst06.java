package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Terst06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ũ�� �Է�(2 �̻�!)");
		int size = s.nextInt();
		s.nextLine();//���� ó���� �ڵ�
		
//		List<String> nameList = new ArrayList<>();
		List<String> nameList = new ArrayList<>(size);
		List<String> rewardList = new ArrayList<>(size);
		
		for(int i=1; i<=size; i++) {
			System.out.println("<�̸��� �Է��ϼ���>");
			String name = s.next();
			
			nameList.add(name);
		}
		System.out.println();
		
		for(int i=1; i<=size; i++) {
			System.out.println("<������ �Է��ϼ���>");
//			String reward = s.nextLine();
			String reward = s.next();
			
			rewardList.add(reward);
		}
		
		s.close();
		System.out.println();
		
		Collections.shuffle(rewardList);
		
		for(int i=0; i<size; i++) {
			System.out.println(nameList.get(i)+"���� ���� : "+rewardList.get(i));
		}
	}

}

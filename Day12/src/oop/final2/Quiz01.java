package oop.final2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String id = s.next();
		String password = s.next();
		String name = s.next();
		s.close();
		
		Join a = new Join(id, password, name);
		
		//a.id = "change";
		a.password = "other";
		a.print();
	}

}

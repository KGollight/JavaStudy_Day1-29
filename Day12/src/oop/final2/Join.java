package oop.final2;

public class Join {
	final String id;
	final String name;
	String password;
	
	Join(String id, String password, String name){
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	void print() {
		System.out.println("*** ȸ�� ���� ***");
		System.out.println("ID : "+this.id);
		System.out.println("�г��� : "+this.name);
	}
}

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
		System.out.println("*** 회원 정보 ***");
		System.out.println("ID : "+this.id);
		System.out.println("닉네임 : "+this.name);
	}
}

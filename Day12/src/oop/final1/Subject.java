package oop.final1;

public class Subject {
	// final�� ���̸� ������ �߻��ϴ� ����
	//  - �ʱ�ȭ�� �̷������ �ʾƼ�...
	//  - ���� �ʱ�ȭ�� �ϰų�, Ȥ�� "������"�� �̿�
	// final String name = "�ڹ� SW ������ �缺;
	final String name;
	int people;
	
	Subject(){
		this.name = "test";
	}
	
	Subject(String name){
		this.name = name;
	}
	
	Subject(String name, int people){
		this.name = name;
		this.people = people;
	}
}

package oop.test2;

public class WorldCup {
	// ����
	int grade;
	String nation;
	String region;
	String name;
	
	// �޼ҵ�
	// void �̸�(�Ű�����) { �ڵ� }
	void print() {
		// this : �ڽ��� ���̶�� �ǹ̸� ������ �ָ�~~~~~~~~~�� �ܾ�
		System.out.println(this.grade+"\t"+this.nation+"\t"+this.region+"\t"+this.name);
	}
	
	void insert(int a, String b, String c, String d) {
		this.grade = a;
		this.nation = b;
		this.region = c;
		this.name = d;
	}
}

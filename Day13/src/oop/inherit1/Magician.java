package oop.inherit1;

// ������
public class Magician {
	private String id;
	private int attack;
	private int hp;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void magic() {
		System.out.println("������ ���� �߻�!");
	}

	public void print() {
		System.out.println("## ĳ���� ���� ##");
		System.out.println("���̵� : "+id);
		System.out.println("���ݷ� : "+attack);
		System.out.println("ü �� : "+hp);
	}
}

package oop.inherit1;

// 전사
public class Worrior {
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
	
	public void bash() {
		System.out.println("밀어내기!");
	}
	
	public void print() {
		System.out.println("## 캐릭터 정보 ##");
		System.out.println("아이디 : "+id);
		System.out.println("공격력 : "+attack);
		System.out.println("체 력 : "+hp);
	}
}

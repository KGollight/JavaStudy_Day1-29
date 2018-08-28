package oop.modifier6;

public class Player {
	private String id;
    private int damage;
    private int hp;
    private Player target;
    
    private boolean live;
    
    // getter & setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if(damage<1)
			return;
		else
			this.damage = damage;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if(hp<=0)
            return;
        else
            this.hp = hp;
	}
	public Player getTarget() {
		return target;
	}
	public void setTarget(Player target) {
		this.target = target;
	}
    
    public Player(String id, int damage, int hp) {
    	this.setId(id);
    	this.setDamage(damage);
    	this.setHp(hp);
    }
    
    void print() {
    	System.out.println("<ĳ���� ����>");
        System.out.println("ID : "+this.getId());
        System.out.println("���ݷ� : "+this.getDamage());
        System.out.println("ü�� : "+this.getHp());
    }
    
    // Ÿ�� ���
    public void attack() {
    	if(live) {
    		if(target!=null)
        		System.out.println(this.id+"��(��)"+target.id+"���� "+this.damage+"���ظ� �ݴϴ�.");
        	else
        		System.out.println("����� ��� ������ �� �����ϴ�.");
    	}
    	else
    		System.out.println("����� ����� �����Դϴ�.");
    }
    
    // �ǰ� ��� - �´� ����� �𸣹Ƿ� ����
    public void defence(Player attacker) {
    	System.out.println(target.id+"��(��)"+this.id+"���� "+this.damage+"���ظ� �޽��ϴ�.");
    	this.hp-=attacker.damage;
    	if(this.hp<=0) {
    		this.hp=0;
    		this.live=false;
    	}
    }
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
}

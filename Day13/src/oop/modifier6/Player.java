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
    	System.out.println("<캐릭터 정보>");
        System.out.println("ID : "+this.getId());
        System.out.println("공격력 : "+this.getDamage());
        System.out.println("체력 : "+this.getHp());
    }
    
    // 타격 기능
    public void attack() {
    	if(live) {
    		if(target!=null)
        		System.out.println(this.id+"이(가)"+target.id+"에게 "+this.damage+"피해를 줍니다.");
        	else
        		System.out.println("대상이 없어서 공격할 수 없습니다.");
    	}
    	else
    		System.out.println("당신은 사망한 상태입니다.");
    }
    
    // 피격 기능 - 맞는 대상을 모르므로 정보
    public void defence(Player attacker) {
    	System.out.println(target.id+"이(가)"+this.id+"에게 "+this.damage+"피해를 받습니다.");
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

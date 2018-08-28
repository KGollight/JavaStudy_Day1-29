package api.util.collection2;

public class Talent {

	private String name;
	private int vote;
	private static int total;
	
	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Talent.total = total;
	}
	
	public void vote() {
		vote++;
		total++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVote() {
		return vote;
	}
	public void setVote(int vote) {
		this.vote = vote;
	}
	
	public Talent() {
		super();
	}
	
	public Talent(String name) {
		super();
		this.name = name;
	}
	
	public void print() {
		System.out.println("["+name+"] 투표 완료(현재 "+vote+"표)");
	}
}

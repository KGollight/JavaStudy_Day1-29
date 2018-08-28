package api.io.object;

import java.io.Serializable;

//객체 입출력을 하려면 자격을 획득(마킹) - java.io.Serializable을 상속
public class Student implements Serializable{
	
	private static final long serialVersionUID = 2L;
	private String name;
	private int score;
	
//	transient : 입출력 제외 키워드
	private transient String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, int score, String gender) {
		super();
		this.name = name;
		this.score = score;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", gender=" + gender + "]";
	}
	
}

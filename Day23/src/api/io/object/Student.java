package api.io.object;

import java.io.Serializable;

//��ü ������� �Ϸ��� �ڰ��� ȹ��(��ŷ) - java.io.Serializable�� ���
public class Student implements Serializable{
	
	private static final long serialVersionUID = 2L;
	private String name;
	private int score;
	
//	transient : ����� ���� Ű����
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

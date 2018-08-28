package times17.homework.explain;

import java.io.Serializable;

public class Member implements Serializable{
	private String name;
	private String id;
	private String password;
	public Member() {
		super();
	}
	public Member(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

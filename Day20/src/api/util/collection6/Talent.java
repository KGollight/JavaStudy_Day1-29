package api.util.collection6;

public class Talent {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Talent(String name) {
		this.setName(name);
	}
	
//	단순 출력용 toString 재정의
	@Override
	public String toString() {
		return "Talent [name=" + name + "]";
	}

//	이름 외의 다른 정보 추가 가능
//	이름만으로 비교 가능하도록 클래스 수정(hashCode와 equals 메소드 재정의)
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Talent other = (Talent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

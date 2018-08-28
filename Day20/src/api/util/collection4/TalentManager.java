package api.util.collection4;

public class TalentManager {
	private String company;		//소속사 이름
	private String name;		//연예인 이름
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void menu() {
		System.out.println("--[ 연예인 매니지먼트 프로그램 ]--");
		System.out.println("1. 소속사 등록");
		System.out.println("2. 소속사 삭제");
		System.out.println("3. 연예인 등록");
		System.out.println("4. 연예인 삭제");
		System.out.println("5. 전체 연예인 목록 출력");
		System.out.println("6. 소속사별 연예인 목록 출력");
		System.out.println("0. 종료");
	}
}

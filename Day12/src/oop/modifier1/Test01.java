package oop.modifier1;

public class Test01 {

	public static void main(String[] args) {
		// Student의 인스턴스를 생성하여 정보 설정
		
		// 생성
		Student std = new Student();
		
		// 초기화
		// std.name = "홍길동";
		std.setName("홍길동");
		std.setScore(-50);
		
		// 출력
		System.out.println(std.getName());
		System.out.println(std.getScore());
	}

}

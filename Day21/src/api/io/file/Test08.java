package api.io.file;

public class Test08 {

	public static void main(String[] args) {
//		Hanoi클래스를 이용하여 하노이 타워 처리 과정 만들기
		Hanoi hanoi = new Hanoi();
		hanoi.move("A", "B", "C", 5);
	}

}

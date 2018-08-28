package api.io.file;

public class Hanoi {
	
//	이동 메소드
//	출발지점(start), 경유지점(between), 도착지점(finish), 이동할 개수(size)
	public void move(String start, String between, String finish, int size) {
		if(size==1) {
			System.out.println(start+"->"+finish+" : 1개 블럭 이동");
		}
		else {
//			System.out.println(start+"->"+between+" : 1개 블럭 이동");
			this.move(start, finish, between, size-1);
//			System.out.println(start+"->"+finish+" : 1개 블럭 이동");
			this.move(start, between, finish, 1);
//			System.out.println(between+"->"+finish+" : 1개 블럭 이동");
			this.move(between, start, finish, size-1);
		}
//		else if(size==3) {
//			this.move(start, finish, between, 2);
//			this.move(start, between, finish, 1);
//			this.move(between, start, finish, 2);
//		}
//		else if(size==4) {
//			this.move(start, finish, between, 3);
//			this.move(start, between, finish, 1);
//			this.move(between, start, finish, 3);
//		}
	}
}

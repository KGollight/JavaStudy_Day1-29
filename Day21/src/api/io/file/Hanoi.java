package api.io.file;

public class Hanoi {
	
//	�̵� �޼ҵ�
//	�������(start), ��������(between), ��������(finish), �̵��� ����(size)
	public void move(String start, String between, String finish, int size) {
		if(size==1) {
			System.out.println(start+"->"+finish+" : 1�� �� �̵�");
		}
		else {
//			System.out.println(start+"->"+between+" : 1�� �� �̵�");
			this.move(start, finish, between, size-1);
//			System.out.println(start+"->"+finish+" : 1�� �� �̵�");
			this.move(start, between, finish, 1);
//			System.out.println(between+"->"+finish+" : 1�� �� �̵�");
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

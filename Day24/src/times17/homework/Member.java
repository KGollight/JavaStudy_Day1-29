package times17.homework;

import java.io.File;

/**
 * ȸ�� ���� Ŭ����
 *  - �̸�, ���̵�, ��й�ȣ
 * @author Administrator
 *
 */
public class Member {

	private String name;
	private String id;
	private String pw;
	
	/**
	 * �ν��Ͻ� ���� �� ���� ����
	 */
	public Member() {
		File file = new File("files", "member.db");
	}
	
	
}

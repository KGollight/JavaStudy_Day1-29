package times17.homework;

import java.io.File;

/**
 * 회원 정보 클래스
 *  - 이름, 아이디, 비밀번호
 * @author Administrator
 *
 */
public class Member {

	private String name;
	private String id;
	private String pw;
	
	/**
	 * 인스턴스 생성 시 파일 생성
	 */
	public Member() {
		File file = new File("files", "member.db");
	}
	
	
}

package api.awp;

import java.awt.Frame;

public class Test01 {

	public static void main(String[] args) {
		Frame a = new Frame();	//창 생성
		
		//표시 전에 창과 관련된 다양한 처리를 먼저 수행
		a.setTitle("GUI 테스트");		//창 제목
		a.setLocation(650, 350);	//x축 : 650, y축 : 350 (왼쪽 위 모서리 기준)
		a.setSize(300, 200);		//폭 : 300, 높이 : 200
		a.setResizable(false);		//창 크기 변경 여부
		
		a.setVisible(true);		//화면 표시
	}

}

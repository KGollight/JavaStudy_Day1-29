package api.thread;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
		
//		멀티스레드가 필요한 이유 (= 싱글 스레드가 불편한 이유)
//		[코드1] 사용자에게 알림창을 띄우는 코드
//		[코드2] 1부터 100까지 1초간격으로 출력하는 코드
		
//		싱글스레드이므로 순차적으로 실행
		JOptionPane.showMessageDialog(null, "안녕하세요");
		
		for(int i=1; i<=100; i++) {
			System.out.println("i = "+i);
			
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

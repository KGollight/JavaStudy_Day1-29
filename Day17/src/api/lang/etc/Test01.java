package api.lang.etc;

import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		//RuntimeŬ����	�̱������� Ŭ����
		//				�ü���� ���� ���ø� ���� �� �ִ�.
		
//		Runtime r = new Runtime();	-> ����
		Runtime r = Runtime.getRuntime();
		
		try {
			r.exec("notepad");//�޸���
			r.exec("cmd /c start http://www.google.com");
		} catch (Exception e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
	}

}

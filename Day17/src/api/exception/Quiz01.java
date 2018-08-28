package api.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			try{
				System.out.println("***�г����� �Է��ϼ���***");
				String nickname = s.next();

				String regex = "^[��-�R]{2,6}$";
				if(!Pattern.matches(regex, nickname))
					throw new Exception("�ѱ� 2~6�ڷ� �г����� �����ϼ���...");
				
				if(nickname.contains("���"))
					throw new Exception("��ڴ� ������ �� ���� �ܾ��Դϴ�...");
				
				break;
			}
			catch(Exception e){
				System.out.println("[����] : "+e.getMessage());
			}
		}
		
		s.close();
	}

}

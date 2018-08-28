package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {

	public static void main(String[] args) {
		//����ǥ������ �̿��� Ž��
		String text = "Windows7,Windows8,Windows10,MacOSX,CentOS";
		
		String regex = "Windows\\d+";
		
		//Ž�� ��ü�� ����
		Matcher m = Pattern.compile(regex).matcher(text);
		
		//m.find()	�˻� ����� �����ϴ°�
		//m.group()	�˻� ����� ��ȯ
		//m.start()	������ ��ġ
		//m.end()	������ ��ġ
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
		}
	}

}

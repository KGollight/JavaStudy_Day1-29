package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		// �󼼰˻�
		String text = "Windows7,Windows8,Windows10,MacOSX,CentOS";

//		String regex = "Windows\\d+";
		String regex = "Windows(\\d+)";

		// Ž�� ��ü�� ����
		Matcher m = Pattern.compile(regex).matcher(text);

		// m.find() �˻� ����� �����ϴ°�
		// m.group() �˻� ����� ��ȯ
		// m.start() ������ ��ġ
		// m.end() ������ ��ġ
		while (m.find()) {
			System.out.println("number = " + m.group(1));
			System.out.println(m.start(1));
			System.out.println(m.end(1));
		}
	}

}

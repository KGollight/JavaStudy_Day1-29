package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		String regex = "��ġ[��-�R]*|[��-�R]*�����|����[��-�R]*";
		
		String text = "��ġ�е� ����ɰ� ���ѻ��� ������ϱ�?";
		
		Matcher m = Pattern.compile(regex).matcher(text);
		
		while(m.find()) {
			String word = m.group();
			int start = m.start();
			int end = m.end();
			System.out.println("���� �ܾ� : "+word+", ("+start+", "+end+")");
			
			text = text.replace(word, "["+word+"]");
		}
		
		System.out.println(text);
	}

}

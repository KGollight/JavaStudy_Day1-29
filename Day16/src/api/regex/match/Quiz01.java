package api.regex.match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quiz01 {

	public static void main(String[] args) {
		String regex = "Á¤Ä¡[°¡-ÆR]*|[°¡-ÆR]*´ëÅë·É|ºÏÇÑ[°¡-ÆR]*";
		
		String text = "Á¤Ä¡ÇÐµµ ´ëÅë·É°ú ºÏÇÑ»êÀº ¾îµø½À´Ï±î?";
		
		Matcher m = Pattern.compile(regex).matcher(text);
		
		while(m.find()) {
			String word = m.group();
			int start = m.start();
			int end = m.end();
			System.out.println("À§Çè ´Ü¾î : "+word+", ("+start+", "+end+")");
			
			text = text.replace(word, "["+word+"]");
		}
		
		System.out.println(text);
	}

}

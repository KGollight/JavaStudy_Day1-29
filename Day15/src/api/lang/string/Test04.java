package api.lang.string;

public class Test04 {

	public static void main(String[] args) {
		//문자열 분리
		String word = "빨강/주황/노랑/초록/파랑/남색/보라";	//이 경우 '/'를 구분자라고 한다.
		
		String[] color = word.split("/");
		
		System.out.println(color.length);
		for(int i=0; i<color.length; i++) {
			System.out.print(color[i]+"\t");
		}
	}

}

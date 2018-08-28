package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		//문자열 편집
		String word = "자바 Programming";
		
		//대소문자 변환
		System.out.println(word.toLowerCase()); //소문자
		System.out.println(word.toUpperCase()); //대문자
		
		//자르기
		System.out.println(word.substring(3, 10));	//Program
		System.out.println(word.substring(3));		//Programming
		
		String time = "2018-07-31 13:14:30";
		
		//날짜만 출력(07-31)
		System.out.println(time.substring(5, 10));
		
		//시간만 출력(13:14)
		System.out.println(time.substring(11, 16));
		
		//체이닝 호출
		System.out.println(word.substring(3, 10).toLowerCase());
		
		//공백제거
		String a = "     hello java       ";
		System.out.println(a.trim());
		System.out.println(a.trim().length());
		
		//치환
		String b = "나는 피자가 좋아요";
		System.out.println(b);
		System.out.println(b.replace("피자", "떡볶이"));
		System.out.println(b.replace("피자", "떡볶이").replace("좋아", "싫어"));
	}

}

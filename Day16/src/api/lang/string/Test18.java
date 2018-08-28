package api.lang.string;

public class Test18 {

	public static void main(String[] args) {
		//출현 빈도순으로 정렬
		
		String word = "치키치키차카차카초코초코초";
		String search = "초코";
		
//		System.out.println(word.indexOf(search));
//		System.out.println(word.indexOf(search, 9));
//		System.out.println(word.indexOf(search, 11));
		
		SearchUtil util = new SearchUtil();
		int count = util.appear(word, search);
		
		System.out.println("count = "+count);
	}

}

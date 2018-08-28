package api.lang.string;

public class Test21 {
	public static void main(String[] args) {
		String[] data = new String[] {
			"피카츄", "라이츄", "꼬부기", "어니부기", "파이리", "리자몽"
		};
		String search = "츄";
		
		//배열을 새로 만들어서 검색어가 포함된 것들만 추가
		//[1] 신규 배열의 크기 = 검색어를 포함하는 단어 개수
		
		SearchUtil util = new SearchUtil();
		String[] result = util.search(data, search);
		util.print(data);
		util.print(result);
		
		
	}
}







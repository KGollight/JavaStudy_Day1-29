package api.lang.string;

public class Test19 {

	public static void main(String[] args) {
		//Test18의 기능을 확장하여 배열을 검색 빈도순으로 정렬
		
		String[] data = new String[] {
			"파이리", "꼬부기", "피카츄", "라이츄", "이브이"	
		};
		String search = "이";	//검색어
		
		SearchUtil util = new SearchUtil();
		
		util.sort(data);
		util.sortByApper(data, search);
		
		util.print(data);
	}

}

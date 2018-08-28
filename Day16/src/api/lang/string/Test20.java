package api.lang.string;

public class Test20 {
	public static void main(String[] args) {
		//출현 위치순으로 정렬
		String[] data = new String[] {
			"아가아아아아아", "아아아가아아아", "아아아아아아가", "가아아아아아아", 
			"아아가아아아아", "아아아아가아아", "아아아아아가아"
		};
		String search = "가";
		
		SearchUtil util = new SearchUtil();
		util.sortByIndex(data, search);
		util.print(data);
		
	}
}

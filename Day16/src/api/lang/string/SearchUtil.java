package api.lang.string;

public class SearchUtil {
	
	public void sort(String[] data) {
		for(int i=0; i < data.length-1; i++) {
			//최소값 찾고
			int min = i;
			for(int j=i+1; j < data.length; j++) {
//				if(data[min] > data[j]) {
				if(data[min].compareTo(data[j]) > 0) {
					min = j;
				}
			}
			//교체
			String tmp = data[min];
			data[min] = data[i];
			data[i] = tmp;
		}
	}
	
	public void sortByApper(String[] data, String search) {
		for(int i=0; i < data.length-1; i++) {
			//최소값 찾고
			int min = i;
			for(int j=i+1; j < data.length; j++) {
				if(this.appear(data[min], search) < this.appear(data[j], search)) {
					min = j;
				}
			}
			//교체
			String tmp = data[min];
			data[min] = data[i];
			data[i] = tmp;
		}
	}
	
	public void sortByIndex(String[] data, String search) {
		for(int i=0; i < data.length-1; i++) {
			//최소값 찾고
			int min = i;
			for(int j=i+1; j < data.length; j++) {
				if(data[min].indexOf(search) > data[j].indexOf(search)) {
					min = j;
				}
			}
			//교체
			String tmp = data[min];
			data[min] = data[i];
			data[i] = tmp;
		}
	}
	
	public void print(String[] data) {
//		System.out.print("[");
//		for(int i=0; i < data.length-1; i++) {
//			System.out.print(data[i]+", ");
//		}
//		System.out.println(data[data.length-1]+"]");
		System.out.println("## 검색 결과 ##");
		for(int i=0; i < data.length; i++) {
			System.out.println("→ "+data[i]+" [상세정보]");
		}
	}
	
	//word에 search가 몇 번 포함되어있는지 알려주는 메소드
	public int appear(String word, String search) {
		int index = -1;
		int count = 0;
		
		while(true) {
			index = word.indexOf(search, index + 1);
			if(index == -1) break;
			count++;
		}
		
		return count;
	}
	
	public String[] search(String[] data, String search) {
		int count = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i].contains(search)) {
				count++;
			}
		}
		String[] result = new String[count];
//		System.out.println(result.length);
		
//		데이터 옮기기
		int idx = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i].contains(search)) {
				result[idx++] = data[i];
			}
		}
		
		return result;
	}
	
	//원터치 메소드
	public String[] work(String[] data, String search) {
		String[] result = this.search(data, search);
		
		this.sort(result);
		
		this.sortByIndex(result, search);
		
		this.sortByApper(result, search);
		
		return result;
	}
	
}
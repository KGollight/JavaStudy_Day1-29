package array;

public class Quiz09 {

	public static void main(String[] args) {
		// 삽입 정렬
		
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		for(int i=0; i<data.length; i++) {
			System.out.println(i+"위치값을 backup!");
			
			int backup=data[i];	// 현재 위치의 데이터
			int target=i;	// 목적지의 위치
			
			// 앞의 값들과 backup을 비교하여 들어갈 위치(target)을 설정
			for(int j=i-1; j>=0; j--) {
				System.out.println(i+"와 "+j+"위치를 비교!");
				
				if(backup<data[j]) {
					data[j+1]=data[j];	// 뒤로 데이터를 1칸 말어버리고
					target=j;	// 목적지 수정
				}
				else {
					break;
				}
			}
			System.out.println("목적지(target) = "+target);
			data[target] = backup;	// 백업데이터를 목적지에서 설정
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

package oop.method5;

public class Utility {
	// [1] 배열을 화면에 출력
	void print(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
	
	// [2] 배열을 뒤집는 기능
	void reverse(int[] rev) {
		for(int i=0; i<rev.length/2; i++) {
			int tmp=rev[i];
			rev[i] = rev[rev.length-i-1];
			rev[rev.length-i-1]=tmp;
		}
		this.print(rev);
	}
	
	// [3] 배열을 랜덤으로 섞는 기능
	void random(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			// 대상 위치 설정
			int target=(int)(Math.random()*arr.length);
			if(i==target) {
				i--;
				continue; // 반복문의 처음으로 올라가라
			}
			// i와 target의 위치를 변경
			int tmp = arr[i];
			arr[i] = arr[target];
			arr[target] = tmp;
		}
		this.print(arr);
	}
	
	// [4] 배열을 정렬하는 기능
	void sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			//for(int j=0; j)
		}
	}
}

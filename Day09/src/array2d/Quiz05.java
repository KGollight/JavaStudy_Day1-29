package array2d;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/* 로또 판매기 만들기
		 * 사용자에게 사고싶은 로또 장수를 입력받아 다음과 같이 처리
			- 출력 데이터에는 중복값이 존재할 수 없습니다
			- 출력 데이터는 번호가 "오름차순"으로 정렬되어 출력됩니다.
		 * */
		Scanner s = new Scanner(System.in);
		System.out.println("***사고싶은 로또 장수를 입력하세요.***");
		System.out.print("로또 장수 입력 : ");
		int ea = s.nextInt();
		
		s.close();
		
		int num = (int)(Math.random() * 45) + 1;
		System.out.println("num = "+num);
		
//		1차 로또 번호 추첨(6개) - 중복과 정렬을 해결해야함
		int[] t = new int[6];
		for(int i=0; i < t.length; i++) {
			t[i] = (int)(Math.random() * 45) + 1;

//			0번부터 (i-1)까지의 위치를 돌면서 t[i]와 같은 숫자가 있는지 검사(중복검사)
			for(int j=0; j < i; j++) {
				if(t[i] == t[j]) {//중복 발생시
					System.out.println("중복!");
					i--;
					break;
				}
			}
		}

//		정렬(선택 정렬)
		for(int k=0; k < t.length - 1; k++) {
			int min = k;
			for(int i=k+1; i < t.length; i++) {
				if(t[min] > t[i]) {
					min = i;
				}
			}
			
			int tmp = t[k];
			t[k] = t[min];
			t[min] = tmp;
		}
		
		for(int i=0; i < t.length; i++) {
			System.out.print(t[i]+"\t");
		}
		System.out.println();
		
//		1장 로또 번호 추첨(6개x5차)
		
		int[][] lotto = new int[5][6];
		
		for(int k=0; k < lotto.length; k++) {
			for(int i=0; i < t.length; i++) {
				t[i] = (int)(Math.random() * 45) + 1;

//				0번부터 (i-1)까지의 위치를 돌면서 t[i]와 같은 숫자가 있는지 검사(중복검사)
				for(int j=0; j < i; j++) {
					if(t[i] == t[j]) {//중복 발생시
						System.out.println("중복!");
						i--;
						break;
					}
				}
			}

//			정렬(선택 정렬)
			for(int w=0; w < t.length - 1; w++) {
				int min = w;
				for(int i=w+1; i < t.length; i++) {
					if(t[min] > t[i]) {
						min = i;
					}
				}
				
				int tmp = t[w];
				t[w] = t[min];
				t[min] = tmp;
			}
		}
		
	}
}

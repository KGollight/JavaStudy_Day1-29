package oop.method5;

public class Utility {
	// [1] �迭�� ȭ�鿡 ���
	void print(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
	
	// [2] �迭�� ������ ���
	void reverse(int[] rev) {
		for(int i=0; i<rev.length/2; i++) {
			int tmp=rev[i];
			rev[i] = rev[rev.length-i-1];
			rev[rev.length-i-1]=tmp;
		}
		this.print(rev);
	}
	
	// [3] �迭�� �������� ���� ���
	void random(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			// ��� ��ġ ����
			int target=(int)(Math.random()*arr.length);
			if(i==target) {
				i--;
				continue; // �ݺ����� ó������ �ö󰡶�
			}
			// i�� target�� ��ġ�� ����
			int tmp = arr[i];
			arr[i] = arr[target];
			arr[target] = tmp;
		}
		this.print(arr);
	}
	
	// [4] �迭�� �����ϴ� ���
	void sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			//for(int j=0; j)
		}
	}
}

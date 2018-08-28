package oop.method5;

import java.util.Arrays;

public class Quiz01 {

	public static void main(String[] args) {
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		Utility util = new Utility();

		System.out.print("[1] : ");
		util.print(data);
		//System.out.println(Arrays.toString(data));

		System.out.print("[2] : ");
		util.reverse(data);
		
		System.out.print("[3] : ");
		util.random(data);
		
		System.out.print("[4] : ");
		util.sort(data);
	}

}

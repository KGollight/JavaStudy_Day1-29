package oop.method4;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		Utility util = new Utility();
		util.print(data);
		
		System.out.println(Arrays.toString(data));
	}

}

package oop.method4;

public class Utility {
	 void print(int[] arr) {
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i]+", "); 
		}
		System.out.println(arr[arr.length-1]);
	 }
}

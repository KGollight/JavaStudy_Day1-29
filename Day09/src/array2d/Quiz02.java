package array2d;

public class Quiz02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num1=0;
		int num2=0;
		int c = 1;
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
//				System.out.println(j+"¹øÁÙ "+i+"¹øÄ­");
				arr[j][i] = c++;
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			num1++;
			num2=0;
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=num1+num2;
				num2+=5;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

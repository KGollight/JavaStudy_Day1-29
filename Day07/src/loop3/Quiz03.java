package loop3;

public class Quiz03 {

	public static void main(String[] args) {
		int count=0;
		int start=100;
		int finish=999;
		for(int i=start; i<=finish; i++) {
			int a=i/100;
			int b=i/10%10;
			int c=i%10;
			
			boolean five = a==5||b==5||c==5;
			if(five) {
				System.out.println(a+""+b+""+c);
				count++;
			}
		}
		System.out.println("5가 포함된 숫자의 개수 : "+count);
	}

}

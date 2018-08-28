import java.lang.*;

public class Quiz08 {
	public static void main(String[] args) {
		int a = 2500;
		int b = 1900;
		
		int ea = 5;
		int free = ea/10;
		int a5 = a*(ea-free);
		int b5 = b*92/100;
		
		if(a5>b5)
			System.out.println("B커피숍이 더 저렴합니다.");
		else if(a5<b5)
			System.out.println("A커피숍이 더 저렴합니다.");
		else
			System.out.println("그게 그거");
		
		int pa = a*9/10;
		int pb = b*92/100;;
		
		if(pa>pb)
			System.out.println("B커피숍이 더 저렴합니다.");
		else if(pa<pb)
			System.out.println("A커피숍이 더 저렴합니다.");
		else
			System.out.println("그게 그거");
	}
}

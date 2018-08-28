package api.util.scanner;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		String num = "123 + 456 * 789 - 876 / 543 + 21";
		
		Scanner s = new Scanner(num);
		
		s.useDelimiter("\\s?[+*-/+]\\s?");
		
		int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		while(s.hasNext()) {
			String part = s.next();
			max = Math.max(max, Integer.parseInt(part));
			min = Math.min(min, Integer.parseInt(part));
			System.out.println("part = "+part);
		}
		s.close();
		
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}

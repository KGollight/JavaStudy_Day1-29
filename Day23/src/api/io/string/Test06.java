package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) throws IOException {
		
		File target = new File("files", "Red Velvet - Power up.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(target));
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String song = br.readLine();
			if(song==null) break;
			System.out.println("가사 : "+song);
			String input = s.nextLine();
			
			if(input.equals(song)) {
				System.out.println("pass!");
			}
			else {
				while(true) {
					System.out.println("재입력!");
					System.out.println("가사 : "+song);
					input = s.nextLine();
					if(input.equals(song)) {
						System.out.println("pass!");
						break;
					}
				}
			}
		}
		
		s.close();
		br.close();
	}
	
	public static void check(String lilne) {
		
	}
}

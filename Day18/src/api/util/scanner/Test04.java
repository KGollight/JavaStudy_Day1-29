package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws FileNotFoundException {
//		파일 읽기
		File target = new File("hello.txt");
		
		Scanner s = new Scanner(target);
		while(s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println(line);
		}
		s.close();
	}

}

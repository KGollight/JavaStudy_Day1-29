package api.awt.event;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) {
		//simple.txt의 내용을 불러와서 화면에 출력
		File target = new File("simple.txt");

		StringBuffer sb = new StringBuffer();
		try(BufferedReader in = new BufferedReader(new FileReader(target));){
			while(true) {
				String line = in.readLine();
				if(line == null) break;
				sb.append(line+"\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		
	}
}








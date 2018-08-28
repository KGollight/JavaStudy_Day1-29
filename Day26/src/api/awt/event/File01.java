package api.awt.event;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File01 {
	public static void main(String[] args) {
		//simple.txt에 어떤 문자열을 저장
		File target = new File("simple.txt");
		
		String text = "hello java";
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(target)));){
			out.println(text);
//			out.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}










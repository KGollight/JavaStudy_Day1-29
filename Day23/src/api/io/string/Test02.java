package api.io.string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
//		문자열을 바이트로 변환하여 싱글바이트 출력을 사용
		
		File target = new File("files", "string.txt");
		FileOutputStream out = new FileOutputStream(target);
		
		String text = "하루만 더 있으면 휴가다!!!";
		
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		out.write(text.getBytes());		out.write('\n');
		
		out.close();
	}

}

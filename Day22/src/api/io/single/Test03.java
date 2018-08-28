package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
		
		File target = new File("files", "singles.txt");
		FileInputStream in = new FileInputStream(target);
		
		File copy = new File("files", "copy.txt");
		FileOutputStream out = new FileOutputStream(copy);
		
		while(true) {
			int n = in.read();
			if(n==-1)
				break;
			out.write(n);
		}
		
		in.close();
		out.close();
	}

}

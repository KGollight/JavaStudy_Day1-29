package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File target = new File("files", "time.txt");
		
		ObjectOutputStream object = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(target)));
		
//		Date 인스턴스를 만들어 Object 형태로 저장
		Date d = new Date();
		
		object.writeObject(d);
		
//		object.flush();
		object.close();
	}

}

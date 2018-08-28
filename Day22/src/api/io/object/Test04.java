package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
File target = new File("files", "time.txt");
		
		ObjectInputStream object = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(target)));

		Date d = (Date) object.readObject();
		
		object.close();
		
		System.out.println("d = "+d);
		Format f = new SimpleDateFormat("y-MM-dd E a h:mm:ss");
		System.out.println(f.format(d));
	}

}

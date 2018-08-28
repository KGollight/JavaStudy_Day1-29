package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test05 {

	public static void main(String[] args) throws IOException {
//		Collection�� ���Ͽ� ����		ok
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=100; i++) {
			list.add(i);
		}
		
		File target = new File("files", "list.txt");
		
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		object.writeObject(list);
		
//		object.flush();
		object.close();
	}

}

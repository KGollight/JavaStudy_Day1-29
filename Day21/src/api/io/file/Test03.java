package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		List<File> list = new ArrayList<>();
		
		for(char i='A'; i<='Z'; i++) {
			String name = i+":/";
			File drive = new File(name);
//			System.out.println(drive.getAbsolutePath()+" : "+drive.exists());
			if(drive.exists()) {
				list.add(drive);
			}
		}
		
		System.out.println("��ǻ�Ϳ� ����� ����̺�");
		for(File drive : list) {
			System.out.println(drive);
		}
	}

}

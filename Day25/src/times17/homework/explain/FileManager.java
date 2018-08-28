package times17.homework.explain;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * files/member.db 파일을 관리하는 클래스
 * @author HWANG
 */
public class FileManager {
	
	private File file = new File("db", "member.db");
	
	public FileManager() {
		try {
			if(!file.exists())
				file.createNewFile();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save(List<Member> list) {
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));){
			out.writeObject(list);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Member> load(){
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){
			List<Member> list =  (List<Member>) in.readObject();
			return list;
		}
		catch(Exception e) {
			return new ArrayList<>();
		}
	}
	
	/**
	 * 회원가입
	 *  - 멤버 인스턴스를 받아서 "아이디가 중복되지 않았다면" 저장
	 * @param member
	 */
	public boolean join(Member member) {
		List<Member> list = load();
		
		for(Member m : list) {
			if(m.getId().equals(member.getId())) {
				return false;
			}
		}
		
		list.add(member);
		save(list);
		return true;
	}
	
	public boolean login(Member member) {
		List<Member> list = load();
		
		for(Member m : list) {
			if(m.getId().equals(member.getId()) && 
					m.getPassword().equals(member.getPassword()))
				return true;
		}
		return false;
	}
	
}














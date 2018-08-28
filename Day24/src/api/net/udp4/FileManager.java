package api.net.udp4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

/**
 *	파일 관리 도구
 *	 - vote.db라는 파일을 이용하여 투표 데이터를 저장 및 불러오기
 * @author HWANG
 */
public class FileManager {
	
	/**
	 * 데이터가 저장될 파일의 인스턴스
	 */
	private File file = new File("db", "vote.db");
	
	/**
	 * 초기화하며 파일을 생성
	 */
	public FileManager() {
		try {
			if(!file.exists())
				file.createNewFile();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 저장 기능
	 * @param map 저장할 Collection 인스턴스
	 */
	public void save(Map<String, Integer> map) {
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));){
			out.writeObject(map);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 열기 기능
	 * @return 불러온 Collection 인스턴스
	 */
	public Map<String, Integer> load(){
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){
			Map<String, Integer> map = (Map<String, Integer>) in.readObject();
			return map;
		}
		catch(Exception e) {
//			e.printStackTrace();
//			return new HashMap<>();
			return new TreeMap<>();
		}
	}
	
	/**
	 * 투표 기능
	 * - 파일 열기 → 투표수 증가 → 파일 저장
	 * @param name 투표할 대상의 이름
	 */
	public void vote(String name) {
		Map<String, Integer> map = load();
		
		Integer value = map.get(name);
		//name이 없으면 value == null
		if(value == null) value = 0;
		
		map.put(name, value + 1);
		
		save(map);
	}
	
	/**
	 * 리스트 출력 기능
	 */
	public void list() {
		Map<String, Integer> map = load();
		
		System.out.println("## 투표 결과 ##");
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[ "+entry.getKey()+" ] "+entry.getValue());
		}
	}
	
}











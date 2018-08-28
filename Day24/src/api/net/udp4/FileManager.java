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
 *	���� ���� ����
 *	 - vote.db��� ������ �̿��Ͽ� ��ǥ �����͸� ���� �� �ҷ�����
 * @author HWANG
 */
public class FileManager {
	
	/**
	 * �����Ͱ� ����� ������ �ν��Ͻ�
	 */
	private File file = new File("db", "vote.db");
	
	/**
	 * �ʱ�ȭ�ϸ� ������ ����
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
	 * ���� ���
	 * @param map ������ Collection �ν��Ͻ�
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
	 * ���� ���
	 * @return �ҷ��� Collection �ν��Ͻ�
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
	 * ��ǥ ���
	 * - ���� ���� �� ��ǥ�� ���� �� ���� ����
	 * @param name ��ǥ�� ����� �̸�
	 */
	public void vote(String name) {
		Map<String, Integer> map = load();
		
		Integer value = map.get(name);
		//name�� ������ value == null
		if(value == null) value = 0;
		
		map.put(name, value + 1);
		
		save(map);
	}
	
	/**
	 * ����Ʈ ��� ���
	 */
	public void list() {
		Map<String, Integer> map = load();
		
		System.out.println("## ��ǥ ��� ##");
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("[ "+entry.getKey()+" ] "+entry.getValue());
		}
	}
	
}











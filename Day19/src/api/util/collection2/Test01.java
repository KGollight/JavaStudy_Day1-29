package api.util.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		Student�� ���� �� ������ List ����
		List<Student> list = new ArrayList<>();
		
//		list.add("ȫ�浿", 100);
//		Student stu = new Student("ȫ�浿", 100);
//		list.add(stu);
		list.add(new Student("ȫ�浿", 100));	//[0]
		
		list.add(new Student("�̼ҷ�", 90));	//[1]
		list.add(new Student("Ȳ��ȫ", 80));	//[2]
		list.add(new Student("�Ӳ���", 70));	//[3]
		list.add(new Student("����", 60));	//[4]
		
//		����
		Student stu = list.get(1);
		System.out.println(stu.getName()+" / "+stu.getScore());
		
//		�˻� : �̸��� ������ �����Ͱ� �ֳ���? ��(true)
//		System.out.println(list.contains("����"));	//String���� Student �˻��� �Ұ���
//		System.out.println(list.contains(new Student("�̼ҷ�", 90)));	//�ν��Ͻ��� �ٸ��Ƿ� �˻��� �Ұ���
		
//		�ذ��� : 
//		[1] �� ������ �������� �ƴ϶� ������ ����
//		[2] �ݺ������� ���� ������ �˻�
		String name = "����";
		boolean searchFlag = false;
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			if(s.getName().equals(name)) {
				searchFlag = true;
				break;
			}
		}
		
		System.out.println("searchFlag = "+searchFlag);
		
//		����
		name = "�Ӳ���";
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			if(s.getName().equals(name)) {
//				list.remove(i);
				list.remove(s);
				break;
			}
		}
		
		System.out.println(list);
		System.out.println(list.size());
	}

}

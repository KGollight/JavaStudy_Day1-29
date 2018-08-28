package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {

	public static void main(String[] args) {
//		Student �迭�� ����� ������ �غ���
		
		Student[] stu = new Student[3];
		stu[0] = new Student("������", 90);
		stu[1] = new Student("������", 95);
		stu[2] = new Student("�̼���", 85);
		
//		stu�� ���̺귯���� �̿��� ������ ���� �ʴ´�.
//		 -> ��� �������� ���������� �˷����� �ʾҴ�.
//		 -> sort�� �θ��鼭 ���ı����� ���� �˷��ش�.
		
//		Arrays.sort(stu);
		
//		�� ���� ����(Comparator)
//		Comparator<Student> c = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				//o1�� o2�� ��� �������� ��ǻ�Ϳ��� �˷��ش�.
//				
//				//��� ��ȯ �� ������ �ٲٶ�� ��
//				//���� ��ȯ �� ������ �ٲ��� ����� ��
//				
////				�̸���
//				return o1.getName().compareTo(o2.getName());
//				
////				������
////				if(o1.getScore()>o2.getScore())
////					return 1;
////				else
////					return -1;
////				return o1.getScore() - o2.getScore();
//			}
//		};
		
//		������(���ٽ�)
//		Comparator<Student> c = (o1,o2)->o1.getScore()-o2.getScore();
		
//		�̸���(���ٽ�)
		Comparator<Student> c = 
				(o1,o2)->o1.getName().compareTo(o2.getName());
		
		Arrays.sort(stu,  c);
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName()+" / "+stu[i].getScore());
		}
//		System.out.println(Arrays.toString(stu));
	}

}

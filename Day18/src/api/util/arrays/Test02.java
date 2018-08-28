package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {

	public static void main(String[] args) {
//		Student 배열을 만들어 정렬을 해보자
		
		Student[] stu = new Student[3];
		stu[0] = new Student("양현석", 90);
		stu[1] = new Student("박진영", 95);
		stu[2] = new Student("이수만", 85);
		
//		stu는 라이브러리를 이용해 정렬이 되지 않는다.
//		 -> 어떠한 기준으로 정렬할지를 알려주지 않았다.
//		 -> sort를 부르면서 정렬기준을 같이 알려준다.
		
//		Arrays.sort(stu);
		
//		비교 기준 생성(Comparator)
//		Comparator<Student> c = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				//o1과 o2를 어떻게 비교할지를 컴퓨터에게 알려준다.
//				
//				//양수 반환 시 순서를 바꾸라는 뜻
//				//음수 반환 시 순서를 바꾸지 말라는 뜻
//				
////				이름순
//				return o1.getName().compareTo(o2.getName());
//				
////				점수순
////				if(o1.getScore()>o2.getScore())
////					return 1;
////				else
////					return -1;
////				return o1.getScore() - o2.getScore();
//			}
//		};
		
//		점수순(람다식)
//		Comparator<Student> c = (o1,o2)->o1.getScore()-o2.getScore();
		
//		이름순(람다식)
		Comparator<Student> c = 
				(o1,o2)->o1.getName().compareTo(o2.getName());
		
		Arrays.sort(stu,  c);
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].getName()+" / "+stu[i].getScore());
		}
//		System.out.println(Arrays.toString(stu));
	}

}

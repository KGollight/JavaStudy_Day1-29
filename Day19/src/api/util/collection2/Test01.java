package api.util.collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
//		Student를 여러 개 보관할 List 생성
		List<Student> list = new ArrayList<>();
		
//		list.add("홍길동", 100);
//		Student stu = new Student("홍길동", 100);
//		list.add(stu);
		list.add(new Student("홍길동", 100));	//[0]
		
		list.add(new Student("이소룡", 90));	//[1]
		list.add(new Student("황비홍", 80));	//[2]
		list.add(new Student("임꺽정", 70));	//[3]
		list.add(new Student("성룡", 60));	//[4]
		
//		추출
		Student stu = list.get(1);
		System.out.println(stu.getName()+" / "+stu.getScore());
		
//		검색 : 이름이 성룡인 데이터가 있나요? 예(true)
//		System.out.println(list.contains("성룡"));	//String으로 Student 검색이 불가능
//		System.out.println(list.contains(new Student("이소룡", 90)));	//인스턴스가 다르므로 검색이 불가능
		
//		해결방법 : 
//		[1] 비교 기준을 리모컨이 아니라 값으로 변경
//		[2] 반복문으로 직접 꺼내어 검색
		String name = "성룡";
		boolean searchFlag = false;
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			if(s.getName().equals(name)) {
				searchFlag = true;
				break;
			}
		}
		
		System.out.println("searchFlag = "+searchFlag);
		
//		삭제
		name = "임꺽정";
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

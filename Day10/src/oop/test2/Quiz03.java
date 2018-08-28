package oop.test2;

public class Quiz03 {

	public static void main(String[] args) {
		// ,스포츠 정보
		Sport bb = new Sport();
		Sport sc = new Sport();
		Sport bk = new Sport();
		Sport mt = new Sport();
		
		bb.insert("야구", "구기종목", 9);
		sc.insert("축구", "구기종목", 11);
		bk.insert("농구", "구기종목", 5);
		mt.insert("마라톤", "육상종목", 1);
		
		bb.print();
		sc.print();
		bk.print();
		mt.print();
	}

}

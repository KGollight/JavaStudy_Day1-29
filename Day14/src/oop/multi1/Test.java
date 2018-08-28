package oop.multi1;

// 인터페이스		다중상속 전용 클래스
//				추상클래스와 비슷해보이지만 기능 제약이 심하다
public interface Test {
	// 변수		상수(psf)만 가능
	/*public static final*/ int a=10;
	
	// 메소드		추상메소드만 가능
	/*public abstract*/void test();
	
	// 생성자(x)
	// 클래스		static 중첩클래스만 가능
}

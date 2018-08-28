package api.lang.object;

public class Test03 {

	public static void main(String[] args) {
		// Sample클래스에 Object의 기능이 들어있는지 학인
		Sample a = new Sample();
		
		System.out.println(a.getClass());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
	}

}

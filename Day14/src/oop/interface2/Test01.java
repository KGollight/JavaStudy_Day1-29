package oop.interface2;

public class Test01 {

	public static void main(String[] args) {
		Func a = new Func() {
			
			@Override
			public int proc(int a, int b) {
				return a+b;
			}
		};
		System.out.println(a.proc(10, 20));
		
		Func b = (int x, int y) -> {
			return x+y;
		};
		System.out.println(b.proc(10, 20));
		
		Func c = (x, y) -> x+y;
		System.out.println(c.proc(10, 20));
	}

}

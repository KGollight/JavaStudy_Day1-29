package generic;

public class Test01 {

	public static void main(String[] args) {

//		형태를 지정하지 않고 생성(E = Object)
		Data a = new Data();
		
//		형태를 지정하고 생성(E = Object)
		Data<Object> b = new Data<Object>();
		Data<Object> c = new Data<>();
		Data<?> d = new Data<>();
		
//		E = String
		Data<String> e = new Data<>();
//		e.setValue(100);//형태 불일치
		e.setValue("hello");//형태 일치
		System.out.println(e.getValue());
		
//		E에는 원시형 지정이 불가능
//		Data<int> f = new Data<>();
		Data<Integer> f = new Data<>();
		f.setValue(100);
		System.out.println(f.getValue());
	}
}



package generic;

public class Test01 {

	public static void main(String[] args) {

//		���¸� �������� �ʰ� ����(E = Object)
		Data a = new Data();
		
//		���¸� �����ϰ� ����(E = Object)
		Data<Object> b = new Data<Object>();
		Data<Object> c = new Data<>();
		Data<?> d = new Data<>();
		
//		E = String
		Data<String> e = new Data<>();
//		e.setValue(100);//���� ����ġ
		e.setValue("hello");//���� ��ġ
		System.out.println(e.getValue());
		
//		E���� ������ ������ �Ұ���
//		Data<int> f = new Data<>();
		Data<Integer> f = new Data<>();
		f.setValue(100);
		System.out.println(f.getValue());
	}
}



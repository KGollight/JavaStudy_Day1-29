package api.lang.stringbuffer;

public class Test02 {

	public static void main(String[] args) {
		String a = "hello";
		String b = "java";
//		String c = a+b;
		a+=b;
		
		//���� �ڵ带 �����ϱ� ���� �ӽ÷� a�� �纻�� ���� b�� ���� �� a�� ����⸦ ����
		// -> ���ʿ��� ���纻�� ���ܼ� �ӵ��� ���ϵ�
		// -> String Buffer Ŭ������ ����Ͽ� ���ʿ��� ���縦 ����
	}

}

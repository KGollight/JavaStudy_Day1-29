package api.lang.stringbuffer;

public class Test01 {

	public static void main(String[] args) {
		//���ڿ� �ռ�
		// - ���ڿ��� +�� ����ϸ����ϱ� ������ '�ſ� ����'
		// - ���� : String�� Ư¡ ����
		String str = "";	//empty string
		
		for(int i=0; i<10000; i++) {
			str += "hello"+i+"~!\n";
		}
		
		System.out.println(str);
	}

}

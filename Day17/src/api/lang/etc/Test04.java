package api.lang.etc;

public class Test04 {

	public static void main(String[] args) {
		//System Ŭ����		�ü���� ������ �����ϴ� Ŭ����
		
		//�ü���� ���α׷��� 3������ ��η� ����Ǿ� �ִ�.
		//System.in / System.out / System.err
		System.err.println("����");
		System.out.println("����");
		
		//�ü���� ����
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name"));	//Ư�� �ü�������� ��� ������ ���α׷��� �� �������� ���
		
		System.out.println(System.getProperty("user.home"));	//���� ����
		System.out.println(System.getProperty("user.dir"));		//���α׷� ���� ����
		
		//���α׷� ����
		System.exit(0);
	}

}

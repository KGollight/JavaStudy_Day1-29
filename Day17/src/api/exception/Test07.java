package api.exception;

public class Test07 {

	public static void main(String[] args) {
		//���Ѵٸ� ���� Ŭ������ ���� ����� ��뵵 ����
		// -> �ڹٿ� �⺻������ �����ϴ� �������� ǥ���ϱ� ����� ���
		
		try {
			String id = "�ȳ��ϼ���";
			
			if(id.length()<2 || id.length()>6) {
//				throw new Exception("���̵�� 2~6���ڷ� �Է��ϼ���...");
				throw new LengthException("���̵�� 2~6���ڷ� �Է��ϼ���...");
			}
		}
		catch(Exception e) {
			System.out.println("[����]"+e.getMessage());
			e.printStackTrace();
		}
	}

}

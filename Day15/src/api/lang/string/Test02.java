package api.lang.string;

public class Test02 {

	public static void main(String[] args) {
		//���ڿ��� �˻�
		
		String str = "java@itbank.com";
		System.out.println(str.length());				//���� �� �˻�
		System.out.println(str.endsWith(".com"));		//���� �˻�
		System.out.println(str.startsWith("java"));		//���� �˻�(���� �ӼӸ� ���� ��ɾ� �� ���)
		System.out.println(str.contains("itbank"));		//���� �˻�
		System.out.println(str.indexOf("itbank"));		//���� ��ġ �˻�
		
		System.out.println(str.charAt(0));				//�ش� ��ġ ���� ����
	}

}

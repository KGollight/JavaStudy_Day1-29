package array;

public class Quiz02 {

	public static void main(String[] args) {
		// �����͸� �迭�� ������ �� �������� 1���� ��÷�Ͽ� ���
		String[] data = new String[] {"�ڹ�", "���̽�", "������", "������", "Iot"};
		
		int ran = (int)(Math.random()*data.length);
		
		System.out.println("��÷ ��� : "+data[ran]);
	}

}

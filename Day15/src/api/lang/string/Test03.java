package api.lang.string;

public class Test03 {

	public static void main(String[] args) {
		//���ڿ� ����
		String word = "�ڹ� Programming";
		
		//��ҹ��� ��ȯ
		System.out.println(word.toLowerCase()); //�ҹ���
		System.out.println(word.toUpperCase()); //�빮��
		
		//�ڸ���
		System.out.println(word.substring(3, 10));	//Program
		System.out.println(word.substring(3));		//Programming
		
		String time = "2018-07-31 13:14:30";
		
		//��¥�� ���(07-31)
		System.out.println(time.substring(5, 10));
		
		//�ð��� ���(13:14)
		System.out.println(time.substring(11, 16));
		
		//ü�̴� ȣ��
		System.out.println(word.substring(3, 10).toLowerCase());
		
		//��������
		String a = "     hello java       ";
		System.out.println(a.trim());
		System.out.println(a.trim().length());
		
		//ġȯ
		String b = "���� ���ڰ� ���ƿ�";
		System.out.println(b);
		System.out.println(b.replace("����", "������"));
		System.out.println(b.replace("����", "������").replace("����", "�Ⱦ�"));
	}

}

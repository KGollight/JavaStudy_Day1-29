package oop.staticfinal1;

public class SumResult {
	// 1���� 100������ �հ�
	//  -> ������ �ʿ������� ����� �� ����
	//  -> ���� Ư�������� �̿��Ͽ� ó��
	// public static final int to100=5050;
	public static final int to100;
	static {	// static ���� �ʱ�ȭ ����
		int total=0;
		for(int i=1; i<=100; i++) {
			total+=i;
		}
		to100 = total;
	}
	
	// 1���� 1000������ �հ�
	public static final int to1000;
	static {
		int total=0;
		for(int i=1; i<=1000; i++) {
			total+=i;
		}
		to1000 = total;
	}
	
	// 1���� 10000������ �հ�
	public static final int to10000;
	static {
		int total=0;
		for(int i=1; i<=10000; i++) {
			total+=i;
		}
		to10000 = total;
	}
}

package com.itbank.util;

/**
 * �� Ŭ������ �������� ����� ����� ���� Ŭ�����Դϴ�
 * 
 * @author ������
 *
 */
public class RandomUtility {
	
	/**
	 * ���ϴ� ������ �������� ��ȯ�ϴ� �޼ҵ�
	 * @param start : ������ ����
	 * @param finish : ������ ��
	 * @return => �ش� ������ ������ ������
	 */
	public static int random(int start, int finish) {
		int range=finish-start+1;
		return(int)(Math.random()*range)+start;
	}
}

package api.lang.string;

public class Test20 {
	public static void main(String[] args) {
		//���� ��ġ������ ����
		String[] data = new String[] {
			"�ư��ƾƾƾƾ�", "�ƾƾư��ƾƾ�", "�ƾƾƾƾƾư�", "���ƾƾƾƾƾ�", 
			"�ƾư��ƾƾƾ�", "�ƾƾƾư��ƾ�", "�ƾƾƾƾư���"
		};
		String search = "��";
		
		SearchUtil util = new SearchUtil();
		util.sortByIndex(data, search);
		util.print(data);
		
	}
}

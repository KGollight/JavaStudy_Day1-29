package api.lang.string;

public class Test21 {
	public static void main(String[] args) {
		String[] data = new String[] {
			"��ī��", "������", "���α�", "��Ϻα�", "���̸�", "���ڸ�"
		};
		String search = "��";
		
		//�迭�� ���� ���� �˻�� ���Ե� �͵鸸 �߰�
		//[1] �ű� �迭�� ũ�� = �˻�� �����ϴ� �ܾ� ����
		
		SearchUtil util = new SearchUtil();
		String[] result = util.search(data, search);
		util.print(data);
		util.print(result);
		
		
	}
}







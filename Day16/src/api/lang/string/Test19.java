package api.lang.string;

public class Test19 {

	public static void main(String[] args) {
		//Test18�� ����� Ȯ���Ͽ� �迭�� �˻� �󵵼����� ����
		
		String[] data = new String[] {
			"���̸�", "���α�", "��ī��", "������", "�̺���"	
		};
		String search = "��";	//�˻���
		
		SearchUtil util = new SearchUtil();
		
		util.sort(data);
		util.sortByApper(data, search);
		
		util.print(data);
	}

}

package api.lang.string;

public class Test18 {

	public static void main(String[] args) {
		//���� �󵵼����� ����
		
		String word = "ġŰġŰ��ī��ī����������";
		String search = "����";
		
//		System.out.println(word.indexOf(search));
//		System.out.println(word.indexOf(search, 9));
//		System.out.println(word.indexOf(search, 11));
		
		SearchUtil util = new SearchUtil();
		int count = util.appear(word, search);
		
		System.out.println("count = "+count);
	}

}

package api.lang.string;

public class Test04 {

	public static void main(String[] args) {
		//���ڿ� �и�
		String word = "����/��Ȳ/���/�ʷ�/�Ķ�/����/����";	//�� ��� '/'�� �����ڶ�� �Ѵ�.
		
		String[] color = word.split("/");
		
		System.out.println(color.length);
		for(int i=0; i<color.length; i++) {
			System.out.print(color[i]+"\t");
		}
	}

}

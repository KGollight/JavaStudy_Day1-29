package api.lang.string;

public class Test17 {

	public static void main(String[] args) {
//		String a = "hello";
//		String b = "Hello";
//		
//		System.out.println(a.compareTo(b));	//a-b
		
		String[] data = new String[] { 
				"��", "��", "��", "��", "��"
			};
			
			
			SearchUtil util = new SearchUtil();
			
			util.print(data);
			util.sort(data);
			util.print(data);
	}

}

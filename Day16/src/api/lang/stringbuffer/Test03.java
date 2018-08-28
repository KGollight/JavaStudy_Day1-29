package api.lang.stringbuffer;

public class Test03 {

	public static void main(String[] args) {
		
		//StringBuffer	문자열 합성 저장소
		
		StringBuffer sb = new StringBuffer();
		
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			sb.append("hello"+i+"~!\n");
		}
		long finish = System.currentTimeMillis();
		System.out.println((double)(finish-start)/1000+"초");	//소요시간(밀리초)
		
		String str = sb.toString();
		System.out.println(str.length());
	}

}

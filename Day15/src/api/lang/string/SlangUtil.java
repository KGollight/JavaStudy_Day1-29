package api.lang.string;

public class SlangUtil {
	
	private String[] slang = new String[] {
			"신발끈", "수박씨", "시베리아", "조카", "샹들리에", 
			"식빵", "쌍쌍바", "젓가락", "족구", "십장생", "후레지아", "된장"
	};
	
	//별 생성 메소드
		public String createStar(int size) {
			String str = "";//empty string(빈문자열)
			for(int i=0; i < size; i++) {
				str += "*";
			}
			return str;
		}
		
		//필터링 수행
		public String slang(String text) {
			//slang에 들어간 단어 개수만큼 반복하여 치환 처리
			for(int i=0; i < slang.length; i++) {
				text = text.replace(slang[i], this.createStar(slang[i].length()));
			}
			return text;
		}
	}


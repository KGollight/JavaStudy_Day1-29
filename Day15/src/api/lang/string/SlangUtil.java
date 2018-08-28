package api.lang.string;

public class SlangUtil {
	
	private String[] slang = new String[] {
			"�Ź߲�", "���ھ�", "�ú�����", "��ī", "���鸮��", 
			"�Ļ�", "�ֹֽ�", "������", "����", "�����", "�ķ�����", "����"
	};
	
	//�� ���� �޼ҵ�
		public String createStar(int size) {
			String str = "";//empty string(���ڿ�)
			for(int i=0; i < size; i++) {
				str += "*";
			}
			return str;
		}
		
		//���͸� ����
		public String slang(String text) {
			//slang�� �� �ܾ� ������ŭ �ݺ��Ͽ� ġȯ ó��
			for(int i=0; i < slang.length; i++) {
				text = text.replace(slang[i], this.createStar(slang[i].length()));
			}
			return text;
		}
	}


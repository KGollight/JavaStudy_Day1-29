package oop.method3;

public class Utiliy01 {
	
	// ū ���� ��ȯ
	int bigNum(int n1, int n2) {
		if(n1>=n2)
			return n1;
		else
			return n2;
	}
	
	// ���ĺ��� ����
	boolean isAlphabet(char al) {
		boolean result;
		if(al>='A' && al<='z')
			result=true;
		else
			result=false;
		return result;
	}
	
	// ����ܾ ���� - �ѱ��ھ� �����Ͽ� �˻�
	boolean engWord(String word) {
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(!this.isAlphabet(ch)) {	// ���ĺ��� �ƴϸ�
				return false;
			}
		}
		return true;
	}
}

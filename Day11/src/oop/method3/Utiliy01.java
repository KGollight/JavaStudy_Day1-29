package oop.method3;

public class Utiliy01 {
	
	// 큰 수를 반환
	int bigNum(int n1, int n2) {
		if(n1>=n2)
			return n1;
		else
			return n2;
	}
	
	// 알파벳을 판정
	boolean isAlphabet(char al) {
		boolean result;
		if(al>='A' && al<='z')
			result=true;
		else
			result=false;
		return result;
	}
	
	// 영어단어를 판정 - 한글자씩 추출하여 검사
	boolean engWord(String word) {
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(!this.isAlphabet(ch)) {	// 알파벳이 아니면
				return false;
			}
		}
		return true;
	}
}

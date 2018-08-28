package generic;

//class를 만들 때 데이터가 필요하긴 하지만 자료형이 미정인 경우
// -> 흔하지 않지만 이런 경우가 존재한다
// -> 사용자에게 생성시 자료형을 지정하게 만든다(Generic class)

// E는 정해지지 않은 자료형을 의미하는 별칭
public class Data<E> {
	
	private E value;
	
	public void setValue(E value) {
		this.value = value;
	}
	
	public E getValue() {
		return value;
	}
	
}

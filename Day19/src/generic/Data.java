package generic;

//class�� ���� �� �����Ͱ� �ʿ��ϱ� ������ �ڷ����� ������ ���
// -> ������ ������ �̷� ��찡 �����Ѵ�
// -> ����ڿ��� ������ �ڷ����� �����ϰ� �����(Generic class)

// E�� �������� ���� �ڷ����� �ǹ��ϴ� ��Ī
public class Data<E> {
	
	private E value;
	
	public void setValue(E value) {
		this.value = value;
	}
	
	public E getValue() {
		return value;
	}
	
}

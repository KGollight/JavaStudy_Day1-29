package array;

public class Quiz09 {

	public static void main(String[] args) {
		// ���� ����
		
		int[] data = new int[] {3, 5, 2, 1, 4};
		
		for(int i=0; i<data.length; i++) {
			System.out.println(i+"��ġ���� backup!");
			
			int backup=data[i];	// ���� ��ġ�� ������
			int target=i;	// �������� ��ġ
			
			// ���� ����� backup�� ���Ͽ� �� ��ġ(target)�� ����
			for(int j=i-1; j>=0; j--) {
				System.out.println(i+"�� "+j+"��ġ�� ��!");
				
				if(backup<data[j]) {
					data[j+1]=data[j];	// �ڷ� �����͸� 1ĭ ���������
					target=j;	// ������ ����
				}
				else {
					break;
				}
			}
			System.out.println("������(target) = "+target);
			data[target] = backup;	// ��������͸� ���������� ����
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}

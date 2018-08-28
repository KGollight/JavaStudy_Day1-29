package oop.multi2;

public class Quiz01 {

	public static void main(String[] args) {
//		- �������ָ� �������� 20���� ������ �̵���� ����
//		>> SCV, Zealot
		GroundUnit[] a = new GroundUnit[20];
		for(int i=0; i < a.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				a[i] = new Zealot();//Zealot -> GroundUnit �� ĳ����
			}
			else {
				a[i] = new SCV();//SCV -> GroundUnit �� ĳ����
			}
		}
		
		for(int i=0; i < a.length; i++) {
			a[i].walk();
		}
		
	//	- ��������(FlyingUnit)�� �������� 20���� ������ ������ ����
	//		>> Wraith, Overload
		FlyingUnit[] b = new FlyingUnit[20];
		for(int i=0; i < b.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				b[i] = new Wraith();//Wraith -> FlyingUnit �� ĳ����
			}
			else {
				b[i] = new Overlord();//Overload -> FlyingUnit �� ĳ����
			}
		}
		
		for(int i=0; i < b.length; i++) {
			b[i].fly();
		}
		
	//	- �׶�(Terran)���ָ� �������� 20���� ���� �� ���ݸ�� ����
	//		>> Wraith, SCV
		Terran[] c = new Terran[20];
		for(int i=0; i < c.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				c[i] = new Wraith();//Wraith -> Terran �� ĳ����
			}
			else {
				c[i] = new SCV();//SCV -> Terran �� ĳ����
			}
		}
		
		for(int i=0; i < c.length; i++) {
			c[i].attack();
		}
	}
}



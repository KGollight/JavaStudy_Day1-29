package oop.multi2;

public class Quiz01 {

	public static void main(String[] args) {
//		- 지상유닛만 랜덤으로 20마리 생성후 이동명령 실행
//		>> SCV, Zealot
		GroundUnit[] a = new GroundUnit[20];
		for(int i=0; i < a.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				a[i] = new Zealot();//Zealot -> GroundUnit 업 캐스팅
			}
			else {
				a[i] = new SCV();//SCV -> GroundUnit 업 캐스팅
			}
		}
		
		for(int i=0; i < a.length; i++) {
			a[i].walk();
		}
		
	//	- 공중유닛(FlyingUnit)만 랜덤으로 20마리 생성후 비행명령 실행
	//		>> Wraith, Overload
		FlyingUnit[] b = new FlyingUnit[20];
		for(int i=0; i < b.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				b[i] = new Wraith();//Wraith -> FlyingUnit 업 캐스팅
			}
			else {
				b[i] = new Overlord();//Overload -> FlyingUnit 업 캐스팅
			}
		}
		
		for(int i=0; i < b.length; i++) {
			b[i].fly();
		}
		
	//	- 테란(Terran)유닛만 랜덤으로 20마리 생성 후 공격명령 실행
	//		>> Wraith, SCV
		Terran[] c = new Terran[20];
		for(int i=0; i < c.length; i++) {
			int n = (int)(Math.random() * 2);
			if(n == 0) {
				c[i] = new Wraith();//Wraith -> Terran 업 캐스팅
			}
			else {
				c[i] = new SCV();//SCV -> Terran 업 캐스팅
			}
		}
		
		for(int i=0; i < c.length; i++) {
			c[i].attack();
		}
	}
}



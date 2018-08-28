package oop.method7;

public class Utility {
	
	// [1] �� ���� ������
	int nationCalc(Nations a, Nations b) {
		return a.wPoint-b.wPoint;
	}
	
	// [2] �� ���� ���ؼ� ������ ���� ���� ��ȯ
	String reNation(Nations a, Nations b) {
		if(a.wPoint>b.wPoint)
			return a.name;
		else if(a.wPoint<b.wPoint)
			return b.name;
		else {
			// ������
			if(a.getGoal>b.getGoal)
				return a.name;
			else
				return b.name;
		}
	}
}

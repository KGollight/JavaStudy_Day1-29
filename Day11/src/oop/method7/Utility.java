package oop.method7;

public class Utility {
	
	// [1] 두 나라간 승점차
	int nationCalc(Nations a, Nations b) {
		return a.wPoint-b.wPoint;
	}
	
	// [2] 두 나라를 비교해서 성적이 나은 나라 반환
	String reNation(Nations a, Nations b) {
		if(a.wPoint>b.wPoint)
			return a.name;
		else if(a.wPoint<b.wPoint)
			return b.name;
		else {
			// 득점비교
			if(a.getGoal>b.getGoal)
				return a.name;
			else
				return b.name;
		}
	}
}

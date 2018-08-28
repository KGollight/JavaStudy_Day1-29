package oop.method2;

public class Utility {
	int mul(int num) {
		return num*num;
	}
	
	long mulx(long x, long y) {
		long result=1L;
		for(int i=0; i<y; i++) {
			result*=x;
		}
		return result;
	}
	
	double triangle(int w, int h) {
		return w*h/2.0;
	}
	
	double circle(int r) {
		return (double)(r*r*3.14);
	}
	
	int random(int a, int b) {
		int size = b-a;
		int ran = (int)(Math.random()*size)+a;
		return ran;
		
	}
}

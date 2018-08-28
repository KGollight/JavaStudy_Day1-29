package oop.poly2;

public class Quiz01 {

	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.info();
		c.move("http://www.naver.com");
		c.develope();
		c.music();
		
		FireFox f = new FireFox();
		f.info();
		f.move("http://www.naver.com");
		f.develope();
		f.music();
		
		Edge e = new Edge();
		e.info();
		e.move("http://www.naver.com");
		e.develope();
		e.music();
		
		Whale w = new Whale();
		w.info();
		w.move("http://www.naver.com");
		w.develope();
		w.music();
	}

}

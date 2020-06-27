package test;

public class Qangle {
	int a, h;
	Qangle(){
		a = 10;
		h = 20;
	}
	Qangle(int x, int y){
		a = x;
		h = y;
	}
	Qangle(Qangle r){
		a = r.width();
		h = r.height();
	}
	int width() {
		return a;
	}
	int height() {
		return h;
	}

	public static void main(String[] args) {
		Qangle q1 = new Qangle();
		Qangle q2 = new Qangle(20, 50);
		Qangle q3 = new Qangle(q1);
		System.out.println(q1.width() + " " + q1.height());
		System.out.println(q2.width() + " " + q2.height());
		System.out.println(q3.width() + " " + q3.height());
		
	}
}

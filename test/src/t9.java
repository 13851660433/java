package test;


class Parent{}

class subclass1 extends Parent{}


public class t9 {

	public static void main(String[] args) {
		Parent a = new Parent();
		subclass1 b = new subclass1();
		if(a == b) {
			System.out.println("1");
			
		}else {
			System.out.println("2");
		}
	}
}
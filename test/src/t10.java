package test;

class ParentClass{}
class Sub1 extends ParentClass{}
class Sub2 extends ParentClass{}


public class t10 {
	public static void main(String[] args) {
		ParentClass a = new ParentClass();
		Sub1 b = new Sub1();
		Sub2 c = new Sub2();
		a = (Sub1)b;
	}

}

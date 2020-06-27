package test;

public class PassValueTest {
	private float ptValue;
	public void ch1(int value) {
		System.out.println(value);
		value=55;
	}
	public void ch2(String value) {
		System.out.println(value);
		value = new String("different");
	}
	public void ch3(PassValueTest ref) {
		System.out.println(ref.ptValue);
		ref.ptValue = 99f;
	}
	public static void main(String[] args) {
		String str;
		int val;
		PassValueTest pt = new PassValueTest();
		val = 11;
		pt.ch1(val);
		System.out.println(val);
		str = new String("Hello");
		pt.ch2(str);
		System.out.println(str);
		pt.ptValue = 101f;
		pt.ch3(pt);
		System.out.println(pt.ptValue);
		
	}

}

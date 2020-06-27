package test;

public class PassTest{
	float m_float;
	void ch1(int pi) {
		pi = 100;
	}
	void ch2(String ps) {
		ps = new String("Right");
	}
	void ch3(PassTest po) {
		po.m_float = 100.0f;
	}
	public static void main(String[] args) {
		PassTest pt = new PassTest();
		int i = 22;
		pt.ch1(i);
		System.out.println(i);
		
		String s = new String("Hello");
		pt.ch2(s);
		System.out.println(s);
		
		pt.m_float = 22.0f;
		pt.ch3(pt);
		System.out.println(pt.m_float);
	}
}



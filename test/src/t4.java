package test;
import java.util.Scanner;
import java.lang.StringBuilder;
public class t4 {
	public static void main(String[] args) {
		System.out.println("input:");
		Scanner s = new Scanner(System.in);
		String m = s.next();
		StringBuilder b = new StringBuilder(m);
		b.reverse();
		String b1 = new String(b);
		if (b1.equals(m)) {
			System.out.print(m + " hui");
		}else {
			System.out.print(m + " bu");
		}
	}

}

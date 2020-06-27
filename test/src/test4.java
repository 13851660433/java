package test;
import java.util.Scanner;
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		System.out.print("input:");
		int n = m.nextInt();
		int i = 1, s = 1;
		for (i=1; i<=n; i++) {
			s *= i;
			System.out.println(i);
		}
		System.out.println("s=" + s);

	}
	

}

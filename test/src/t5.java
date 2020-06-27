package test;
import java.util.Scanner;
public class t5 {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.print("input");
		int n = m.nextInt();
		int i = -1, S = 1;
		double y = 0;
		for(S = 1; S <= n; S++) {
			y = y + 1.0/S;
			System.out.println(y);
		}
	}

}

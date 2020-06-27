package test;
import java.util.Scanner;
public class t1 {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("input:");
		int n = m.nextInt();
		double y = 0;
		int s = 1;
		if(n>0) {
			for(s = 1; s <=n; s++) {
				y += 1.0/(3*s);
			}
			y += 1;
			System.out.print(y);
		}
	}

}

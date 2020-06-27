package test;

public class t2 {
	public static void main(String[] args) {
		for(int i = 0; i<=3; i++) {
			for (int j=0;j<=6;j++) {
				if(j>=i && j<=6-i) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i = 4; i<=6; i++) {
			for (int j=0;j<=6;j++) {
				if(j<=i && j>=6-i) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

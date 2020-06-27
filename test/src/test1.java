package test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 9;
		try {
			int i = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		if(j > 2) {
			System.out.println("T");
		}if(j < 2) {
			System.out.println("S");
			
		}else {
			System.out.println("Y");
		}

	}

}

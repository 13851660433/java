import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharInput {
	public static void main(String[] args) {
		int i = 0;
		while(i == 0) {
			String s;
			InputStreamReader ir;
			BufferedReader in;
			ir = new InputStreamReader(System.in);
			in = new BufferedReader(ir);
			System.out.println("input:");
			
			try {
				s = in.readLine();
				if (s.length() < 10) {
					System.out.println("Reader: " + s);
				}else {
					System.out.println("Error");
					continue;
				}
			} catch (IOException e) {
				e.printStackTrace();
			
			}
		}

	}
}

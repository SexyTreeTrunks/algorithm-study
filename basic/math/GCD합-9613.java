import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		//sum of every gcd in array
		
		int num = Integer.parseInt(in.readLine());
		while(num-->0) {
			long sum =0;
			String str= in.readLine();
			String inputs[] = str.split(" ");
            //문제를 잘 읽자!
			for(int i = 1; i<inputs.length - 1; i++) {
				for (int j = i+1; j < inputs.length; j++) {
					int a= Integer.parseInt(inputs[i]);
					int b = Integer.parseInt(inputs[j]);
					sum+=gcd(a,b);
				}
			}
			System.out.println(sum);
		}
		in.close();
	}
	
	static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String str= in.readLine();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());
		int gcd = gcd(a,b);
		System.out.println(gcd);
		System.out.println(lcm(a,b,gcd));
		System.out.println();
		
		in.close();
	}
	
	static int gcd(int a, int b) {
		int r = a%b;
		if(r == 0)
			return b;
		else
			return gcd(b, r);
	}
	
	static int lcm(int a, int b, int gcd) {
		return a*b/gcd;
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		long fac = 1;
		for(int i =2; i<=n; i++)
			fac *= i;
		System.out.println(fac);
		in.close();
	}
}

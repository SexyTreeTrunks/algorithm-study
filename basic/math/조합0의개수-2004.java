import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(in.readLine(), " ");
		long n = Long.parseLong(tokens.nextToken());
		long m = Long.parseLong(tokens.nextToken());
		long num_of_2 = num_of_digit(n, 2) - num_of_digit(n-m, 2) - num_of_digit(m, 2);
		long num_of_5 = num_of_digit(n, 5) - num_of_digit(n-m, 5) - num_of_digit(m, 5);
		System.out.println(Math.min(num_of_2, num_of_5));
		in.close();
	}

	static long num_of_digit(long n, int digit) {
		long num_of_digit = 0;
		for(;digit<=n; n/=digit)
			num_of_digit += n/digit;
		
		return num_of_digit;
	}
}

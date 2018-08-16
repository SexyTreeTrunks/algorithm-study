import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		StringTokenizer tokens = new StringTokenizer(str, " ");
		String n_str = tokens.nextToken();
		int n_sys = Integer.parseInt(tokens.nextToken());
		System.out.println(numToDec(n_str, n_sys));
	}

	static long numToDec(String str, int n_sys) {
		long num = 0;
		long digit = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if (c >= 'A') {
				num += (c - 'A' + 10) * digit;
			} else {
				num += (c - '0') * digit;
			}
			digit *= n_sys;
		}
		return num;
	}
}

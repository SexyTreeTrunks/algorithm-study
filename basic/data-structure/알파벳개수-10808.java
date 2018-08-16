import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int alpha_num[] = new int[26];
		String str = in.readLine();
		for(int i =0; i<str.length(); i++) {
			int idx = str.charAt(i) - 'a';
			alpha_num[idx]++;
		}
		for (int i = 0; i < alpha_num.length; i++) {
			System.out.print(alpha_num[i] + " ");
		}
		in.close();
	}
}

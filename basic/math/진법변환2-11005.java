import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String str= in.readLine();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		int dec = Integer.parseInt(tokenizer.nextToken());
		int num_sys = Integer.parseInt(tokenizer.nextToken());
		str = decToOther(dec, num_sys);
		for (int i = str.length() -1; i> -1; i--) {
			System.out.print(str.charAt(i));
		}
		in.close();
	}
	
	static String decToOther(int d, int num_sys) {
		StringBuilder str = new StringBuilder();
		while(d != 0) {
			int i = d % num_sys;
			if(i > 9) 
				str.append((char) ('A' + (i - 10)));
			else 
				str.append(i);
			d = d/num_sys;
		}
		return str.toString();
	}
}

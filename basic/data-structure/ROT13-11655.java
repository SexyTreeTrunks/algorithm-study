import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		StringBuilder encrpted = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z')
				c= (char) ((((c-'a')+13)%26) + 'a');
			else if('A' <= c && c <= 'Z')
				c= (char) ((((c-'A')+13)%26) + 'A');
			encrpted.append(c);
		}
		System.out.println(encrpted.toString());
		in.close();
	}
	
}

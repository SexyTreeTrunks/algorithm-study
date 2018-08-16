import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String input = in.readLine();
		String suffixes[] = new String[input.length()];
		for (int i = 0; i < suffixes.length; i++) {
			suffixes[i] = input.substring(i);
		}
		Arrays.sort(suffixes);
		for (int i = 0; i < suffixes.length; i++) {
			System.out.println(suffixes[i]);
		}
		in.close();
	}
	
}

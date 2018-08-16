import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder bin = new StringBuilder(in.readLine());
		while(bin.length()%3 != 0)
			bin.insert(0, '0');
		
		for(int i = 0; i<bin.length(); i+=3) {
			System.out.print((bin.charAt(i)-'0')*4 + (bin.charAt(i+1)-'0')*2 + (bin.charAt(i+2)-'0')*1);
		}
		in.close();
	}
}
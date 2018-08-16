import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=in.readLine())!=null && str.length()!=0) {
			int char_count[] = new int[4];
			for (int i = 0; i < str.length(); i++) {
				int idx = charToIdx(str.charAt(i));
				if(idx !=-1)
					char_count[idx]++;
			}
			for (int i = 0; i < char_count.length; i++)
				System.out.print(char_count[i] + " ");
			System.out.println();
		}
		in.close();
	}
	//소 대 숫 공백
	static int charToIdx(char c) {
		if(c >= 'a' && c <= 'z')
			return 0;
		else if('A' <= c && c <= 'Z')
			return 1;
		else if('0' <= c && c<='9')
			return 2;
		else if(' ' == c)
			return 3;
		else
			return -1;
	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int sub =0,n = Integer.parseInt(in.readLine());
		while(n-- > 0) {
			StringTokenizer tokens = new StringTokenizer(in.readLine());
			int x;
			switch(tokens.nextToken()) {
			case "add":
				x = Integer.parseInt(tokens.nextToken());
				sub |= (1<<x);
				break;
			case "remove":
				x = Integer.parseInt(tokens.nextToken());
				sub &= ~(1<<x);
				break;
			case "check":
				x = Integer.parseInt(tokens.nextToken());
				x = (sub & (1<<x))==0? 0:1;
				out.write(x + "\n");
				break;
			case "toggle":
				x = Integer.parseInt(tokens.nextToken());
				sub ^= (1<<x);
				break;
			case "all":
				sub = (1<<21)-1;
				break;
			case "empty":
				sub=0;
			}
		}
		in.close();
		out.close();
	}

}

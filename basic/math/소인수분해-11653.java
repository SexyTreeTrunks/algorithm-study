import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean isprimes[] = new boolean[10000000];
		isprimes[0] = isprimes[1] = true;
		int num = Integer.parseInt(in.readLine());		
		for(int i = 2; i*i<=num; i++)
			for(int j =2; i*j<=num; j++)
				isprimes[i*j] = true;
		int i = 2;
		while(num!=1) {
			while(num%i == 0) {
				System.out.println(i);
				num = num/ i;
			}
			for(i=i+1;isprimes[i];i++);
		}
		in.close();
	}

}

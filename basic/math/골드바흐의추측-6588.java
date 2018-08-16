import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean primes[] = new boolean[1000001];
		primes[0] = primes[1] = true;
		String str;
		int p,q;
		
		for(int i = 2; i*i<=1000000; i++)
			for(int j =2; i*j<=1000000; j++)
				primes[i*j] = true;

		while(!(str=in.readLine()).equals("0")) {
			int num = Integer.parseInt(str);
						
			for(p=3; primes[p];p++);
			q = num -p;
			while(p<=q) {
				if(!primes[q] && (p+q == num)) {
					out.write(num + " = " + p + " + " + q);
					out.newLine();
					out.flush();
					break;
				}else {
					for(p=p+1;primes[p];p++);
					q = num -p;
				}
			}
			
			if(p>q)
				System.out.println("Goldbach's conjecture is wrong.");
		}
		in.close();
		out.close();
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int num_of_10 = n / 10;
		num_of_10 += 100;
		//num_of_2 > num_of_5 이므로 num_of_5 만 구한다
		int digit_5= 5;
		int num_of_5 = 0;
		while(digit_5 < n) {
			num_of_5 += n / digit_5;
			digit_5 *= 5;
		}
		num_of_5 -= num_of_10; // 
		System.out.println(num_of_5 + num_of_10);
		in.close();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String nums[] = str.split(" ");
		long a = Long.parseLong(nums[0] + nums[1]);
		long b = Long.parseLong(nums[2] + nums[3]);
		System.out.println(a+b);
		in.close();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str= new StringTokenizer(in.readLine()," ");
		int a_sys = Integer.parseInt(str.nextToken());
		int b_sys = Integer.parseInt(str.nextToken());
		in.readLine();
		String a_sys_nums[] = in.readLine().split(" ");
		String b_sys_nums[] = decToOther(otherToDec(a_sys_nums, a_sys), b_sys).split(" ");
		for (int i = b_sys_nums.length -1; i > 0; i--) {
			System.out.print(b_sys_nums[i] + " ");
		}
		System.out.println(b_sys_nums[0]);
		in.close();
	}
	
	static String decToOther(long d, int num_sys) {
		StringBuilder str = new StringBuilder();
		while(d != 0) {
			int i = (int)(d % num_sys);
			str.append(i + " ");
			d = d/num_sys;
		}
		return str.toString();
	}
	
	static long otherToDec(String nums[], int n_sys) {
		long num = 0;
		long digit = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			int n = Integer.parseInt(nums[i]);
			num += n * digit;
			digit *= n_sys;
		}
		return num;
	}
}

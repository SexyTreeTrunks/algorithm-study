import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long weight[] = new long[21];
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		initWeight();
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];
		StringTokenizer tokens = new StringTokenizer(in.readLine());
		int prob_num = Integer.parseInt(tokens.nextToken());
		if (prob_num == 1) {
			int perm_num = Integer.parseInt(tokens.nextToken());
			arr = getPermOfNum(perm_num);
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[arr.length - 1]);
		} else {
			for (int i = 0; i < arr.length; i++)
				arr[i] = i + 1;
			System.out.println(getNumOfPerm(arr));
		}

		in.close();
		out.close();
	}

	private static int getNumOfPerm(int[] arr) {
		
	}

	private static int[] getPermOfNum(int perm_num) {
		
	}
	
	private static void initWeight() {
		weight[1] = 1;
		for (int i = 2; i < weight.length; i++) {
			weight[i] = i*weight[i-1];
		}
		System.out.println(Arrays.toString(weight));
	}
}

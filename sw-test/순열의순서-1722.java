import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static long weight[] = new long[21];
	static boolean bitmask[] = new boolean[21];

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		initWeight();
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];
		StringTokenizer tokens = new StringTokenizer(in.readLine());
		int prob_num = Integer.parseInt(tokens.nextToken());
		if (prob_num == 1) {
			long perm_num = Long.parseLong(tokens.nextToken());
			getPermOfNum(perm_num, arr);
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[arr.length - 1]);
		} else {
			for (int i = 0; i < arr.length; i++)
				arr[i] = Integer.parseInt(tokens.nextToken());
			System.out.println(getNumOfPerm(arr));
		}

		in.close();
		out.close();
	}

	private static long getNumOfPerm(int[] arr) {
		long num = 0;
		for (int i = 0; i < arr.length; i++) {
			int value = 0;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] > arr[j])
					value++;
			num += value * weight[(arr.length - 1) - i];
		}
		return num + 1;
	}

	private static void getPermOfNum(long perm_num, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr.length; j++) {
				if(bitmask[j]==true)
					continue;
				if(weight[arr.length -1 - i] < perm_num)
					perm_num -= weight[arr.length -1 - i];
				else {
					arr[i] = j;
					bitmask[j] = true;
					break;
				}
			}
		}
	}

	private static void initWeight() {
		weight[0] = weight[1] = 1;
		for (int i = 2; i < weight.length; i++) {
			weight[i] = i * weight[i - 1];
		}
	}
}

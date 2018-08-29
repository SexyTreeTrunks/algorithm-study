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
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];

		StringTokenizer tokens = new StringTokenizer(in.readLine());
		for (int i = 0; i < num; i++)
			arr[i] = Integer.parseInt(tokens.nextToken());

		if (nextPermutation(arr)) {
			for (int i = 0; i < arr.length - 1; i++)
				System.out.print(arr[i] + " ");
			System.out.println(arr[arr.length - 1]);
		} else
			System.out.println(-1);

		in.close();
		out.close();
	}

	private static boolean nextPermutation(int arr[]) {
		// 1
		int i = arr.length - 1;
		while (i > 0 && arr[i] < arr[i - 1])
			i--;
		if (i == 0)
			return false;
		// 2
		int j = arr.length - 1;
		while (arr[i - 1] >= arr[j])
			j--;
		// 3
		int tmp = arr[i - 1];
		arr[i - 1] = arr[j];
		arr[j] = tmp;
		// 4
		j = arr.length - 1; //변수 재사용
		while (i < j) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
		return true;
	}

}

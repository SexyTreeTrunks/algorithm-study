import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int w[][] = new int[n][n];
		int d[] = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = i;
			StringTokenizer tokens = new StringTokenizer(in.readLine());
			for (int j = 0; j < n; j++)
				w[i][j] = Integer.parseInt(tokens.nextToken());
		}
		int min = Integer.MAX_VALUE;
		do {
			boolean isPossible = true;
			int sum = 0;
			for (int i = 0; i < (n - 1); i++)
				if (w[d[i]][d[i + 1]] == 0)
					isPossible = false;
				else
					sum += w[d[i]][d[i + 1]];
			if (isPossible && w[d[n - 1]][d[0]] != 0) {
				sum += w[d[n - 1]][d[0]];
				if (sum < min)
					min = sum;				
			}
		} while (nextPermutation(d, 1, n - 1));

		System.out.println(min);
		in.close();
	}

	private static boolean nextPermutation(int arr[], int begin, int end) {
		// 1
		int i = end;
		while (i > begin && arr[i] < arr[i - 1])
			i--;
		if (i == begin)
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
		j = arr.length - 1; // 변수 재사용
		while (i < j) { // 굳이 mid값을 찾을 필요 없고 i>=j 일경우 중앙값까지 순회가 끝났다는걸 명심
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
		return true;
	}

}

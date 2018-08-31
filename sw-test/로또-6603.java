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
		while (true) {
			StringTokenizer tokens = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(tokens.nextToken());
			if (n == 0)
				break;
			int lottos[] = new int[n];
			int isChosen[] = new int[n];
			for (int i =0; i < n;i++)
				lottos[i] = Integer.parseInt(tokens.nextToken());
			
			for(int i = n - 1; i >= 6; i--)
				isChosen[i] = 1;
			do {
				for (int i = 0; i < lottos.length; i++)
					if(isChosen[i] == 0)
						System.out.print(lottos[i] + " ");
				System.out.println();
			} while (nextPermutation(isChosen));
			System.out.println();
		}
		in.close();
	}

	private static boolean nextPermutation(int arr[]) {
		int i = arr.length - 1;
		while (i > 0 && arr[i] <= arr[i - 1]) // 중복값을 처리할수 있도록 조건문 변경
			i--;
		if (i == 0)
			return false;
		int j = arr.length - 1;
		while (arr[i - 1] >= arr[j]) // 중복값을 처리할수 있도록 조건문 변경
			j--;
		int tmp = arr[i - 1];
		arr[i - 1] = arr[j];
		arr[j] = tmp;
		j = arr.length - 1; 
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

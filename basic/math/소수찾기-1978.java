import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int primes[] = new int[500];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		primes[0] = 2;
		int count = 0, max_num = 0;
		in.readLine();
		StringTokenizer tokens = new StringTokenizer(in.readLine());
		int nums[] = new int[100];
		for(int i =0;tokens.hasMoreTokens();i++) {
			nums[i] = Integer.parseInt(tokens.nextToken());
			if(nums[i] > max_num)
				max_num = nums[i];
		}
		// 입력받은 수가 prime인지 확인하려면 우선 그전까지의 소수가 무엇인지 알아야함
		for(int i =2; i<=max_num; i++) {
			setPrime(i);
		}

		for(int i =0; i<nums.length; i++) {
			int n = nums[i];
			if(n < 2)
				continue;
			if(isPrime(n))
				count++;
		}
		System.out.println(count);
		in.close();
	}
	
	//prime값 안에 2,3,5,7 이런식으로 판별한다는 가정하에 돌아가는거. 만약 491같은 숫자가 첫번째 인풋으로 들어오게되면 491이 prime으로 되는거
	static void setPrime(int n) { // 2,3,4,5,6,7,
		int i =0;
		while(primes[i]!=0) {
			if(n % primes[i] == 0)
				return;
			i++;
		}
		primes[i] = n;
	}
	
	static boolean isPrime(int n) {
		for(int i =0; primes[i]!=0; i++)
			if(n==primes[i])
				return true;
		return false;
	}
}

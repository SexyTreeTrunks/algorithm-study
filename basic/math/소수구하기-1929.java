import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int primes[] = new int[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(in.readLine());
		int min = Integer.parseInt(tokens.nextToken());
		int max = Integer.parseInt(tokens.nextToken());
		/*
		 일단 어떤수가 소수인지 아닌지 판별하기위해 2~어떤수의 전까지의 나머지값을 확인해야했다
		이전 문제에서 짠 알고리즘에서는 그냥 primes에 소수인것만 넣었었는데 
		그것보다 primes에 1부터 max값까지 소수인지아닌지 여부만 판단한 값을 넣으면
		나중에 주어진 값이 PRIME인지 판단할때  O(1)시간 안에 값을 얻을수있음
		소수여부를 판단하는건 에라스토테네스의 체를 이용하면됨
		에라스토테네스의 체에서 2의 배수, 3의배수, 5의배수,,,를 제거하는 식으로 소수여부를 판별하였음. 
		이런식으로 max전까지의 소수의 배수를 제거하고 남은 수(prime)를 출력하면됨
		또한 소수의 배수를 제거할때 MAX전까지 판단할 필요가 없음. MAX의 제곱근까지 배수를 제거하면됨
		예를들어 MAX가 120일때 11^2 > 120 임. 따라서 11의 배수(이전에 11x2,11x3,11x4,,,값은 2,3,4,,의 배수를 판단하면서 이미 지워짐)를 지울필요가없음
		2,3,5,7의 배수만 지워도 충분함
		*/
		primes[1] = 1; // 아래 for문에선 숫자1이 소수인지 아닌지 판별할수 없기때문에 이렇게 넣어줘야함
		for(int i =2; i*i<=max; i++) {//max=50
			for(int j=2; i*j<=max; j++) {//
				primes[i*j] = 1;
			}
		}
		
		for(int i = min; i<=max; i++) {
			if(primes[i]==0)
				System.out.println(i);
		}
		in.close();
	}

}

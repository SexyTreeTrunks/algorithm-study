import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	final static int MAX = 10001;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[MAX];
		int num = Integer.parseInt(in.readLine());
		int max= 0;
		while(num-->0) {
			int n = Integer.parseInt(in.readLine());
			arr[n]++;
			if(n > max)
				max = n;
		}
		
		for(int i =0; i<=max; i++)
			if(arr[i]!=0)
				while(arr[i]-- >0)
					out.write(Integer.toString(i)+"\n");
				
		//버퍼를 flush하는 작업은 시간을 많이 잡아먹으므로 안쓰는게 좋음
		//이클립스 창에서는 버퍼를 flush하지 않으면 출력이 뜨지않으므로 테스트 출력용으로만 사용하는게 좋음		
		in.close();
		out.close();//bufferedwriter는 close를 해야 출력이됨.안그러면 close전까지 계속 대기함
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		String input[] = in.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);;
		for(int i =0; i< n; i++)
			q.offer(i+1);
		System.out.print("<");
		while(q.size()>1) {
			for(int i=0; i<m-1;i++)
				q.offer(q.poll());
			System.out.print(q.poll() + ", ");
		}
		System.out.print(q.poll());
		System.out.println(">");
		in.close();
	}
}

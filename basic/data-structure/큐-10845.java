import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<Integer>();
		int num = Integer.parseInt(in.readLine());
		int last_e = 0;
		while(num-- > 0) {
			String command = in.readLine();
			if(command.equals("pop"))
				System.out.println(q.isEmpty()? -1:q.poll());
			else if(command.equals("front"))
				System.out.println(q.isEmpty()? -1:q.element());
			else if(command.equals("back"))
				System.out.println(q.isEmpty()? -1:last_e);
			else if(command.equals("size"))
				System.out.println(q.size());
			else if(command.equals("empty"))
				System.out.println(q.isEmpty()? 1:0);
			else {
				last_e = Integer.parseInt(command.substring(5));
				q.offer(last_e);
			}
		}
		in.close();
	}
}

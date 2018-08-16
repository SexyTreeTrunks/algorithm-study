import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		Deque<Integer> d = new LinkedList<Integer>();
		while (num-- > 0) {
			String command = in.readLine();
			switch (command) {
			case "front":
				System.out.println(d.isEmpty() ? -1 : d.peekFirst());
				break;
			case "back":
				System.out.println(d.isEmpty() ? -1 : d.getLast());
				break;
			case "size":
				System.out.println(d.size());
				break;
			case "empty":
				System.out.println(d.isEmpty() ? 1 : 0);
				break;
			default:
				if (command.charAt(1) == 'u')
					if (command.charAt(5) == 'f')
						d.addFirst(Integer.parseInt(command.substring(11)));// push front
					else
						d.addLast(Integer.parseInt(command.substring(10)));// push back
				else {
					if (d.isEmpty())
						System.out.println(-1);
					else {
						if (command.charAt(4) == 'f')
							System.out.println(d.remove());// pop front
						else
							System.out.println(d.removeLast());
					}
				}
			}
		}
		in.close();
	}
}
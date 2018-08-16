import java.util.Scanner;

public class Main {
	final static int STACK_MAX = 50000;
	static int stack[] = new int[STACK_MAX];
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String command = sc.nextLine();
		boolean isOpen = true;
		int sum_of_slice = 0;
		for (int i = 0; i < command.length(); i++) {
			char token = command.charAt(i);
			if (token == ')') {
				if (isOpen) {
					pop();// pop out ( of raser
					addRaser();
				} else
					sum_of_slice += (pop() + 1); //* size();
				isOpen = false;
			} else {
				push(0);
				isOpen = true;
			}
			
		}
		System.out.println(sum_of_slice);
		sc.close();
	}

	static void push(int x) {
		if (top < STACK_MAX)
			stack[++top] = x;
	}

	static int pop() {
		if (empty())
			return -1;
		else
			return stack[top--];
	}

	static int size() {
		return top + 1;
	}

	static boolean empty() {
		if (top < 0)
			return true;
		else
			return false;
	}

	static int top() {
		if (empty())
			return -1;
		return stack[top];
	}

	static void addRaser() {
		for (int i = 0; i <= top; i++) {
			stack[i]++;
		}
	}
}

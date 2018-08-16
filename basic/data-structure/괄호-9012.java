import java.util.Scanner;

public class Main {
	final static int STACK_MAX = 50;
	static int stack[]= new int[STACK_MAX];
	static int top = -1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int command_num = Integer.parseInt(sc.nextLine());
		while(command_num-- > 0) {
			String command = sc.nextLine();
			for(int i =0; i <command.length();i++) {
				char token = command.charAt(i);
				if(token == '(') {
					push(1);
				}else {
					if(pop() < 0) {
						push(1);
						break;
					}
				}
			}
			if(empty())
				System.out.println("YES");
			else
				System.out.println("NO");
			top = -1;
		}

		sc.close();
	}
	
	static void push(int x) {
		if(top < STACK_MAX)
			stack[++top] = x;
	}
	
	static int pop() {
		if(empty())
			return -1;
		else
			return stack[top--];
	}
	
	static int size() {
		return top+1;
	}
	
	static boolean empty() {
		if(top <0)
			return true;
		else
			return false;
	}
	
	static int top() {
		if(empty())
			return -1;
		return stack[top];
	}
}

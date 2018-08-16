import java.util.Scanner;

public class Main {
	static int stack[];
	static int top = -1;
	static int stack_max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int command_num = Integer.parseInt(sc.nextLine());
		stack_max = command_num;
		stack = new int[stack_max];
		while(command_num-- > 0) {
			String command = sc.nextLine();
			switch(command) {
			case "pop":
				System.out.println(pop()); break;
			case "top":
				System.out.println(top()); break;
			case "size":
				System.out.println(size()); break;
			case "empty":
				System.out.println(empty()); break;
			default:
				int x = Integer.parseInt(command.split(" ")[1]);
				push(x); break;
			}
		}
		sc.close();
	}
	
	static void push(int x) {
		if(top < stack_max)
			stack[++top] = x;
	}
	
	static int pop() {
		if(empty()==1)
			return -1;
		else
			return stack[top--];
	}
	
	static int size() {
		return top+1;
	}
	
	static int empty() {
		if(top <0)
			return 1;
		else
			return 0;
	}
	
	static int top() {
		if(empty()==1)
			return -1;
		return stack[top];
	}
}

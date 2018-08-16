#include<stdio.h>


#define STACK_MAX 600000

class Stack {
public:
	char data[600000];
	int stack_top;
	Stack() {
		stack_top = -1;
	}
	void push(char);
	bool empty();
	char pop();
};

void Stack::push(char x) {
	if(x=='\0') return;
	if (stack_top < STACK_MAX)
		data[++stack_top] = x;
}

bool Stack::empty() {
	if (stack_top < 0)
		return true;
	else
		return false;
}

char Stack::pop() {
	if (empty())
		return '\0';
	else
		return data[stack_top--];
}

int main() {
	Stack L_stack = Stack();
	Stack R_stack = Stack();
	char tmp;
	while((tmp=getchar())!='\n') {
		L_stack.push(tmp);
	}
	int i;
	scanf("%d",&i);
	getchar();
	while(i--) {
		char command;
		command = getchar();
		switch(command) {
		case 'L':
			R_stack.push(L_stack.pop());
			break;
		case 'D':
			L_stack.push(R_stack.pop());
			break;
		case 'B':
			L_stack.pop();
			break;
		case 'P':
			char x;
			getchar();
			x = getchar();
			L_stack.push(x);
			break;
		}
		getchar();
	}
	for(i=0; i<=L_stack.stack_top; i++)
		printf("%c",L_stack.data[i]);
	for(i=R_stack.stack_top; i>=0; i--)
		printf("%c",R_stack.data[i]);
	printf("\n");
	return 0;
}

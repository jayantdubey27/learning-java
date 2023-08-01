package oop_concept;
import java.util.Scanner;


public class Stacksss {
	
	int top = -1;
	int stack[] = new int[10];
	Scanner sc = new Scanner(System.in);

	public void stackss() {
		
		int n = sc.nextInt();
		
		for(int i=0;;) {
			System.out.println("please provide your input");
			System.out.println("\n\n\n\npress 1 for push \npress 2 for pop \npress 3 to print stack\npress 4 to exit");
			
			int operation = sc.nextInt();
			if (operation == 1) {
				push();
			}
			else if(operation == 2) {
				pop();
			}
			else if (operation == 3) {
				printStack();
			}
			else if(operation == 4) {
				break;
			}
			else {
				System.out.println("choose valid option");
			}
					
			
		}
			
	}
	
	public void push() {
		System.out.print("enter a number to push in stack: ");
		int push = sc.nextInt();
		
		top = top+1;
		
		stack[top] = push;
	}
	
	public void pop() {
		
		if(top == -1) {
			System.out.println("stack is empty");
		}
		else {
			int pop = stack[top];
			top = top - 1;
			System.out.println("popped element is: "+pop);
		}
		
	}
	
	public void printStack() {
		System.out.println("printing all the element present in stack");
		if(top == -1) {
			System.out.println("stack is empty");
		}
		else {
			for (int i=0;i<=top;i++) {
				System.out.print(stack[i] + " ");
			}
		}
	}
}

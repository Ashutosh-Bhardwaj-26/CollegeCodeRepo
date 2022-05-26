package stack;

import java.util.*;

public class TwoStack {
	
	int arr[];
	int cap;
	int top1,top2;
	

	public TwoStack(int n) {
		super();
		this.arr = new int[n];
		this.cap = n;
		this.top1 = -1;
		this.top2 = cap;
	}
	
	void push1(int x) {
		if(top1<top2-1) {
			top1++;
			arr[top1] = x;
		}
	}
	
	void push2(int x) {
		if(top1<top2-1) {
			top2--;
			arr[top2] = x;
		}
	}
	
	int pop1() {
		if(top1>=0) {
			int x = arr[top1];
			top1--;
			return x;
		}
		else {
			return Integer.MAX_VALUE;
		}
		
	}
	
	int pop2(){
		if(top2<cap) {
			int x = arr[top2];
			top2++;
			return x;
		}
		else {
			return Integer.MAX_VALUE;
		}
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Enter the capacity of stack");
		int n = sc.nextInt();
		TwoStack t = new TwoStack(n);
		System.out.println("Enter element to be stored in stack");
		int x = sc.nextInt();
		t.push1(x);
		x = sc.nextInt();
		t.push2(x);
		System.out.println(t.pop1());

	}

}

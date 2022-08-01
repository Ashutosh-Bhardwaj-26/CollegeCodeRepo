package stack;

import java.util.*;

public class Minimum {
	/* two methods
	 * 1.
	 * maintain an auxiliary stack of min and push in both stack if element is min. auxiliary space O(n);
	 * 2.
	 * min variable taht hold min value and push 2*x - min in stack ......while poping if -ve found then 
	 * set min to 2*min - that -ve elemnt
	 */
	static ArrayDeque<Integer> s = new ArrayDeque<>();
	static int min;

	void push(int x) {
		if(s.isEmpty()) {
			s.push(x);
			min = x;
		}
		else if(x<=min){
			s.push(2*x-min);
			min =x;	
		}else {
			s.push(x);
		}
	}
	
	int pop() {
		int  t = s.pop();
		if(t<=min){
			int res = min;
			min = 2*min-t;
			return res;	
		}else {
			return t;
		}
	}
	
	int getMin() {
		return min;
	}
		

	public static void main(String[] args) {
		
		
		
		

	}

}

package stack;
import java.util.*;

public class StockSpan {
	//hm kr rhe h pop jbtk bs stack m pde index pr smaller element h current se
	//phir stack ya to khali hoga ya usme greater element ka index hoga
	//khali ke case m index current +1 and greater ke case m i - greater ka index
	
	static ArrayDeque<Integer> st = new ArrayDeque<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Stock Span Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//push the index of the first element 
		//and print 1 as the span of first element is one
		st.push(0);
		System.out.println("1");
		
		//for all other elements 
		for(int i =1;i<n;i++) {
			//is stack is not empty and the element in stack is smaller and
			//equal to array element then pop
			while(st.isEmpty()==false && arr[st.peek()]<=arr[i]) {
				st.pop();
			}
			//index of current element - index of closest greater element  on left
			//if not then index + 1
			int span = st.isEmpty()?i+1:i-st.peek();
			System.out.println(span);
			st.push(i);
		}
	}

}

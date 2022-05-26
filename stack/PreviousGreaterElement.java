package stack;

import java.util.*;

public class PreviousGreaterElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Previous Greater Element");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayDeque<Integer> s = new ArrayDeque<>();
		System.out.println(-1);
		s.push(arr[0]);
		
		for(int i =1;i<n;i++) {
			while(s.isEmpty()==false && s.peek()<=arr[i]) {
				s.pop();
			}
			System.out.println(s.isEmpty()?-1:s.peek());
			s.push(arr[i]);
		}
	}

}

package heap;

import java.util.*;

public class PriorityQeuue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println("Enter total element of pq");
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		System.out.println(pq);
		
	}
}

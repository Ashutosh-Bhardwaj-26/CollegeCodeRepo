package deque;

import java.util.*;

public class DequeSimple {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		d.offerFirst(10);
		d.offerLast(20);
		d.offerFirst(30);
		System.out.println(d); // it represent only deque
//		System.out.println(d.pop());
//		System.out.println(d.pollLast());
		
		//to access each and every element 
		for(int x :d) {
			System.out.print(x + " ");	
		}
		System.out.println();
		Iterator it = d.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//traverse in reverse
		Iterator itr = d.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}

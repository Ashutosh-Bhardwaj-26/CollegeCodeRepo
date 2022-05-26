package queue;
import java.util.*;

public class QueueSimple {

	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		q.offer(30);
		q.offer(10);
		q.offer(20);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		
		q.remove();
		System.out.println(q);

	}

}

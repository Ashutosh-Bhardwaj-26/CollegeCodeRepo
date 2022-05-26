package sorting;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		
		Bubble b = new Bubble();
		Selection s = new Selection();
		Counting c = new Counting();
		Quick q = new Quick();
		Merge m = new Merge();
		Radix r = new Radix();
		Heap h = new Heap();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t --------Sorting Algorithms --------");
		System.out.println("Enter the number of elemnt in the array:-");
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter " + n + " elements");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\t\t Bubble Sort");
		b.bubble(arr);
		
		System.out.println("\n\t\t Selection Sort");
		s.selection(arr);
		
		System.out.println("\n\t\t Countng Sort");
		c.count(arr);
		
		System.out.println("\n\t\t Redix Sort");
		r.radix(arr);
		
		System.out.println("\n\t\t Quick Sort");
		q.quick(arr);
		
		System.out.println("\n\t\t Heap Sort");
		h.heap(arr);
	
		System.out.println("\n\t\t Merge Sort");
		m.mergeData(arr);
	}

}

package heap;
import java.util.*;

public class HeapDS{

	static int[] arr;
	static int[] arr2;

	
	static void printHeap() {
		for(int i =0;i<arr.length;i++) {
			System.out.println("Root:-");
			while(Math.floor((i+1)/2)<arr.length) {
				int root = (int) Math.floor((i+1)/2);
				System.out.println(arr[root] + " ");
			}
			System.out.println("Left:-");
			while((2*i)+1<arr.length) {
				int left = (2*i)+1;
				System.out.println(arr[left] + " ");
			}
			System.out.println("Right:-");
			while((2*i)+2<arr.length) {
				int right = (2*i)+1;
				System.out.println(arr[right] + " ");
			}
		}
	}
	
	static void printHeapArray() {
		System.out.println("MIN");
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("MAX");
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr2[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t HEAP DATA STRUCTURE");
		System.out.println("Enter the capacity of array");
		int capacity = sc.nextInt();
		MinHeap mih = new MinHeap(capacity);
		MaxHeap mah = new MaxHeap(capacity);
		
		System.out.println("Enter the elements of heap:- \n");
		for(int i = 0;i<capacity;i++) {
			int k = sc.nextInt();
			arr = mih.insert(k);
			arr2 = mah.insert(k);
		}
		
		printHeapArray();
		
		
		
	}

}

package heap;

import sorting.Swap;

public class Heapify {
	Swap s = new Swap();
	void heap(int[] a){
		System.out.println("Complexity:- O(nlogn)");
		int n = a.length;
		for(int i =n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		s.print(a);
		
	}
	//complexity of heapify is O(logn) called n times
	void heapify(int[] a,int n,int i){
		int largest = i;
		int l = 2*i +1;
		int r = 2*i +2;
		
		if(l<n && a[l]>a[largest]) {
			largest = l;
		}
		
		if(r<n && a[r]>a[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			s.swap(a,i,largest);
			heapify(a,n,largest);
		}
		
	}
}

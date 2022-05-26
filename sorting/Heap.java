package sorting;

public class Heap extends Swap {
	
	void heap(int[] a){
		System.out.println("Complexity:- O(nlogn)");
		int n = a.length;
		for(int i =n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
	   for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            swap(a,0,i);
            // call max heapify on the reduced heap
            heapify(a, i, 0);
        }
	   
		print(a);
		
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
			swap(a,i,largest);
			heapify(a,n,largest);
		}
		
	}
}

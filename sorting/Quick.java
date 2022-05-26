package sorting;


public class Quick extends Swap {

	
	void quick(int[] a) {
		quickSort(a,0,a.length-1);
		System.out.println("Complexity:-best case O(nlogn)");
		print(a);
		// Arrays.sort(a); nlogn (dual pivot quicksort)	
	}
	 
	
	void quickSort(int a[],int lb, int ub) {
		if(lb<ub) {
			int pi = partition(a, lb, ub);
			quickSort(a, lb, pi-1);
			quickSort(a, pi+1, ub);
		}
		
	}
	
	
	// 4 3 2 1
	
	protected int partition(int a[],int lb,int ub) {
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		while(start<end) {
			while(a[start]<=pivot) {
				start++;
			}
			while(a[end]>pivot) {
				end--;
			}
			if(start<=end) {
				swap(a,start,end);
			}
		}
		swap(a,lb,end);
		
		return end;
	}
	
}
	

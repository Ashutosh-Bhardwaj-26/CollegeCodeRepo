package sorting;

public class Selection extends Swap {
	//auxiliary space =1
	// useful when memory write is a costly operation. 
	//
	void selection(int[] arr) {
		int n = arr.length;
		for(int i =0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr,min,i);
		}
		System.out.println("Complexity:- O(n^2)");
		print(arr);
	}
}


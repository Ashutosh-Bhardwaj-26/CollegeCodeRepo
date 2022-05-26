package searching;
import java.math.*;

public class Exponential {

	//only works on sorted and unbounded list of elements
	//Better then binary search
	
	Binary b = new Binary();
	void expo(int[] arr,int k) {
		if(arr[0] == k) {
			System.out.println("Element found at:- 0");
			System.out.println("Complexity:- O(log[n])");
		}else {
			int i =1;
			
			while(i<arr.length-1 && arr[i]<=k) {
				i = i*2;
			}
			b.binaryI(arr, k, i/2, Math.min(i,arr.length-2));
		}
		
	}
}

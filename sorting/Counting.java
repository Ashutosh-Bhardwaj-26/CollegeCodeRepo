package sorting;

import java.util.Arrays;

public class Counting extends Swap  {

	void count(int a[]) {
		// 2 2 1 0
		System.out.println("Complexity:- O(n+k)");
		int k =0;
		for(int i =0;i<a.length;i++) {
			k = Math.max(k, a[i]);
		}
		int[] b =new int[k+1];
		int[] out = new int[a.length+1];
		Arrays.fill(b, 0);
//		for (int i = 0; i < k; ++i) {
//		      b[i] = 0;
//		    }
		// 0 0 0 0
		for(int i =0;i<a.length;i++) {
			++b[a[i]];
		}
		// 1 1 2
		for(int i =1;i<=k;i++) {
			b[i] = b[i]+b[i-1];
		}
		// 1 2 4
		for(int i =a.length-1;i>=0;i--) {
			out[b[a[i]]-1] = a[i];
			b[a[i]]--;
		}
		//0 1 2 2
		for(int i = 0;i<a.length;i++) {
			a[i] = out[i];
		}
		print(a);
	}
	
}

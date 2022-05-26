package sorting;

import java.util.Arrays;

public class Radix extends Swap {
	//if k = n^2 in counting sort then it will be O(n^2)
	//thats why we use radix sort.....
	//moreover for max = 123123 it will require array of max size(waste)

	void radix(int[] a) {
		System.out.println("Complexity:- O(d*(n+b))");//where b = 10 for all case
														//d is number of digits
		int max =0;
		for(int i =0;i<a.length;i++) {
			max = Math.max(max, a[i]);
		}
		
		for(int pos=1;max/pos>0;pos = pos*10) {
			countSort(a,pos);
		}
		print(a);
	}
	
	void countSort(int[] a,int pos) {
		int[] b = new int[10];
		int[] out = new int[a.length];
		Arrays.fill(b, 0);
		for(int i =0;i<a.length;i++) {
			b[((a[i]/pos)%10)]++;
		}
		
		for(int i=1;i<b.length;i++) {
			b[i]=b[i]+b[i-1];
		}
		
		for(int i=a.length-1;i>=0;i--) {
			out[b[((a[i]/pos)%10)]-1] = a[i];
			b[((a[i]/pos)%10)]--;
		}
		for(int i = 0;i<a.length;i++) {
			a[i] = out[i];
		}
	}
	
}

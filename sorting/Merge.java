package sorting;

public class Merge extends Swap {
	
	void mergeData(int[] a) {
		System.out.println("Complexity:- O(nlogn)");
		mergeSort(a,0,a.length-1);
		print(a);
		
	}
	
	void mergeSort(int[] a,int l,int r) {
		if(l<r) {
			int mid = l+((r-l)/2);
			
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			
			merge(a,l,mid,r);
		}	
	}
	
	void merge(int[] a,int l,int mid,int r) {
		int i = l;
		int j = mid+1;
		int k = l;
		int[] b = new int[r+1];
		
		while(i<=mid && j<=r) {
			if(a[i]<=a[j]) {
				b[k] = a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;
				//count += mid+1-i; //count inversion
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k] = a[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid) {
				b[k] = a[i];
				i++;
				k++;
			}
		}	
		for(k=l;k<=r;k++) {
			a[k] = b[k];
		}
		
	}
}

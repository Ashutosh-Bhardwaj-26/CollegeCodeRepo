package sorting;

public class Swap {
	
	public int[] swap(int[] arr,int i,int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	public void print(int[] arr) {
		System.out.println("Sorted array is:- ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

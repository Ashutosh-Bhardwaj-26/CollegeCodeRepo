package greedy;

import java.util.*;

public class FractionalKnapsack {
	
	static class Item implements Comparable<Item>{
		int wt;
		int val;
		public Item(int wt, int val) {
			this.wt = wt;
			this.val = val;
		}
		
		public int compareTo(Item i) {
			return wt*(i.val) - (val)*(i.wt);
		}
	}
	
	static double fracknap(Item arr[], int w) {
		Arrays.sort(arr);
		double res = 0.0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i].wt<=w) {
				res = res + arr[i].val;
				w = w - arr[i].wt;
			}
			else {
				res = res + arr[i].val*((double)w/(double)arr[i].val);
				break;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of array size");
		int n = sc.nextInt();
		Item arr[] = new Item[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = new Item(sc.nextInt(),sc.nextInt());
		}
		
		int w = sc.nextInt();
	
		System.out.println(fracknap(arr,w));		

	}

}

package sorting;

import searching.*;

public class Bubble extends Swap {
	//stable
	//auxiliary space 1
	void bubble(int[] arr) {
		System.out.println("Complexity:- O(n^2)");
		int n = arr.length;
		int k = 0;

		for (int i = 0; i < n - 1; i++) {
			boolean p = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr = swap(arr, j, j + 1);
					p = true;
					k++;
				}
			}
			if (p == false) {
				System.out.println("no. of swapping done " + k);
				break;
			}
		}
		print(arr);
	}
}

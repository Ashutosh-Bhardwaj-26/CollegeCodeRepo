package searching;

public class Linear {
	void linearU(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				System.out.println("No element in array");
				break;
			}
			if (arr[i] == k) {
				System.out.println("Found at index:-" + i);
				break;
			} else if (i == arr.length - 1) {
				System.out.println("Not found");
			}
		}
		System.out.println("Complexity:- O(n)");
	}

	void linearS(int arr[], int k) {
		for (int i = 0; i < arr.length; i++) { 
			if (arr.length == 0) {
				System.out.println("No element in array");
				break;
			}
			if (k == arr[i]) {
				System.out.println("Element found at:- " + i);
				System.out.println("Complexity:- O(n)");
				break;
			} else if (k < arr[i]) {
				System.out.println("Element not found");
			}
		}
	}

}

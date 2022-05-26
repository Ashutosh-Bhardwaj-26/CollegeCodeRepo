package searching;

public class Binary {

	// recursive space complexity - O(log[n])
	void binaryR(int[] arr, int k, int start, int end) {
		int mid = (start + end) / 2;
		if (k > arr[end - 1]) {
			System.out.println("Not found");
		} else if (k == arr[mid]) {
			System.out.println("Element found at:-" + mid);
			System.out.println("Complexity:- R-O(log[n])");
		} else if (k > mid) {
			binaryR(arr, k, mid + 1, end);
		} else if (k < mid) {
			binaryR(arr, k, start, mid - 1);
		}
	}

	// iterative space complexity - O(1)
	void binaryI(int[] arr, int k, int start, int end) {
		int mid = (start + end) / 2;
		while (start < end) {
			mid = (start + (end)) / 2;
			if (k > arr[end - 1]) {
				System.out.println("Not found");
			} else if (k == arr[mid]) {
				System.out.println("Element found at:- " + mid);
				System.out.println("Complexity:- I-O(log[n])");
				break;
			} else if (k > mid) {
				start = mid + 1;
			} else if (k < mid) {
				end = mid - 1;
			}
		}
	}
}

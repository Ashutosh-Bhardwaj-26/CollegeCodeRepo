package searching;

import java.util.*;

public class Searching {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Linear l = new Linear();
		Binary b = new Binary();
		Exponential e = new Exponential();
		System.out.println("\b\n\t\t\t\t--------All Searching Algorithms-------");

		System.out.println("Enter the number of element:-");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter " + n + " elements of the array:-");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Is array sorted:-(yes-1/no-0)");
		int p = sc.nextInt();
		System.out.println("Enter the element to search:-");
		int k = sc.nextInt();

		// linear serach
		System.out.println("\t\t\t\t Linear Search");
		if (p == 1) {
			l.linearS(arr, k);
		} else {
			l.linearU(arr, k);
		}
		// binary search
		System.out.println("\t\t\t\t Binary Search");
		b.binaryI(arr, k, 0, arr.length - 1);
		b.binaryR(arr, k, 0, arr.length - 1);
		
		System.out.println("\t\t\t\t Exponential Search");
		e.expo(arr, k);

		sc.close();
	}

}

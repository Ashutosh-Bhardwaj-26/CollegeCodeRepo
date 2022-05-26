package disjointDS;

import java.util.*;

public class Disjoint {
	static int parent[];
	static int rank[];
	
	
	
	static void makeSet(int n) {
		
		parent = new int[n];
		rank = new int[n];
		
		for(int i =0;i<n;i++) {
		 parent[i] = i;
		 rank[i] = 0;
		}
	}
	
	static int find(int node) {
		if(node == parent[node]) {
			return node;
		}
		return parent[node] =  find(parent[node]);
	}
	
	static void union(int x , int y) {
		x = find(x);
		y = find(y);
		
		if(rank[x]<rank[y]) {
			parent[x] = y;
		}
		else if(rank[x]>rank[y]) {
			parent[y] = x;
		}
		else {
			parent[x] = y;
			rank[y]++;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Disjoint Set");
		System.out.println("Enter size of total set");
		int n = sc.nextInt();
		
		makeSet(n);
		
		for(int i =0;i<n-1;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			union(x,y);
		}
			
		System.out.println("Enter the element to check");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(find(x)!=find(y)) {
			System.out.println("Not same set");
		}else {
			System.out.println("Same set");
		}
		
		System.out.println(find(x));
		System.out.println(find(y));
		
		
		
		
		
	}

}

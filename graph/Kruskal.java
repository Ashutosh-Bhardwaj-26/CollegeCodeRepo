package graph;

import java.util.*;


public class Kruskal {
	static ArrayList<Edge> adj = new ArrayList<Edge>();
	static ArrayList<Edge> adj2 = new ArrayList<Edge>();
	static int parent[];
	static int rank[];
	
	static void makeKruskal(int v){

		parent = new int[v];
		rank = new int[v];
		
		for(int i =0;i<v;i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}
	
	static class Edge implements Comparable<Edge> {
		int src;
		int nbr;
		int wt;
		Edge(int src,int nbr,int wt){
			this.nbr = nbr;
			this.src = src;
			this.wt = wt;
		}
		public int compareTo(Edge e) {
			return this.wt - e.wt;
		}
		
		public String toString() {
			return "src: " + src + " nbr: " + nbr + " wt: " + wt + "\n";
			
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

		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t Weighted Directed Graph");
		System.out.println("Enter the v and e for the graph");
		int v = sc.nextInt();
		int e = sc.nextInt();	
		
		makeKruskal(v);
		
		System.out.println("Enter src,nbr,wt");
		
		for(int i =0;i<e;i++) {
			adj.add(new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}

		System.out.println(adj);
		 
		for(int i =0;i<e;i++) {
			Collections.sort(adj);
		}
		
		mstKruskal(v);
		 
		//System.out.println(adj);

	}


	private static void mstKruskal(int v) {
		int res =0;
		for(int i =0,s=0;s<v-1;i++) {
			Edge e = adj.get(i);
			int x = find(e.src);
			int y = find(e.nbr);
			if(x!=y) {
				adj2.add(e);
				res = res+ e.wt;
				union(x,y);
				s++;
			}
		}
		System.out.println("MST wt:" + res);
		System.out.println(adj2);
		
	}
	

}

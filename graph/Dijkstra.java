package graph;

import java.util.*;

import graph.WeightedGraph.Edge;

public class Dijkstra{
	// any weighted, directed or undirected (cyclic or acyclic) graph with non-negative weights
	
	class Pair implements Comparable<Pair>{
		int v; 		// vertex
		String psf; // path so far
		int wsf;	//weight so far-
		public Pair(int v, String psf, int wsf) {
			super();
			this.v = v;
			this.psf = psf;
			this.wsf = wsf;
		}
		
		//imp
		public int compareTo(Pair o) {
			return this.wsf - o.wsf;
		}
		
	}
	//shortest path algorithm
	
	
	void apply(ArrayList<ArrayList<Edge>> adj,int src) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		pq.add(new Pair(src, src + "->",0));
		
		boolean[] vis = new boolean[adj.size()];
		
		while(pq.size()>0) {
			Pair cur = pq.remove();
			if(vis[cur.v] == true ) {
				continue;		
			}
			vis[cur.v] = true;
			System.out.println(cur.v + "via" + cur.psf+ "@" + cur.wsf);
			
			for(Edge e : adj.get(cur.v)) {
				if(vis[e.nbr] == false) {
					pq.add(new Pair(e.nbr, cur.psf + e.nbr,cur.wsf + e.wt));
				}
			}
		}
	}
	
}

package graph;

import java.util.*;
import graph.WeightedGraph.Edge;

public class Prim {
	//minimum spanning tree
	//weighted undirected graph
	public static class Pair implements Comparable<Pair>{
		int v;
		int av;
		int wt;
		Pair(int v, int av,int wt){
			this.v = v;
			this.av = av;
			this.wt = wt;
		}
		
		public int compareTo(Pair o) {
			return this.wt - o.wt;
		}
		
	}
	
	void apply(ArrayList<ArrayList<Edge>> adj) {
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(0,-1,0));
		boolean[] vis = new boolean[adj.size()];
		while(!pq.isEmpty()) {
			Pair cur = pq.remove();
			if(vis[cur.v]) {
				continue;
			}
			vis[cur.v] = true;
			if(cur.av != -1) {
				System.out.println(cur.v + " " +  cur.av + " " + cur.wt);
			}
			
			for(Edge e : adj.get(cur.v)) {
				if(vis[e.nbr] == false) {
					pq.add(new Pair(e.nbr,cur.v,e.wt));
				}
			}
		}
		
	}
}

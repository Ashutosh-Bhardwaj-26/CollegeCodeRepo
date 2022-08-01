package graph;

import java.util.*;

public class BFS extends DFS{
	//find shortest path in unweighted undiredcted cyclic graph O(v+e)
	
	public static void bfs(ArrayList<ArrayList<Integer>> adj,int source,int destination) {
		//visited array to not add the already added vertex to queue
		boolean vis[] = new boolean[adj.size()+1];
		System.out.println("BFS CALLED");
		//parent array to mark the path [0,1,2,3,4,] = [-1,4,1,0,0]
		int parent[] = new int[adj.size()];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(source);
		//mark the source as -1 so that jb reverse m trace kre to -1 pr end krde
		parent[source] = -1;
		//source ko true krde vis m taki 2 bar add na ho queue main
		vis[source] = true;
		
		//queue main dalo nikalo
		while(!	q.isEmpty()) {
			int cur = q.poll();
			if(cur == destination) break;
			for(int neighbour : adj.get(cur)) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = cur;
				}
			}
			 System.out.print(q);
		}
		//reverse m trace krna path
		int cur = destination;

		do {
			System.out.print(cur + "->");
			cur = parent[cur];
		}while(parent[cur]!=-1);
		System.out.println(source); 
	}
}

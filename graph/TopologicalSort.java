package graph;
import java.util.*;

public class TopologicalSort extends DetectCycleUndtirectDFS{
	//to find shortest path in a weighted directed acyclic graph O(v+e)
	
	static void topologiclasort(ArrayList<ArrayList<Integer>> adj ) {
		  Stack<Integer> stack = new Stack<Integer>();
		  boolean vis[] = new boolean[adj.size()];
		  
		  for (int i = 0; i < adj.size(); i++)
	            vis[i] = false;
		  
		  for (int i = 0; i < adj.size(); i++)
          if (vis[i] == false)
              topologicalsortUtil(adj, i, vis, stack);
		  
		  while(!stack.isEmpty()) {
			  System.out.println(stack.pop() + " ");
		  }
		  System.out.println("the end");
		  
	}

	private static void topologicalsortUtil(ArrayList<ArrayList<Integer>> adj, int src, boolean[] vis, Stack<Integer> stack) {
			vis[src] = true;
	        for(int neighbour : adj.get(src)) {
	        	if(vis[neighbour] == false) {
	        		//vis[neighbour] = true; ye ni krenge kuki stack m end tk jana h chahie vo vertecs phle visit ku na hogya ho
 	        		topologicalsortUtil(adj,neighbour,vis,stack);
	        	}
	        }				
		stack.push(src);
	}
	
}

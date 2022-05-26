package graph;
import java.util.*;

public class DFS extends TopologicalSort {
	public static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	public static void dFs(ArrayList<ArrayList<Integer>> adj1,int source,int destination) {
		adj = adj1;
		System.out.println("DFS CALLED");
		boolean vis[] = new boolean[adj.size()];
		vis[source] = true;
		boolean isReach = dfs(source,destination,vis);
		System.out.println(isReach);
	}
	
	public static boolean dfs(int source,int destination,boolean vis[]) {
		if(source == destination) return true;
		
		for(int neighbour : adj.get(source)) {
			if(!vis[neighbour]){
				vis[neighbour] = true;
				boolean isConnected = dfs(neighbour,destination,vis);
				if(isConnected) return true;
			}
		}
		return false;
	}
	
	public static boolean dfsStack(ArrayList<ArrayList<Integer>> adj,int source,int destination){
		boolean vis[] = new boolean[adj.size()];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		stack.push(source);
		
		while(!stack.isEmpty()) {
			System.out.println("stack " + stack);
			int cur = stack.pop();
			if(cur == destination) return true;
			
			for(int neighbour : adj.get(cur)) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}
		
		return false;
	}

}

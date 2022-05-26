package graph;

import java.util.*;

public class DetectCycleUndtirectDFS extends DetectDirectCycleDFS {
	static boolean detect(ArrayList<ArrayList<Integer>> adj) {
		boolean vis[] = new boolean[adj.size()];
		for(int i =0;i<adj.size();i++) {
			if(!vis[i]) {
				if( isCycle(adj,i,vis,-1)) {
					return true;
				}	
			}
		}
		return false;
	}

	private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int source, boolean[] vis, int parent) {
		
		vis[source] = true;
		for(int neighbour : adj.get(source)) {
			if(!vis[neighbour]) {
				return isCycle(adj,neighbour,vis,source);
			}
			else if(neighbour != parent) {
				return true;
			}
		}
		
		return false;
	}
	

}

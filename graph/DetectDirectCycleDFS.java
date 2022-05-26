package graph;

import java.util.*;

public class DetectDirectCycleDFS {
		//back edge detect kro aur cycle proof kro
		static boolean dDCD(ArrayList<ArrayList<Integer>> adj) {
			boolean vis[] = new boolean[adj.size()];
			boolean reSt[] = new boolean[adj.size()]; // recursion stack array
			
			for(int i =0;i<adj.size();i++) {
				vis[i] = reSt[i] = false;
			}
			
			for(int i =0;i<adj.size();i++){
				if(vis[i] == false) {
					if(isCycle(adj,i,vis,reSt)==true) {
						return true;
					}
				}
			}
			return false;
			
		}

		private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int source, boolean[] vis, boolean[] reSt) {
			vis[source] = true;
			reSt[source] = true;
			for(int neighbour : adj.get(source)) {
				if(vis[neighbour]==false && isCycle(adj,neighbour,vis,reSt)) {
					return true;
				}
				else if(reSt[neighbour] == true) {
					return true;
				}
			}
			reSt[source] = false;
			return false;
		}
}

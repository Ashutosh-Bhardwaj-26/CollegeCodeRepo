package graph;

import java.util.*;

public class Graph extends BFS {
	
	//what is dense vs sparc graoh
	
	//time complexity directed(O(v+e)) 
	//undirected O(v+2*e)
	
	private static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	public Graph(int v){
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
	}

	
	  public static void addEdge(int u, int v)
		 //u - source 
		 //v - destination
		{
			//adj.get(v).add(u);  //cmt this for directed graph
			adj.get(u).add(v);
		}

	  
	 static void printGraph()
	    {
	        for (int i = 0; i < adj.size(); i++) {
	            System.out.println("\nAdjacency list of vertex "
	                               + i);
	            System.out.print("head");
	            for (int j = 0; j < adj.get(i).size(); j++) {
	                System.out.print(" -> "
	                                 + adj.get(i).get(j));
	            }
	            System.out.println();
	        }
	        
	        System.out.println(adj);
	    }
	 

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the v and e for the graph");
			int v = sc.nextInt();
			int e = sc.nextInt();
			
			Graph g = new Graph(v);
			System.out.println("Enter edges");
			for(int i =0;i<e;i++) {
				addEdge(sc.nextInt(),sc.nextInt());
			}
			printGraph();  
//			bfs(adj,0,2);
//			dFs(adj,0,3);
//			System.out.println(dfsStack(adj,0,1));
//			System.out.println(adj.size());
			
//			System.out.println("is Cycle (undirected) : - " + detect(adj));
			
//			System.out.println("is Cycle (directed) : - " + dDCD(adj));
			
			System.out.println("Topological sort called");
			topologiclasort(adj);
	
			
		}


}

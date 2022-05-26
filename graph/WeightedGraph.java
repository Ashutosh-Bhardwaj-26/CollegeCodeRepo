package graph;
import java.util.*;

public class WeightedGraph {
	static ArrayList<ArrayList<Edge>> adj = new ArrayList<ArrayList<Edge>>();
	
	static class Edge{
		int src;
		int nbr;
		int wt;
		Edge(int src,int nbr,int wt){
			this.nbr = nbr;
			this.src = src;
			this.wt = wt;
		}
	}
	
	private static void addEdge(int src, int nbr, int wt) {
		
		adj.get(src).add(new Edge(src,nbr,wt));
		adj.get(nbr).add(new Edge(nbr,src,wt)); //for undirected
		
	}
	

 public static void main(String args[]) throws Exception {
	 Dijkstra d = new Dijkstra();
	 Prim p = new Prim();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("\t\t\t Weighted Directed Graph");
	 System.out.println("Enter the v and e for the graph");
	 int v = sc.nextInt();
	 int e = sc.nextInt();

	 for(int i =0;i<v;i++) {
		 adj.add(new ArrayList<Edge>());
	 }
	 
	 System.out.println("Enter src,nbr,wt");
	 for(int i =0;i<e;i++) {
		 addEdge(sc.nextInt(),sc.nextInt(),sc.nextInt());
	 }
	 
	 for(int i =0;i<v;i++) {
		 System.out.print(i + " -> ");
		 for(Edge e1 : adj.get(i)) {
			 System.out.print(e1.src + " ");
			 System.out.print(e1.nbr + " ");
			 System.out.print(e1.wt + " ");
			 System.out.print(", ");
		 }
		 System.out.println("");
	 }
	 
	// d.apply(adj, 0);
	 p.apply(adj);
	 
	 	 
 }

}

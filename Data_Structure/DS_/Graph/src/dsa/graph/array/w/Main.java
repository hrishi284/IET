package dsa.graph.array.w;

public class Main {

	public static void main(String args[]) {
	    Graph g = new Graph(7);

	    g.addEdge(27,32, 100);
	    g.addEdge(32,15, 200);
	    g.addEdge(14,27, 500);
	    g.addEdge(14,15, 50);
	    g.addEdge(15,17, 100);
	    g.addEdge(17,11, 150);
	    g.addEdge(3,14, 600);
	    g.addEdge(11,3, 400);
	    g.addEdge(15,11, 300);

	    System.out.print(g);
	    
		//g.dfs(32,32);
		//g.bfs(14,3);

		g.printShortestPathFrom(14);
	    
	  }
}

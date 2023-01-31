package dsa.graph.array;

public class Main {

	public static void main(String args[]) {
	    Graph g = new Graph(7);

	    g.addEdge(27,32);
	    g.addEdge(32,15);
	    g.addEdge(14,27);
	    g.addEdge(14,15);
	    g.addEdge(15,17);
	    g.addEdge(17,11);
	    g.addEdge(3,14);
	    g.addEdge(11,3);
	    g.addEdge(15,11);

	    System.out.print(g);
	    
		//g.dfs(14,11);
		g.bfs(14,3);

	    
	  }
}

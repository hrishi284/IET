package dsa.graph.list;

public class Graph{
	private LinkedList []adjList;
	private int numVertices;

	// Initialize the matrix
	public Graph(int numVertices) {

		this.numVertices = numVertices;
		this.adjList = new LinkedList[numVertices];

		for (int i = 0; i < this.adjList.length; i++) {
			this.adjList[i] = new LinkedList();
		}

	}

	// Add edges
	public void addEdge(int i, int j) {
		adjList[i].append(j);
		adjList[j].append(i);
	}

	// Print the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numVertices; i++) {
			s.append(i + ": ");
			s.append(adjList[i] + " ");
			s.append("\n");
		}
		return s.toString();
	}

	public static void main(String args[]) {
		Graph g = new Graph(5);

		g.addEdge(2, 3);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(0, 4);

		System.out.print(g.toString());
	}
}
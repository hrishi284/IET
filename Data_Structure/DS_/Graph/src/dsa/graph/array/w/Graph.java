package dsa.graph.array.w;

public class Graph {
	int [] vInfo;
	private int adjMatrix[][];
	private int numVertices;
	int indexCount;

	// Initialize the matrix
	public Graph(int numVertices) {
		indexCount = -1;
		vInfo = new int[numVertices];
		this.numVertices = numVertices;
		adjMatrix = new int[numVertices][numVertices];
	}

	// Add edges
	public void addEdge(int v1Value, int v2Value, int w) {

		int i = getIndexOf(v1Value);
		int j = getIndexOf(v2Value);

		adjMatrix[i][j] = w;
		//adjMatrix[j][i] = true;
	}

	private int getIndexOf(int v1Value) {

		for (int i = 0; i < vInfo.length; i++) {

			if(vInfo[i] == v1Value)
			{
				return i;
			}
		}

		indexCount++;
		vInfo[indexCount] = v1Value;
		return indexCount;
	}

	// Print the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numVertices; i++) {
			s.append(vInfo[i] + ": ");
			for (int j : adjMatrix[i]) {
				s.append(j + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}


	public void dfs(int src, int dest)
	{
		int sum = 0;
		boolean found = false;
		Stack myStack = new Stack(numVertices);
		myStack.push(getIndexOf(src));

		int [] visitedIndex = new int[numVertices];
		int prevVertex = -1;
		do
		{
			int vertexIndex = myStack.pop();

			if(prevVertex != -1)
			{
				sum += adjMatrix[prevVertex][vertexIndex];
			}
			prevVertex = vertexIndex;


			visitedIndex[vertexIndex] = 1;

			System.out.println(vInfo[vertexIndex]+ ", ");
			if(vInfo[vertexIndex] == dest)
			{
				found = true;
			}
			else
			{
				for(int i=0; i < adjMatrix[0].length; i++ )
				{
					if(adjMatrix[vertexIndex][i] != 0 &&
							visitedIndex[i] == 0)
						myStack.push(i);
				}
			}
		}while(myStack.isEmpty() == false && found == false);

		if(found == true)
			System.out.println("Found @ cost of :" + sum);
		else
			System.out.println("Not Found");

	}


	public void bfs(int src, int dest)
	{
		boolean found = false;
		Queue queue = new Queue(100);
		queue.insert(getIndexOf(src));

		int [] visitedIndex = new int[numVertices];

		do
		{
			int vertexIndex = queue.remove();

			visitedIndex[vertexIndex] = 1;

			System.out.println(vInfo[vertexIndex]+ ", ");
			if(vInfo[vertexIndex] == dest)
			{
				found = true;
			}
			else
			{
				for(int i=0; i < adjMatrix[0].length; i++ )
				{
					if(adjMatrix[vertexIndex][i] != 0 &&
							visitedIndex[i] == 0)
						queue.insert(i);
				}
			}
		}while(queue.isEmpty() == false && found == false);

		if(found == true)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

	public  void dijkstra(int[][] graph, int source) {

		int count = graph.length;
		boolean[] visitedVertex = new boolean[count];
		int[] distance = new int[count];
		for (int i = 0; i < count; i++) {
			visitedVertex[i] = false;
			distance[i] = Integer.MAX_VALUE;
		}

		// Distance of self loop is zero
		distance[source] = 0;
		for (int i = 0; i < count; i++) {

			// Update the distance between neighbouring vertex and source vertex
			int u = findMinDistance(distance, visitedVertex);
			visitedVertex[u] = true;

			// Update all the neighbouring vertex distances
			for (int v = 0; v < count; v++) {
				if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
					distance[v] = distance[u] + graph[u][v];
				}
			}
		}
		for (int i = 0; i < distance.length; i++) {
			System.out.println(String.format("Distance from %s to %s is %s", vInfo[source], vInfo[i], distance[i]));
		}
	}

	//Finding the minimum distance
	private int findMinDistance(int[] distance, boolean[] visitedVertex) {

		int minDistance = Integer.MAX_VALUE;
		int minDistanceVertex = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visitedVertex[i] && distance[i] < minDistance) {
				minDistance = distance[i];
				minDistanceVertex = i;
			}
		}
		return minDistanceVertex;
	}

	public void printShortestPathFrom(int src) {
		
		dijkstra(adjMatrix, getIndexOf(src));
	}


}
package dsa.graph.array;

public class Graph {
	int [] vInfo;
	private boolean adjMatrix[][];
	private int numVertices;
	int indexCount;

	// Initialize the matrix
	public Graph(int numVertices) {
		indexCount = -1;
		vInfo = new int[numVertices];
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}

	// Add edges
	public void addEdge(int v1Value, int v2Value) {
		
		int i = getIndexOf(v1Value);
		int j = getIndexOf(v2Value);
		
		adjMatrix[i][j] = true;
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

	// Remove edges
	public void removeEdge(int i, int j) {
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
	}

	// Print the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numVertices; i++) {
			s.append(vInfo[i] + ": ");
			for (boolean j : adjMatrix[i]) {
				s.append((j ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}
	

 public void dfs(int src, int dest)
  {
	boolean found = false;
	Stack myStack = new Stack(numVertices);
	myStack.push(getIndexOf(src));

	int [] visitedIndex = new int[numVertices];
	
	do
	{
		int vertexIndex = myStack.pop();
		
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
				if(adjMatrix[vertexIndex][i] == true &&
						visitedIndex[i] == 0)
					myStack.push(i);
			}
		}
	}while(myStack.isEmpty() == false && found == false);
	
	if(found == true)
		System.out.println("Found");
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
				if(adjMatrix[vertexIndex][i] == true &&
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




}
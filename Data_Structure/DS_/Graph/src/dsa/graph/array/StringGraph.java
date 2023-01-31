package dsa.graph.array;

public class StringGraph {
  private boolean adjMatrix[][];
  private String vertices[];
  private int numVertices;

  // Initialize the matrix
  public StringGraph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
    vertices = new String[]{"AA", "BB", "CC", "DD", "EE"};
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = true;
    adjMatrix[j][i] = true;
  }
  
//Add edges
 public void addEdge(String str1, String str2) {
   int i= getIndexOf(str1); 	 
   int j= getIndexOf(str2);
   
   if(i >= 0 || j >= 0)
   {
	   adjMatrix[i][j] = true;
	   adjMatrix[j][i] = true;   
   }
 }

  private int getIndexOf(String str1) {
	  
	  for (int i = 0; i < vertices.length; i++) {
		  if(vertices[i].equalsIgnoreCase(str1))
			  return i;
	}
	  
	return -1;
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
      s.append(vertices[i] + ": ");
      for (boolean j : adjMatrix[i]) {
        s.append((j ? 1 : 0) + " ");
      }
      s.append("\n");
    }
    return s.toString();
  }
  
  
  
  public static void main(String args[]) {
    StringGraph g = new StringGraph(5);

    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    
    g.addEdge("AA", "EE");

    System.out.print(g);
  }
  
  
  
  
}
import java.util.*;

class BellmanFord {
    private int[] dist;
    private int[] parent;
    private int[][] graph;
    private int numVertices;
    
    public BellmanFord(int numVertices) {
        this.numVertices = numVertices;
        this.dist = new int[numVertices];
        this.parent = new int[numVertices];
        this.graph = new int[numVertices][numVertices];
    }
    
    public void addEdge(int u, int v, int weight) {
        graph[u][v] = weight;
    }
    
    public void bellmanFord(int source) {
        for (int i = 0; i < numVertices; ++i) {
            dist[i] = Integer.MAX_VALUE;
            parent[i] = -1;
        }
        dist[source] = 0;
        
        for (int i = 1; i < numVertices; ++i) {
            for (int u = 0; u < numVertices; ++u) {
                for (int v = 0; v < numVertices; ++v) {
                    if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                        parent[v] = u;
                    }
                }
            }
        }
        
        for (int u = 0; u < numVertices; ++u) {
            for (int v = 0; v < numVertices; ++v) {
                if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return;
                }
            }
        }
        
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < numVertices; ++i) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of vertices: ");
        int numVertices = scanner.nextInt();
        
        BellmanFord bf = new BellmanFord(numVertices);
        
        System.out.println("Enter adjacency matrix (space-separated values): ");
        for (int i = 0; i < numVertices; ++i) {
            for (int j = 0; j < numVertices; ++j) {
                bf.addEdge(i, j, scanner.nextInt());
            }
        }
        
        System.out.print("Enter source vertex (0-based index): ");
        int source = scanner.nextInt();
        
        bf.bellmanFord(source);
        
        scanner.close();
    }
}

import java.util.*;

public class bellman_ford {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // 1 vertex
        graph[1].add(new Edge(1, 2, -4));
        // 2 vertex
        graph[2].add(new Edge(2, 3, 2));
        // 3 vertex
        graph[3].add(new Edge(3, 4, 4));
        // 4 vertex
        graph[4].add(new Edge(4, 1, -1));
    }

    public static void createGraph2(ArrayList<Edge> graph) {

        // 0 vertex
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        // 1 vertex
        graph.add(new Edge(1, 2, -4));
        // 2 vertex
        graph.add(new Edge(2, 3, 2));
        // 3 vertex
        graph.add(new Edge(3, 4, 4));
        // 4 vertex
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanford(ArrayList<Edge> graph[], int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int vertex = graph.length;
        for (int i = 0; i < vertex - 1; i++) {
            for (int curr = 0; curr < graph.length; curr++) {
                for (int k = 0; k < graph[curr].size(); k++) {
                    // upper two loop time complexity is O(E)
                    Edge e = graph[curr].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void bellmanford2(ArrayList<Edge> graph, int src, int vertex) {
        int dist[] = new int[vertex];
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < vertex - 1; i++) {

            for (int k=0;k<graph.size();k++) {
                // upper two loop time complexity is O(E)
                Edge e = graph.get(k);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        // ArrayList<Edge>graph[]=new ArrayList[5];
        ArrayList<Edge> graph = new ArrayList<>();
        // createGraph(graph);
        createGraph2(graph);
        // bellmanford(graph, 0);
        bellmanford2(graph,0,5);
    }
}

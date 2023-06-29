import java.util.*;
import java.util.LinkedList;

public class Graph_bipartite {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2 vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4 vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;// 0== yellow,1== blue
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(j);

                        // case 1 = relative node is not coloured,so we coloured them
                        if (col[e.dest] == -1) {
                            col[e.dest] = col[curr] == 0 ? 1 : 0;
                            q.add(e.dest);
                        }
                        // case 2 = relative node and current node is same in color
                        else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                        // case 3= next node and curr node color is different so we continue it

                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        CreateGraph(graph);
        System.out.println(isBipartite(graph));

    }
}

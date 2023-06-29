import java.util.*;
import java.util.LinkedList;
//(bfs) (dfs) (has path)---- In this code
public class Graph_BFSDFS {

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
        // initialize with empty arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // create graph

        // 0 vetex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5 vertex

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 vertex
        graph[6].add(new Edge(6, 5, 1));
    }
    public static void bfs(ArrayList<Edge>graph[]){
        boolean isVisited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!isVisited[i]){
                traverseBFS_UTIL(graph, isVisited);
            }
        }
    }
    public static void traverseBFS_UTIL(ArrayList<Edge> graph[],boolean isVisited[]) {// O(V+E)
        
        Queue<Integer> q = new LinkedList<>();

        q.add(0);// put 0 as source
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!isVisited[curr]) {
                isVisited[curr] = true;
                System.out.print(curr + " ");
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfs_UTIL(graph, i, vis);
            }
        }
    }
    public static void dfs_UTIL(ArrayList<Edge>[] graph,int curr,boolean visit[]){
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.dest]){
                dfs_UTIL(graph,e.dest,visit);
            }
        }
    }
    //O(V+E)
    public static boolean has_Path(ArrayList<Edge>graph[],int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest] && has_Path(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        bfs(graph);

        // boolean visit[]=new boolean[v];
        //dfs(graph);
       // System.out.println(has_Path(graph,0,5, new boolean[graph.length]));
        
    }
}

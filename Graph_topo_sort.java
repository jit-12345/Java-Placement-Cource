
import java.util.*;
public class Graph_topo_sort {
   static class Edge{
    int src;
    int dest;
    public Edge(int s,int d){
        this.src=s;
        this.dest=d;
    }
   }
   public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i]=new ArrayList<>();

    }

    //2 vertex
    graph[2].add(new Edge(2,3));
    //3 vertex
    graph[3].add(new Edge(3,1));
    //4 vertex
    graph[4].add(new Edge(4,0));
    graph[4].add(new Edge(4,1));

    //5 vertex
    graph[5].add(new Edge(5,0));
    graph[5].add(new Edge(5,2));


   }
   public static void topo_sort(ArrayList<Edge>graph[]){
    boolean vis[]=new boolean[graph.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
            topo_sortUtil(graph,vis,s,i);
        }
    }
   }
   public static void topo_sortUtil(ArrayList<Edge>graph[],boolean vis[],Stack<Integer> s,int curr){
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e=graph[curr].get(i);
        if(!vis[e.dest]){
            s.push(e.dest);
            topo_sortUtil(graph, vis, s, e.dest);
        }
    }
   }
   public static void main(String[] args) {
    ArrayList<Edge> graph[]=new ArrayList[6];
    createGraph(graph);
    topo_sort(graph);
   } 
}

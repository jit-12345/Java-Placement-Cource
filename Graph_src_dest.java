import java.util.*;
import java.util.LinkedList;
public class Graph_src_dest {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        //0 vertex
        graph[0].add(new Edge(0,3));
        //1 vertex

        //2 vertex
        graph[2].add(new Edge(2,3));
        //3 vertex
        graph[3].add(new Edge(3, 1));
        //4 vertex
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        //5 vertex
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static void allPath(ArrayList<Edge>graph[],int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            allPath(graph, e.dest, dest, path+src);
        }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[6];
        createGraph(graph);
        allPath(graph,5,1,new String(""));
    }
}

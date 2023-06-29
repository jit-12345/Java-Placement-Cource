import java.util.*;
public class Graph_cycle {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }

        //0 vertex
        graph[0].add(new Edge(0, 1));
        //graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        //1 vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        //2 vertex
       // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        //3 vertex
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        //4 vertex
        graph[4].add(new Edge(4, 3));
    }
    public static boolean detectCycle(ArrayList<Edge>graph[]){//O(V+E)
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
              if(detectCycle_UTIL(graph,i,-1,vis)){
                return true;
              }
            }
        }
        return false;
    }
    public static boolean detectCycle_UTIL(ArrayList<Edge>graph[],int curr,int par,boolean vis[]){
       
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            //case 3
            if(!vis[e.dest] ){
               if(detectCycle_UTIL(graph,e.dest,curr,vis)){
                return true;
               }
            }
            
            //case 1
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
            //case 2(do nothing); curr node is my parent then -> continue;
            

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        CreateGraph(graph);
        System.out.println(detectCycle(graph));

    }
}

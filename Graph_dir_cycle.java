import java.util.*;
public class Graph_dir_cycle {
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
        graph[0].add(new Edge(0,2));
        //1 vertex
        graph[1].add(new Edge(1,0));
        //2 vertex
        graph[2].add(new Edge(2,3));
        //3 vertex
        graph[3].add(new Edge(3,0));
    }
    public static boolean isCycle(ArrayList<Edge>graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,vis,stack,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>graph[],boolean vis[],boolean stack[],int curr){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            
            Edge e=graph[curr].get(i);

            //case 1
            if(stack[e.dest]){//cycle exist
                return true;
            }

            //case 2
            if(!vis[e.dest] && isCycleUtil(graph,vis,stack,e.dest)){
                return true;
            }
            
        }
        stack[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>graph[]=new ArrayList[4];//4 vertex
        createGraph(graph);
        System.out.println(isCycle(graph));

    }
}

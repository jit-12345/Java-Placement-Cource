import java.util.*;
public class prims {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        //0 vertex
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        //1 vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        // 2 vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        //3 vertex
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    static class pair implements Comparable<pair>{
        int v;
        int cost;
        public pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }

        @Override
        public int compareTo(pair p2){
            return this.cost-p2.cost;
        }
    }


    public static void mst(ArrayList<Edge>graph[],int src){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<pair>pq=new PriorityQueue<>();
        int finalcost=0;
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalcost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    int v=e.dest;
                    int w=e.wt;
                    pq.add(new pair(v, w));
                }
            }
        }
        System.out.println("The final cost is :"+finalcost);
    }
    public static void main(String[] args) {
        ArrayList<Edge>graph[]=new ArrayList[4];
        createGraph(graph);
        mst(graph, 0);
    }
}

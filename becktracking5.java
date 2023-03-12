public class becktracking5 {
    public static int gridways(int n,int m,int i,int j)
    {
        //base case
        if (i==n-1&&j==m-1) {
            return 1;
        }
        else if(i==n||j==n){
            return 0;
        }
        //recursion
        int w1=gridways(n, m, i+1, j);
        int w2=gridways(n, m, i, j+1);
        return w1+w2;
    }
    public static void main(String args[])
    {
        int n=3;
        int m=3;
        System.out.println(gridways(n,m,0,0));
    }
}

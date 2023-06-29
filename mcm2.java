import java.util.*;
public class mcm2 {
    
    public static int mcm(int a[],int n){
        int dp[][]=new int[n][n];
        for(int len=2;len<n;len++){
            int col=len;
            for(int row=0;row<n-len;row++){
               dp[row][col]=Integer.MAX_VALUE;
               for(int k=row+1;k<col;k++){
                dp[row][col]=Math.min(dp[row][col], 
                dp[row][k]+dp[k][row]+(a[row]*a[k]*a[col]));
               }
            }
            col++;
        }
        return dp[0][n-1];
    }
public static void main(String args[]){
    int arr[]={2,3,4,1,3};
    System.out.println(mcm(arr, arr.length));
}

}

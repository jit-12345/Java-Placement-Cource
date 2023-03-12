public class sum_of_n_recursion {
    public static int sum(int n){
        if (n==1) {
           return 1; 
        }
        int res=n+sum(n-1);
        return res;
    }
     public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}

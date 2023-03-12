public class factorial {
   public static int factorial(int n){
    
    if (n==0){
        return 1;
    }
    int fmno=factorial(n-1);
    int fn=n*factorial(n-1);
    return fn;
    //return n*factorial(n-1);In one line
   } 
   public static void main(String[] args) {
    int n=5;
    System.out.println(factorial(n));
   }
}

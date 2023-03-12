import java.util.Scanner;

public class fibonacci_series {
    public static int print_fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return print_fib(n-1)+print_fib(n-2);
    }
 public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter thr position of fibonacci series you want to know");
    int a=sc.nextInt();
    System.out.println(print_fib(a));
 }  
}

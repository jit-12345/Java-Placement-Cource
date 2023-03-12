import java.util.*;
public class posneg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check the number is positive or negetive");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("NEGETIVE");
        }
        else{
            System.out.println("POSITIVE");
        }
    }
}
import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three numbers\n");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double avg=(a+b+c)/3;
        System.out.print("The average of three numbers are\n");
        System.out.println(avg);
    }
}
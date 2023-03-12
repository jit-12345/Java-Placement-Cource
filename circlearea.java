import java.util.*;
public class circlearea{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle\n");
        int r=sc.nextInt();
        double pi=3.14;
        double area = pi*r*r;
        System.out.print("The area of the circle is\n");
        System.out.print(area);
    }
}
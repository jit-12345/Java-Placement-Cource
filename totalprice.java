import java.util.*;
public class totalprice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the pen pencil and eraser");
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        double cost=(double)(pen+pencil+eraser);
        double gst=(cost*18)/100;
        double totalprice=cost+gst;
        System.out.println("The total price of the items are");
        System.out.println(totalprice);
    }

}
import java.util.*;
//wrong code
public class leapyearcheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the yer you want to check its leap year or not");
        int year=sc.nextInt();
        if(year%4==0 && year%100==0 && year % 400==0){
            System.out.println("Thid is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}

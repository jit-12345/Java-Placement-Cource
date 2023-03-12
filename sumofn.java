import java.util.*;
public class sumofn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int num=1;
        System.out.println("Enter the renge");
        int renge=sc.nextInt();
        while (num<=renge) {
            sum+=num;
            num++;
            
        }
        System.out.println("The sum is "+sum);
    }
    
}

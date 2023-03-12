import java.util.*;
public class arraylistpairsum1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println("Enter the target");
        int target=sc.nextInt();
        for (int i = 0; i < list.size(); i++) 
        {
         for (int j = i+1; j < list.size(); j++) 
         {
            if ((list.get(i)+list.get(j))==target) 
            {
                System.out.println("The pair of sum 5 is "+"["+list.get(i)+","+list.get(j)+"]");
                //return;
            }
            
         }   
        }
            System.out.println("The target does not match to add two number in the arraylist");
            return;
    }
}

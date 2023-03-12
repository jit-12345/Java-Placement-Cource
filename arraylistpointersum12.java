import java.util.*;
public class arraylistpointersum12
{
    public static boolean pairsum(ArrayList<Integer>list,int target)
    {
        int lp=0;
        int rp=list.size()-1;
       // System.out.println("Enter the target");
       // Scanner sc=new Scanner(System.in);
       // int target=sc.nextInt();
        while (rp!=lp) 
        {
        if ((list.get(lp)+list.get(rp))== target) 
        {
            return true;
        }
        else if ((list.get(lp)+list.get(rp))<target) 
        {
            lp++;
        }
        else if ((list.get(lp)+list.get(rp))>target) 
        {
            rp--;
        }
        }
        return false;
    }
    
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
        System.out.println(pairsum(list,10));
    }
}
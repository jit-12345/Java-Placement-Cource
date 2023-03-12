import java.util.ArrayList;

public class arraylistpairsum2 {
    public static boolean pairsum(ArrayList<Integer>list,int target)
    {
        int lp=0;
        int rp=0;
        int n=list.size();
        for (int i = 0; i < list.size(); i++) {
          if (list.get(i)>list.get(i+1)) {
            rp=i;
            lp=i+1;
            break;
          }  
        }
        
        while (rp!=lp) 
        {
        if ((list.get(lp)+list.get(rp))== target) 
        {
            return true;
        }
        else if ((list.get(lp)+list.get(rp))<target) 
        {
            lp=(lp+1)%n;
        }
        else if ((list.get(lp)+list.get(rp))>target) 
        {
            rp=(n+rp-1)%n;
        }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //11,15,6,8,9,10-sorted & rotated array
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=50;
        System.out.println(pairsum(list, target));

    }
}

import java.util.*;
public class mostwaterarraylist3 {
    public static int mostwatertrapped(ArrayList<Integer>list)
    {
        int lp=0;
        int rp=list.size()-1;
        int maxwater=0;
        while (rp>lp)
        {
         int height=Math.min(list.get(lp),list.get(rp));
         int width=rp-lp;
         int totalwater=height*width;
         maxwater=Math.max(maxwater,totalwater);
         //condition
         if (rp>=lp) {
            lp++;
         }
         else{
            rp--;
         }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println("The maximum bounded total water is "+ mostwatertrapped(list));
    }
}

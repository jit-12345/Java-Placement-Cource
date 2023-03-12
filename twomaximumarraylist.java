import java.util.*;
public class twomaximumarraylist {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        // list.add(3);
        // list.add(9);
        // list.add(1);
        // list.add(5);
        // list.add(6);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(8);
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int temp=0;
       for (int i = 0; i < list.size(); i++) 
       {
        // if (list.get(i)>=list.get(i+1)) 
        // {
        //    max1=list.get(i); 
        // }
        // if (list.get(i)<=list.get(i+1)) 
        // {
        //    max1=list.get(i+1); 
        // }
        max1=list.get(i);
        if (max1>=temp) {
            temp=max1;
        }

        if (max1>=max2) {
            if ((i==list.size()-1)&&(max1>=max2)) {
                temp=max2;
            }
            max2=max1;
            if (i!=(list.size()-1)) {
                temp=0;
            }
        }
       }
       max1=temp;
       System.out.println("The heighest element in the arraylist is:"+max2); 
       System.out.println("The second heighest element in a arraylist is:"+max1); 
    }
}

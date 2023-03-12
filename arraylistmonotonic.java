import java.util.*;
//not fully solved
public class arraylistmonotonic 
{
    public static boolean checkmonotonic(ArrayList<Integer>list)
    {
        int i=0;
        while (i<list.size()) 
        {
            if(i==list.size()-1)
            {
                return true;
            }
            if (list.get(i)<=list.get(i+1)) 
            {
                i++;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1); 
        list.add(5); 
        list.add(2); 
        list.add(3);
        System.out.println(checkmonotonic(list));
    }
}

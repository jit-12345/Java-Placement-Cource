import java.util.ArrayList;
import java.util.Collections;

public class sortingarraylist {
    public static void main(String args[]) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(1);
        list.add(6);
        System.out.println(list);
        //forward order sorting
        Collections.sort(list);
        System.out.println(list);
        //reverse order sorting
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    
       } 
}

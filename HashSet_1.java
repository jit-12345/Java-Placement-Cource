import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet();
        
        //add values in the hashset
        set.add(5);
        set.add(8);
        set.add(2);
        set.add(1);
        set.add(8);
        set.add(2);

        //print hashset
        System.out.println(set);

        //check contains
        if (set.contains(5)) {
            System.out.println("5 is in the set");
        }
        if (set.contains(9)) {
            System.out.println("9 is contains in set");
        }

        //remove
        set.remove(2);
        if (!set.contains(2)) {
            System.out.println("2 is not contains in the set");
        }
        //size of set
        if (set.size() !=0) {
            //one line to clear the set
            set.clear();
        }
        
        if (set.isEmpty()) {
            System.out.println("the set is empty");
        }
    

    }
}

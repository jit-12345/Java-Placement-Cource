import java.util.*;

public class Hashset_Linked {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kolkata");
        lhs.add("Mumbai");
        lhs.add("Bangaluru");
        lhs.add("Hyderabad");
        lhs.add("Gujrat");

        System.out.println(lhs);

        //its follow the order and input reflects on order of output
        //other operation are same as hashset
    }
}

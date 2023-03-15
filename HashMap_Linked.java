import java.util.*;
public class HashMap_Linked {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
        lhm.put("India", 130);
        lhm.put("Russia",60);
        lhm.put("Nepal",5);
        lhm.put("Bhutan",5);
        System.out.println(lhm);
        System.out.println(lhm.get("Nepal"));
    }
}

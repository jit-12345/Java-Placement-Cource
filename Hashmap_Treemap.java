import java.util.*;
public class Hashmap_Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm= new TreeMap<>();
        tm.put("Russia",60);
        tm.put("India",130);
        tm.put("Nepal",5);
        tm.put("Canada",50);
        tm.put("Australia",15);
        //keys are sorted in alphabetic order
        System.out.println(tm);
    }
}

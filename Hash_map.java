import java.util.*;

public class Hash_map {
    
    public static void main(String[] args) {
        //create
    HashMap<String,Integer> hm= new HashMap<>();
    //put
    hm.put("China", 150);
    hm.put("India", 130);
    hm.put("Us", 50);

    System.out.println(hm);
    //get-O(1)
       int population= hm.get("India");
       System.out.println(population);

       System.out.println(hm.get("Indonesia"));

       //ContainsKey-O(1)
       System.out.println(hm.containsKey("India"));
       System.out.println(hm.containsKey("BanglaDesh"));

       //remove O(1);
       System.out.println(hm.remove("China"));
       //print
       System.out.println(hm);
        //clear
        hm.clear();
       //size
       System.out.println(hm.size());
       //isEmpty
       System.out.println(hm.isEmpty());

       
    }
}

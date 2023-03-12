import java.security.KeyStore.Entry;
import java.util.*;
public class Hash_Map2 {
   public static void main(String[] args) {
    //creating a hashmap
    HashMap<String,Integer> hm=new HashMap<>();
    //put the keys and values
    hm.put("India", 130);
    hm.put("China", 140);
    hm.put("Pakistan", 30);
    hm.put("Bangladesh", 10);
    //print the hashmap
   System.out.println(hm);

    //Iteration in the HashMap
    //To make Iteration make a Set
   Set<String> keys= hm.keySet();
  // Set<java.util.Map.Entry<String, Integer>> map=hm.entrySet();
   
    //print the set
   System.out.println(keys);
    System.out.println(hm.entrySet());

    // for (String k : keys) {
    //   System.out.println("key="+k+",value="+hm.get(k));
    // }
    

   } 
}

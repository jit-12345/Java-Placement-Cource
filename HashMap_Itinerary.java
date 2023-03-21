import java.util.*;

public class HashMap_Itinerary {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revmap= new HashMap<>();
        for (String k : tickets.keySet()) {
           revmap.put(tickets.get(k), k); 
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bangaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String str : tickets.keySet()) {
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        
    }
}

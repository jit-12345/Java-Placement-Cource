import java.util.*; 
public class Hashset_Iteration {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Bangaluru");
        cities.add("Hyderabad");
        cities.add("Gujrat");


        //using iterator
        /* 
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            //explained in khata
        }
        */

        //using extend for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

import java.util.*;
class Hashmap_Majority{
    //O(n) time complexity
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        // int arr[]={1,2};
        int n=arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            // if(hm.containsKey(num)){
            //     hm.put(num,hm.get(num)+1);
            // }else{
            //     hm.put(num, 1);
            // }
           
            //alternate of upper lines

            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        // Set<Integer> keyset= hm.keySet(); alternate of these line
        for (Integer k : hm.keySet()) {
           if (hm.get(k)>(n/3)) {
            System.out.println(k);
           } 
        }
    }
}
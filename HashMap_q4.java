import java.util.*;
import java.util.HashMap;

//Smallest Subarray with 0 sum
public class HashMap_q4 {

    public static int smallest_len(int arr[]) {
        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                int j = map.get(sum);
                len = len==0?Math.max(len, i - j):Math.min(len, i - j);
                
             } 
             else{
                map.put(sum, i);
             }
             
        }
        return len;

    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        // int arr[] = { 15, -15, 15 };
        System.out.println("Length of the smallest subarray is :" + smallest_len(arr));

    }
}

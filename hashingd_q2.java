import java.util.*;
public class hashingd_q2 {
    //find union and intersection of two arrays(question description)
    // arr1[]={1,6,5,3};
    // arr2[]={6,3,9};
    // union={1,6,5,3,9};
    // intersection={6,3};
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer> union=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println("Union of Two array is:"+union+". And the size of the set is:"+union.size());

        //intersection
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i <arr1.length; i++) {
            set.add(arr1[i]);
        }
        HashSet<Integer>intersection=new HashSet<>();

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersection.add(arr2[i]);
            }
        }

        System.out.println("Intersection of Two array is:"+intersection+". And the size of the set is:"+intersection.size());
    }
}

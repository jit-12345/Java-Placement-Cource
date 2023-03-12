import java.util.ArrayList;

public class Recursion_q {
    public static void find_occur(int arr[],int key,int idx,ArrayList<Integer>list){
        //base case
        if (idx==arr.length) {
            for (int i = 0; i < list.size(); i++) {
               System.out.print(list.get(i)+" "); 
            }
            return;
        }
        //kaam
        
        if (arr[idx]==key) {
            list.add(idx);
        }
        find_occur(arr, key, idx+1,list);
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        find_occur(arr,2,0,new ArrayList<>());
    }
}

public class lastoccurence_recursion {
    public static int check(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=check(arr, key, i+1);
        if (isfound==-1 && arr[i]==key) {
            return i;
        }
        return isfound;
    }
 public static void main(String[] args) {
    int arr[]={2,3,4,1,2};
    System.out.println( check(arr, 2, 0));

 }   
}

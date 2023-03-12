public class firstoccurence_recursion {
    public static int check(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println( check(arr, 5,0));
    }
}

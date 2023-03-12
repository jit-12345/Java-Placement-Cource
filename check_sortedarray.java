public class check_sortedarray {
    public static boolean check(int arr[],int j){
        if(j==arr.length-1){
            return true;
        }
        if (arr[j]>arr[j+1]) {
            return false;
        }
        return check(arr, j+1);
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,5};
        System.out.println( check(arr,0));
    }
}

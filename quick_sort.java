public class quick_sort {
    public static void printarr(int arr[]){
        int i=0;
        while(i<=arr.length-1){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void sort(int arr[],int si,int ei){
        if (si>=ei) {
          return;  
        }
        //pivot is my last element
        int pidx=partition(arr,si,ei);
        sort(arr, si, pidx-1);
        sort(arr, pidx+1, ei);
        
        
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,2,6};
        System.out.println("before sorting the array");
        printarr(arr);
        System.out.println();
        System.out.println("After sorting the array");
        sort(arr, 0, arr.length-1);
        printarr(arr);

    }
}

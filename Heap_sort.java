public class Heap_sort {
    public static void heapify(int arr[],int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if (left<n && arr[left]>arr[maxIdx]) {
            maxIdx=left;
        }
        if (right<n && arr[right]>arr[maxIdx]) {
            maxIdx=right;
        }
        if(maxIdx!= i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr, maxIdx, n);
        }
    }
    public static void heapsort(int arr[]){
        int n=arr.length;
        //atfirst bring the max element in the root of the arr
        for (int i = n/2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        //swap two numbers front and rear
        for (int i = n-1; i > 0; i--) {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr, 0, i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}

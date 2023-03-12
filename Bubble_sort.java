public class Bubble_sort {
    public static void bubblesort(int arr[]){
        for (int turns = 0; turns < arr.length-1; turns++) {
            int swaps=0;
            for (int j = 0; j < arr.length-1-turns; j++) {
                if (arr[j]>arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            System.out.println(swaps+" swap in the "+turns+" th' turns");
        }
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       int arr[]={5,3,2,4,1}; 
       bubblesort(arr);
    }
}

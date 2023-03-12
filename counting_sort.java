public class counting_sort 
{
    public static void countingsort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        //calculate largest number
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(arr[i], largest);
        }
        //increase the count array 
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j=0;
        for (int i = 0; i < count.length; i++) {
        while (count[i]>0) {
           arr[j]=i;
           j++;
           count[i]--; 
        }
        }
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={5,2,3,1,4,1};
        countingsort(arr);
    }
}


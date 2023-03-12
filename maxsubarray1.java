public class maxsubarray1 {
    public static void maxsum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currsum=0;
               for (int j2 = start; j2 <=end; j2++) 
               {
                currsum+=arr[j2];
               } 
               System.out.println(currsum);
               if (currsum>maxsum) 
               {
                maxsum=currsum;
               }
            }
            System.out.println();
           
        }
       System.out.println("Thr maximum sum is "+maxsum); 
    }
    public static void main(String args[]){
        int[]arr={2,3,-1,-4,12};
        maxsum(arr);
    }
}

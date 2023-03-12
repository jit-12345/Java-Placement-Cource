public class trappedrainwater{
    public static int trapwater(int arr[]){
        int n=arr.length;
        //calculate leftmax boundary
        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        //calculate rightmax boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int trapedwater=0;
        for (int i = 0; i < arr.length; i++) {
          int waterlavel=Math.min(leftmax[i],rightmax[i]);
          trapedwater+=waterlavel-arr[i];  
        }
        return trapedwater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println("Trapped water is "+trapwater(arr));
    }
}
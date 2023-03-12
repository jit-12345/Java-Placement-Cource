public class selectionsort {
    public static void printsorted(int numbers[]){
        for (int i = 0; i < numbers.length-1; i++) {
            int minpos=i;
            for (int j = i+1; j < numbers.length; j++) {
               if (numbers[minpos]>numbers[j]) {
                minpos=j;
               } 
            }
            int temp=numbers[minpos];
            numbers[minpos]=numbers[i];
            numbers[i]=temp;
        }

    }
    public static void printarr(int numbers[]) {
      for(int i=0;i<numbers.length;i++) {
        System.out.print(numbers[i]+" ");
      }
      System.out.println(); 
    }
   public static void main(String[] args) {
    int numbers[]={5,4,2,3,1};
    printsorted(numbers);
    printarr(numbers);
   } 
}

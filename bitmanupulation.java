public class bitmanupulation {
    public static void oddoreven(int n){
        if((n&1)==0){
            System.out.println("The Number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static int grtithbit(int n,int i){
         int bitmask=1<<i;
         if ((n&bitmask)==0) {
            return 0;
         }
         else{
            return 1;
         }
    }
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateithbit(int n,int i,int val){
        // if (val==0) {
        //    return clearithbit(n, i);

        // }
        // else{
        //     return setithbit(n, i);
        // }
        n=clearithbit(n, i);
        int bitmask=val<<i;
        return n|bitmask;

    }
    /*It is jit's approach and it is wrong
    public static int clearlast_ibit(int n,int i){
        int clear_bit=0;
        for (int j = 0; j < i; j++) {
            clear_bit=clearithbit(n, j);
        }
        return clear_bit;
    }*/
    public static int clearlast_ibit(int n,int i){
        int bitmask=(~0)<<i;
        return n& bitmask;
    }
    public static int clearbitsinrange(int n,int i,int j){
      if (i<j) {
        
      
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
      }
      return 0;
    }
    public static boolean checkpowerof_two(int n){
        // int a=n&(n-1);
        // if (a==0) {
        //     System.out.println("The number is power of 2");
        // }
        // else{
        //     System.out.println("It is not the power of 2");
        // }
        return (n&(n-1))==0;
    }
    public static int count_set_bits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
     public static void main(String[] args) {
        //System.out.println((~7));
        //oddoreven(7);
       // oddoreven(8);
       //System.out.println( grtithbit(8, 2));
       //System.out.println( setithbit(8, 3));
       //System.out.println( updateithbit(10,1,0));
      // System.out.println(clearbitsinrange(10, 2,4));
      //System.out.println(count_set_bits(14));
      System.out.println(~(-4));
    }
}

public class N_sum {
    public static int recursive_sum(int j){
        if (j==1) {
            return 1;
        }
        int fmno=recursive_sum(j-1);
        int fn=j+recursive_sum(j-1);
        return fn;

    }
  public static void main(String args[]) {
    int n=5;
   System.out.println (recursive_sum(n));
  } 
}

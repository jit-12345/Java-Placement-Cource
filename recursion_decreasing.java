public class recursion_decreasing {
    public static void decreasing(int j){
        if(j==1){
            System.out.println(j);
            return;
        }
        System.out.print(j+" ");
        decreasing(j-1);
    }
  public static void main(String args[]){
    int n=100;
    decreasing(n);

  }  
}

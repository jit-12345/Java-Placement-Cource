
public class power_recursive {
    public static int optimized_power(int x,int n){
        if (n==0) {
           return 1; 
        }
        int halfpower=optimized_power(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if (n%2 != 0) {
            halfpowersq= x*halfpowersq;
        }
        return halfpowersq;
    }
    public static int power(int a,int b){
        if (b==0) {
           return 1; 
        }
        int val=power(a, b-1);
        int res=a*val;
        return res;
    }
   public static void main(String[] args) {
    int base=2;
    int pow=10;
    System.out.println( power(base,pow));
    System.out.println(optimized_power(base,pow));
   } 
}

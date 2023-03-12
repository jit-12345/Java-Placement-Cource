public class tilling_prob {
    public static int tilling(int n){//for 2xn size floor
        if (n==0||n==1) {
            return 1;//when 2x1 space present or no space present
        }
        //for vertical choice
        int fnm1=tilling(n-1);
        //for horizontal choice
        int fnm2=tilling(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilling(0));
    }
}

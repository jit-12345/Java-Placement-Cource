public class binarytodecimel {
    
    public static void bin_dec(int n) {
        int mynum=n;
        int rem,dec_num=0,pow=0;
        while (n>0) {
            rem=n%10;
            dec_num=(rem*(int)Math.pow(2,pow))+dec_num;
            pow++;
            n=n/10;
        }  
        System.out.println("The decimel expression of"+mynum+"="+dec_num);  
    }
    public static void main(String[] args) {
        bin_dec(111);
    }
    
}

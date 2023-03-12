public class reverse {
    public static void main(String args[]){
        int num=11122001;
        while (num>0) {
            int lastdigit=num%10;
            num=num/10;
            System.out.print(lastdigit);
        }
    }
}

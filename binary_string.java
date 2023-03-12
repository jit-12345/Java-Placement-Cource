public class binary_string {
    public static void printbinstrings(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinstrings(n-1,0, str+"0");
        if (lastplace==0) {
           printbinstrings(n-1, 1, str+"1"); 
        }
    }
    public static void main(String[] args) {
       printbinstrings(3, 0, ""); 
    }
}

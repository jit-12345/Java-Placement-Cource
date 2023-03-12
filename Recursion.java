import javax.swing.event.ChangeEvent;

public class Recursion {
    public static void printDec(int n){
        //base case
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
       System.out.print(n+" ");
    }
    public static int factorial(int n){
        //base case
        if (n==1) {
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static int sum_of_natural(int n){
        while (n==1) {
            return 1;
        }
        return n+sum_of_natural(n-1);
    }
     
    public static boolean check_sort(int arr[],int i){
        //base case
        if(i==arr.length-1){
            return true;
        }
        //kaam
        if(arr[i]>arr[i+1]){
            return false;
        }
        //recursion
         return check_sort(arr, i+1);


    }
    public static int fib(int n){
        //base case
        if (n==0||n==1) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int first_occur(int arr[],int key,int i){
        //base case
        if (i==arr.length) {
          return -1;  
        }
        //kaam
        if(arr[i]==key){
            return i;
        }
        //recursion
        int idx=first_occur(arr, key, i+1);
        return idx;
    }
    public static int last_occur(int arr[],int key,int i){
        //base case
        if (i==-1) {
            return -1;
        }
        //kaam
       
        if (arr[i]==key) {
            return i;
        }
        //recursion
        int idx=last_occur(arr, key, i-1);
        return idx;
    }
    public static int last_occur2(int arr[],int key,int i){//apna college
        //base case
        if (i==arr.length) {
            return -1;
        }
        //recursion
        int idx=last_occur2(arr, key, i+1);
        //kaam
       
        if (idx==-1 && arr[i]==key) {
            return i;
        }
        return idx;
    }
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        return x *power(x, n-1);
    }
    public static int power2(int x,int n){
        if(n==0){
            return 1;
        }
        //int halfpowersquare=power2(x, n/2)*power2(x, n/2);
        int halfpower=power2(x, n/2);
        int halfpowersquare=halfpower*halfpower;
        
        //n is odd
        if (n%2!=0) {
           return x*halfpowersquare; 
        }
        return halfpowersquare;
    }
    public static int tilling_problem(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        //kaam
        //recursion
        //for choosing vertical
        int fnm1=tilling_problem(n-1);
        //for choosing horizontal
        int fnm2=tilling_problem(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void remove_duplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if (idx==str.length()) {
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar=str.charAt(idx);
        if (map[currchar-'a']==true) {
            //duplicates
            remove_duplicates(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            remove_duplicates(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static int friendsPairing(int n){
        if (n==1||n==2) {
            return n;
        }
        int single=friendsPairing(n-1);
        int pair=(n-1)*friendsPairing(n-2);
        return single+pair;

    }
    public static void binary_string(int n,int LastPlace,String str){
        //base case
        if (n==0) {
           System.out.println(str);
           return;
        }
        //kaam
        binary_string(n-1, 0, str+"0");
        if (LastPlace==0) {
            binary_string(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n=3;
        //System.out.println(sum_of_natural(n));
        //int arr[]={8,3,6,9,3,5,3};
        //System.out.println(fib(n));
        //System.out.println(last_occur2(arr, 8,0));
       // System.out.println(tilling_problem(n));
      // remove_duplicates("appnacollege", 0, new StringBuilder(""), new boolean[26]);
      // binary_string(3, 0, "");
      System.out.println(friendsPairing(4));
    }
}

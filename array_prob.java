
import java.util.*;


/*public class array_prob {
    public static void insertx(int n,int arr[],int pos,int x){
        int newarr[]=new int[n+1];
        
        for (int i = 0; i < n+1; i++) {
            if (i<pos-1) {
                newarr[i]=arr[i];
            }
            else if (i==pos-1) {
                newarr[i]=x;
            }
            else{
                newarr[i]=arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newarr));
        
    }
   public static void main(String[] args) {
    int n=4;
    int arr[]={2,3,5,6};
    System.out.println("Initial array"+Arrays.toString(arr));
    int pos=2;//position number
    int x=9;//position value
    insertx(n, arr, pos, x);
   } 
}*/
//another approch
public class array_prob{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int n=6;
        System.out.println("Enter the array element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Initial array");
        
        
        System.out.println(Arrays.toString(arr));
        
        int pos=3;
        int x=9;
        n++;
        for (int i = n-1; i <=pos-1; i--) {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=x;
        System.out.print(Arrays.toString(arr));


    }
}
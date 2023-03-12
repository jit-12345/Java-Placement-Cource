// import java.util.*;
// public class Dec_bin {
//      static Stack<Integer>s=new Stack<>();
//     public static void Convert_binary(int num){
//         while (num!=0) {
//             s.addElement(num%2);
//             num=num/2;
//         }
//         return;
//     }
//     public static void main(String[] args) {

//         System.out.println("Enter the Number You want to convert Decimal to Binary");
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         Convert_binary(num);
//         System.out.println("The Binary Form Is");
//         while (!s.isEmpty()) {
//             System.out.print(s.pop()+" ");
//         }
//     }
// }
import java.util.*;

public class Dec_bin {
    public static int convertion(int num) {
        int val = 0;
        int rem;
        int pos = 0;
        while (num > 0) {
            rem = num % 2;
            val = val + (rem * (int) Math.pow(10, pos));
            pos++;
            num=num/2;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What Number You Want To Convert into Binary");
        int num = sc.nextInt();
        int res = convertion(num);
        System.out.println(res);

    }
}
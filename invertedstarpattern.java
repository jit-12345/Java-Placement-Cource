import java.util.*;

public class invertedstarpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print inverted stars");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i) + 1; j++) {
                System.out.print('*');
            }
            System.out.println();

        }

    }
}

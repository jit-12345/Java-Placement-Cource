import java.util.*;

public class factorialall {
    public static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;

    }

    public static float bionomial(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        float result = (float) (fact_n) / (fact_r * fact_nmr);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n and r in bionomial coefficient");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("The bionomial of given number is " + bionomial(n, r));
    }

}

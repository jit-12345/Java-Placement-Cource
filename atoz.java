import java.util.*;

public class atoz 
{
    public static boolean prim(int n) 
    {

        if (n == 2)
        {
            return true;
        }
        else if (n > 2) 
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0) 
                {
                    return false;
                } else 
                {
                    return true;
                }
            }
        }
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the range you want to check the numbers are prime");
        //int range = sc.nextInt();
        System.out.println("Is the number prime?"+prim(7));
    }
}

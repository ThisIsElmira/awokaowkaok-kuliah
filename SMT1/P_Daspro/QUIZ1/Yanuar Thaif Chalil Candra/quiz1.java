//ODD CODE
//29_YANUAR THAIF CHALIL CANDRA
import java.util.Scanner;
public class quiz1
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        float sa, c, t, n;
        System.out.println("Input salaries:");
        sa=input.nextFloat();
        
        System.out.println("Number of Family:");
        n=input.nextFloat();

        c = sa - 27000*n;
        t = c - (7 * sa / 100);
        System.out.println("Total salary is: " +t);
    }

    private static float nextInput() {
        return 0;
    }
}
import java.util.Scanner;
public class jb11assignment3
{
    static boolean RecursivePrimeCheck (int x, int y)
    {
        if (x == 2 || (y * y > x))
        {
            return true;
        }

        if (x < 2 || x % y == 0)
        {
            return false;
        }

        return RecursivePrimeCheck(x, y + 1);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number: ");
        int a = input.nextInt();
        boolean isPrime = RecursivePrimeCheck(a, 2);
        if (isPrime)
        {
            System.out.print("The number is Prime");
        }
        else
        {
            System.out.print("The number is not Prime");
        }
    }
}
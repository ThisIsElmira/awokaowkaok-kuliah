import java.util.Scanner;
public class jb11assignment2
{
    static int RecursiveAddition (int x)
    {
        if (x == 0)
        {
            return (0);
        }
        else
        {
            return (x + RecursiveAddition(x-1));
        }
    }

    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        System.out.print(RecursiveAddition(a));
    }
}
import java.util.Scanner;
public class jb11assignment1
{
    static int RecursiveDescendingSeries(int x)
    {
        if (x == 0)
        {
            return (0);
        }
        else
        {
            System.out.print(x);
            return RecursiveDescendingSeries(x - 1);
        }
    }

    static int IterativeDescendingSeries(int x)
    {
        for(int i = x; i > 0; i--)
        {
            System.out.print(x);
            x--;
        }
        return x;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number: ");
        int a = input.nextInt();
        System.out.print(RecursiveDescendingSeries(a));
        System.out.println("");
        System.out.print(IterativeDescendingSeries(a));
    }
}
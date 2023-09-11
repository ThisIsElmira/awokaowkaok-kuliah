import java.util.Scanner;
public class jobsheet8asg3
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of array elements: ");
        int a = sc.nextInt();
        int[] ast = new int[a];
        for (int i = 0; i < ast.length; i++)
        {
            System.out.print("Enter the value of element " + (i+1) + ": ");
            ast[i] = sc.nextInt();
        }
        for (int i = 0; i < ast.length; i++)
        {
            if (ast[i] % 2 == 0)
            {
                System.out.println("Even number: " + ast[i]);
            }
        }
        for (int i = 0; i < ast.length; i++)
        {
            if (ast[i] % 2 == 1)
            {
                System.out.println("Odd number: " + ast[i]);
            }
        }
    }
}
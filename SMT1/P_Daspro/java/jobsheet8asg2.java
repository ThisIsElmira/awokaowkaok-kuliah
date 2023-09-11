import java.util.Scanner;
public class jobsheet8asg2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of array elements: ");
        int sum = sc.nextInt();
        int[] ast = new int[sum];
        for (int i = 0; i < ast.length; i++)
        {
            System.out.print("Enter the value of element " + (i+1) + ": ");
            ast[i] = sc.nextInt();
        }
        int high = 0;
        for (int i = 0; i < ast.length; i++)
        {
            if (ast[i] > high)
            {
                high = ast[i];
            }
        }
        System.out.println("The largest number is " + high);
    }
}
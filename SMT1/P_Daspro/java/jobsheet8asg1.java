import java.util.Scanner;
public class jobsheet8asg1
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int[] ast = new int[5];
        for (int i = 0; i < ast.length; i++)
        {
            System.out.print("Input the value of array [" + (i+1) + "]: ");
            ast[i] = sc.nextInt();
        }
        System.out.print("The value of array in reverse order is ");
        for (int i = ast.length-1; i >= 0; i--)
        {
            System.out.print("[" + ast[i] + "]");
        }
    }
}
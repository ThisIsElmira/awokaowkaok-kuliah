import java.util.Scanner;
public class assignmentjb72
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int height;
        do
        {
            System.out.print("Insert the height of the triangle (min 5): ");
            height = sc.nextInt();
            if (height >= 5) break;
            System.out.println("Please insert more than 5!");
        }
        while (true);
        for (int i = 1; i <= height; i++)
        {
            for (int j = 0; j <= height - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
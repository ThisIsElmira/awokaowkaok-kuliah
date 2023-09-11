import java.util.Scanner;
public class assignmentjb71
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int height;
        do
        {
            System.out.print("Insert the height of the triangle (min 3): ");
            height = sc.nextInt();
            if (height >= 3) break;
            System.out.println("Please insert more than 3!");
        }
        while (true);
        for (int i = 1; i <= height; i++)
        {
            int number = 1;
            for (int j = 1; j <= height; j++)
            {
                if (j > height-i)
                {
                    System.out.print(number);
                    number++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
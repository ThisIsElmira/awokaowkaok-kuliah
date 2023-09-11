import java.util.Scanner;
public class assignmentjb73
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int height;
        do
        {
            System.out.print("Insert the height of the square (min 3, max 9): ");
            height = sc.nextInt();
            if (height >= 3 && height <= 9) break;
            System.out.println("Please insert more than 2 or less than 10!");
        }
        while (true);
        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= height; j++)
            {
                boolean isFirstLasti = i == 1 || i == height;
                boolean isFirstLastj = j == 1 || j == height;
                if (isFirstLasti || isFirstLastj)
                {
                    System.out.print(height + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }   
    }
}
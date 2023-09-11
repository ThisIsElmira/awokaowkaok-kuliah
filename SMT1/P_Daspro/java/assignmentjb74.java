import java.util.Scanner;
public class assignmentjb74
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int height;
        do
        {
            System.out.print("Insert the height of the square (min 5): ");
            height = sc.nextInt();
            if (height >= 5) break;
            System.out.println("Please insert more than 4!");
        }
        while (true);
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < height; j++)
            {
                boolean even = i % 2 == 0;
                System.out.print(even ? height - j : j + 1);
            }
            System.out.println();
        }   
    }
}
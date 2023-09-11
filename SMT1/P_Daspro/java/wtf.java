import java.util.Scanner;
public class wtf
{
    public static void main(String[]args) 
    {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input array row: ");
        a = scan.nextInt();
        System.out.print("Input array column: ");
        b = scan.nextInt();
        int[][] ratings = new int[a][b];
        for (int i = 0; i < ratings.length; i++)
        {
            for (int j = 0; j < ratings[0].length; j++)
            {
                System.out.print("Enter value array [" + i + ", " + j + "]: ");
                ratings[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < ratings.length; i++)
        {
            for (int j = 0; j < ratings[0].length; j++)
            {
                System.out.print(ratings[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
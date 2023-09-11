import java.util.Scanner;
public class Arr3
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        System.out.print("Enter the number of column: ");
        int col = input.nextInt();
        int[][] number = new int [row][col];
        for (int i = 0; i < number.length; i++)
        {
            for (int j = 0; j < number[0].length; j++)
            {
                System.out.print("Enter a number [" + i + "][" + j + "]: ");
                number[i][j] = input.nextInt();
            }
            System.out.println("---------------");
        }
        for (int r[] : number) 
        {
            for (int s : r) 
            {
                System.out.print(s + " ");
            }
            System.out.println("");
        }

        input.close();
    }
}
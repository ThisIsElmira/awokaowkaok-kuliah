import java.util.Scanner;
public class assignmentjb61
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int number, i;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (i=1; i <= number; i++)
        {
            System.out.println(i);
            if (i > number)
            {
                break;
            }
        }
    }
}
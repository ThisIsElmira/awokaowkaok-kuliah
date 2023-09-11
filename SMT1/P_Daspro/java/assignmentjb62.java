import java.util.Scanner;
public class assignmentjb62
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int number, i, k=0;
        float j=0;
        System.out.print("Enter a number range: ");
        number = input.nextInt();
        if (number > 0)
        {
            System.out.println("The number of even numbers from 1 to " + number + " is " + (number/2));
            for (i=1; i <= number; i++)
            {
                if (i % 2 !=0)
                {
                    continue;
                }
                else
                {
                    j++;
                    k += i;
                }
                if (i > number)
                {
                    break;
                }
                System.out.printf("Even number %.0f is " + i + "\n", j);
            }
            System.out.println("The sum of even numbers from 1 to " + number + " is " + k);
            System.out.printf("The average of the even numbers from 1 to " + number + " is %.2f", (k/j));
        }
        else
        {
            System.out.println("The number you entered is invalid");
        }
    }
}
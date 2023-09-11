import java.util.Scanner;
public class jb4assignment1
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int number1, number2;
        System.out.print("Enter number 1: ");
        number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        number2 = input.nextInt();

        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);
        }
        else 
        {
            System.out.println("The largest number is: " + number2);
        }
    }
}
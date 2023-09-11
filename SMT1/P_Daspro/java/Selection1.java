import java.util.Scanner;
public class Selection1
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number:");
        number = input.nextInt();
        
        String output = (number % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(output);
    }
}
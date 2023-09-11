import java.util.Scanner;
public class Selection2
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int score1, score2, avg;
        System.out.print("Enter a score1: ");
        score1 = input.nextInt();

        System.out.print("Enter a score2: ");
        score2 = input.nextInt();

        avg = (score1 + score2) / 2;
        if (avg >= 100)
        {
            avg += 5;
        }
        System.out.println("The final score is " + avg);
    }
}
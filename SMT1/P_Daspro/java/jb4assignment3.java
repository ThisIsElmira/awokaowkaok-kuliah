import java.util.Scanner;
public class jb4assignment3
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        double mid, fin, quiz, asg, total;
        System.out.print("Midterm exam score: ");
        mid = input.nextInt();

        System.out.print("Final exam score: ");
        fin = input.nextInt();

        System.out.print("Quiz score: ");
        quiz = input.nextInt();

        System.out.print("Assignment score: ");
        asg = input.nextInt();

        total = (mid * 3 / 10) + (fin * 4 / 10) + (quiz * 1 / 10) + (asg * 2 / 10);

        if (total < 65)
        {
            System.out.println("Total score is " + total + ", get remedy");
        }
        else
        {
            System.out.println("Total score is " + total + ", passed");
        }
    }
}
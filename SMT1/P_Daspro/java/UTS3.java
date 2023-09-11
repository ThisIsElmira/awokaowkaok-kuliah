import java.util.Scanner;
public class UTS3
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        int pass, i;
        double daily, mid, fin, quiz, total;
        System.out.println("Input the completeness: ");
        pass = input.nextInt();
        for (i = 1; i <= pass; i++)
        {
            System.out.println("Input the daily score: ");
            daily = input.nextDouble();
            System.out.println("Input the middle exam score: ");
            mid = input.nextDouble();
            System.out.println("Input the final score: ");
            fin = input.nextDouble();
            System.out.println("Input the quiz score: ");
            quiz = input.nextDouble();

            daily = (daily * 25)/100;
            mid = (mid * 30)/100;
            fin = (fin * 40)/100;
            quiz = (quiz * 5)/100;

            total = daily + mid + fin + quiz;
            System.out.println("The total score is: " + total);
        
            if (total >= 55 || mid == 100 && fin == 100)
            {
                System.out.println("\nYou are passed, your final score is " + total);
                if (total < 70 && daily > 65 && mid > 65 && fin > 65 && quiz > 65)
                {
                    System.out.println("You enter Software Engineering Major");
                }
                else if (total > 70 && daily > 70 && quiz > 70)
                {
                    System.out.println("You enter Multimedia Major");
                }
                else
                {
                    System.out.println("You enter Information System");
                }
            }
            else 
            {
                System.out.println("You are not passed");
            }
        } 
    }
}
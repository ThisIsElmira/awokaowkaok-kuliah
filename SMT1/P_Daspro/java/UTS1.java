import java.util.Scanner;
public class UTS1
{
    public static void main(String[]args) 
    {
        Scanner input = new Scanner (System.in);
        double daily, mid, fin, quiz, total;
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
    }
}
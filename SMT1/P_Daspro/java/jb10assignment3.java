import java.util.Scanner;
public class jb10assignment3
{
    static Scanner sc = new Scanner (System.in);
    static void testSc(int[] score)
    {
        for (int i = 0; i < score.length; i++)
        {
            System.out.print("Input the score of the student (" + (i+1) + "): ");
            score[i] = sc.nextInt();
        }
    }

    static double avg(int[] score)
    {
        double summary = 0;
        for (int i = 0; i < score.length; i++)
        {
            summary += score[i];
        }
        double average = summary/score.length;
        return average;
    }

    public static void main(String[]args) 
    {
        int[] B = new int [10];
        testSc(B);
        System.out.printf("The average score is %.2f", avg(B));    
    }
}
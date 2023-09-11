import java.util.Scanner;
public class nopalTest
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        boolean jawab;
        System.out.print("1+1 = ");
        jawab = input.nextInt() == 2;
        if (jawab)
        {
            System.out.println("Jawaban kamu benar");
        }
        else
        {
            System.out.println("Jawaban kamu salah");
        }
    }
}
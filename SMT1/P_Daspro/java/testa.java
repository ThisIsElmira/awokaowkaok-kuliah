import java.util.Scanner;
public class testa
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        float n,i,g,a;
        System.out.println("Insert number:");
        n=input.nextFloat();
        i = n + 1;
        g = (n + 2) + i;
        a = (n + 3) + i + g;
        System.out.println("The number is:");
        System.out.println(n);
        System.out.println(i);
        System.out.println(g);
        System.out.println(a);
    }
}
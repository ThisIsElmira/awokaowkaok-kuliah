import java.util.Scanner;
public class jb5asg2
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String food;
        double price, ship;
        boolean isdel;
        System.out.print("Enter a food name: ");
        food = sc.nextLine();
        System.out.print("Enter the food price: IDR ");
        price = sc.nextDouble();
        System.out.print("Do you want express delivery (0 = no, 1 = yes)? ");
        isdel = sc.nextInt() == 1;
        
        ship = price < 100_000 ? 20_000 : 30_000;

        if (isdel)
        {
           ship += 25_000;
        }
        System.out.println("RECEIPT");
        System.out.println(food + "\tIDR " + price);
        System.out.println("Shipping costs\tRp " + ship);
        System.out.println("TOTAL\t\tRp " + (price + ship));
    }
}
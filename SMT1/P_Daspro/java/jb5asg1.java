import java.util.Scanner;
public class jb5asg1
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3;
        System.out.print("Input side 1: ");
        side1 = sc.nextDouble();
        System.out.print("Input side 2: ");
        side2 = sc.nextDouble();
        System.out.print("Input side 3: ");
        side3 = sc.nextDouble();  
        if (side1 == side2 && side1 == side3)
        {
            System.out.println("The triangle is equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1)
        {
            System.out.println("The triangle is isosceles");
        }
        else
        {
            System.out.println("The triangle is abitrary");
        }
    }
}
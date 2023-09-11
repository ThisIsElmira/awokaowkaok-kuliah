//ex4
import java.util.Scanner;

public class triangle
{
	public static void main  (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		int base, height;
		float area;
		
		System.out.println("insert base");
		base=input.nextInt();
		System.out.println("insert height");
		height=input.nextInt();
	
		area=base * height / 2;
		System.out.println("Area of triangle is: " +area);
	}
}
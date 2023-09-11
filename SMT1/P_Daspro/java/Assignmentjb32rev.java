//ex3
import java.util.Scanner;
public class Assignmentjb32rev
{
	public static void main  (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		float cel,r,f,k;
		
		System.out.println("insert temperature in celcius");
		cel=input.nextFloat();
		
		r= 4 * cel / 5;
		f= (cel * 9 / 5) + 32;
		k= cel + 273;
		
		System.out.println("Celcius = " +cel+ " C");
		System.out.println("Reamur = " +r+ " R");
		System.out.println("Fahrenheit = " +f+ " F");
		System.out.println("Kelvin = " +k+ " K");
	}
}
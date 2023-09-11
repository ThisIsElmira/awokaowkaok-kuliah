import java.util.Scanner;

public class task1 
{
	public static void main  (String[]args) 
	{
	Scanner input= new Scanner(System.in);
	
	int p,w,L;
	System.out.println("Panjang persegi panjang");
	p=input.nextInt();
	
	System.out.println("lebar persegi panjang");
	w=input.nextInt();
	
	L=p*w;
	
	System.out.println("Luas persegi panjang = " +L);
	}
}
	
	
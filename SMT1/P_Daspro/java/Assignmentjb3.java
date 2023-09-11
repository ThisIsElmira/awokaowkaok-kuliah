//ex3
public class Assignmentjb3
{
	public static void main  (String[]args) 
	{
		String campus = "Polinema";
		int grade = 1;
		char cl = 'I'; //intial value = your class
		byte in = 10;
		float number = 3.33333F;
		char ch = 'C';
		System.out.println("I am " + campus+ " student, class " +grade + cl);
		System.out.println("I'm learning to display values:");
		System.out.println(String.format("Floating point %.2f", number));
		System.out.println("Character " +ch);
	}
}
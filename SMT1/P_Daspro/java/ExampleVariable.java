//ex1
public class ExampleVariable 
{
	public static void main  (String[]args) 
	{
		String Hobby = "Playing futsal";
		boolean isSmart = true;
		char gender = 'M';
		byte age = 20;
		double gpa = 3.38, height = 1.68;
		System.out.println(Hobby);
		System.out.println("Are you smart ? " +isSmart);
		System.out.println("Gender: " +gender);
		System.out.println("My current age is " +age);
		System.out.println(String.format("My GPA is %s and my height is %s meters", gpa, height));
	}
}

public class Circle
{
    static double areaCircle(double pi, double r)
    {
        double area = pi * (r * r);
        return area;
    }
    static double circumCircle(double pi, double r)
    {
        double circum = pi * (2 * r);
        return circum;
    }

    public static void main(String[]args) 
    {
        double a = (areaCircle(Math.PI, 7));
        double c = (circumCircle(Math.PI, 7)); 
        System.out.print("The area of circle is " + a + " and the circumference is " + c);    
    }
}
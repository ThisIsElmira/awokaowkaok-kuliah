package Lat2;

public class Square
{
    public int side;

    public int area()
    {
        return side * side;
    }

    public int perimeter()
    {
        return 4 * side;
    }

    public static void main(String[] args)
    {
        Square s = new Square();
        s.side = 5;
        System.out.println("Side: " + s.side);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());
    }
}

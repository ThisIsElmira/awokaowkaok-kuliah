public class uiop
{
    static int areaformula(int length, int wide)
    {
        int area = (length * wide);
        return area;
    }
    static int volumeformula(int area, int height)
    {
        int volume = (area * height);
        return volume;
    }

    public static void main(String[] args)
    {
        int length = 5, wide = 10, height = 7;
        System.out.print("The surface area of the block is " + area);
        System.out.print("The volume of the block is " + volume);
    }
}
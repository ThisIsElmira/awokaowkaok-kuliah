public class jb10assignment1
{
    static int Max3(int bil1, int bil2, int bil3)
    {
        int maxNumber = bil1;
        if (bil2 > maxNumber)
        {
            maxNumber = bil2;
        }
        if (bil3 > maxNumber)
        {
            maxNumber = bil3;
        }
        return maxNumber;
    }

    public static void main(String[]args) 
    {
        int maxNumber = Max3(30, 69, 42);
        System.out.print("The larges number is: " + maxNumber);
    }    
}
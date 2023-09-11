public class Arr2
{
    public static void main(String[]args)
    {
        int[][] number = new int [2][4];
        number[0][0] = 12;
        number[0][1] = 14;
        number[0][2] = 34;
        number[1][0] = 20;
        number[1][1] = 24;
        number[1][2] = 67;
        number[0][3] = 58;
        number[1][3] = 69;
        for (int array[] : number)
        {
            for (int r : array)
            {
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}
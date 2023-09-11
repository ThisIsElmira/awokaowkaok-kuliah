mport java.util.Scanner;
public class test1233
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        String "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Satruday";
        int day = 1, month = 0, num = 1;
        while (day < 365)
        {             
            day++;
            num++;
            if (day % 7 == 1)
            {
                day = "Sunday"
            }
            else if (day % 7 == 2)
            {
                System.out.print(" Monday\n");
            }
            else if (day % 7 == 3)
            {
                System.out.print(" Tuesday\n");
            }
            else if (day % 7 == 4)
            {
                System.out.print(" Wednesday\n");
            }
            else if (day % 7 == 5)
            {
                System.out.print(" Thursday\n");
            }
            else if (day % 7 == 6)
            {
                System.out.print(" Friday\n");
            }
            else if (day % 7 == 0)
            {
                System.out.print(" Saturday\n");
            }
        }
        while (num < 32)
        {
            while (month < 13)
            {
            month++;
            if (month == 1)
                {
                    System.out.print("January \n");
                }
            }
        }
        
import java.util.Scanner;
public class dateTest
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int day = 1, month = 0, num = 1;
        while (num < 32)
        {
            while (month < 13)
            {
            month++;
            if (month == 1)
                {
                    System.out.print("January \n");
                    while (day < 32)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }                
                if (month == 2)
                {
                    num = 1;
                    System.out.print("\nFebruary \n");
                    while (day > 31 && day < 61)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 3)
                {
                    num = 1;
                    System.out.print("\nMarch \n");
                    while (day > 59 && day < 91)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 4)
                {
                    num = 1;
                    System.out.print("\nApril \n");
                    while (day > 90 && day < 1)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 5)
                {
                    num = 1;
                    System.out.print("\nMay \n");
                    while (day > 118 && day < 149)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 6)
                {
                    num = 1;
                    System.out.print("\nJune \n");
                    while (day > 148 && day < 178)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 7)
                {
                    num = 1;
                    System.out.print("\nJuly \n");
                    while (day > 177 && day < 209)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 8)
                {
                    num = 1;
                    System.out.print("\nAugust \n");
                    while (day > 208 && day < 239)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 9)
                {
                    num = 1;
                    System.out.print("\nSeptember \n");
                    while (day > 238 && day < 268)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 10)
                {
                    num = 1;
                    System.out.print("\nOctober \n");
                    while (day > 267 && day < 298)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 11)
                {
                    num = 1;
                    System.out.print("\nNovember \n");
                    while (day > 297 && day < 327)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
                if (month == 12)
                {
                    num = 1;
                    System.out.print("\nDecember \n");
                    while (day > 326 && day < 357)
                    {
                        System.out.print(num);
                        day++;
                        num++;
                        if (day % 7 == 1)
                        {
                            System.out.print(" Sunday\n");
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
                }
            }
            break;
        }
    }
}
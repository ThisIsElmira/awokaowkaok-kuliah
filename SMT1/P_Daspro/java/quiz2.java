import java.util.Scanner;
public class quiz2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String[] item = {"Book", "Pencil", "Computer"};
        int[] prices = {20_000, 5000, 5_000_000};

        int total[][] = new int[item.length][2];
        for (int i = 0; i < item.length; i++)
        {
            System.out.print("Enter Total Stock of " + item[i] + ": ");
            total[i][0] = sc.nextInt();
            System.out.print("Enter Damaged Stock of " + item[i] + ": ");
            total[i][1] = sc.nextInt();
        }
        
        //ini editan
        // System.out.println("");
        
        // System.out.println("\t\tTotal Stock\tDamaged Stock");
        // System.out.println(item[0] + "\t\t" + total[0][0] + "\t\t" + total[0][1]);
        // System.out.println(item[1] + "\t\t" + total[1][0] + "\t\t" + total[1][1]);
        // System.out.println(item[2] + "\t" + total[2][0] + "\t\t" + total[2][1]);
        // System.out.println("");
        
        System.out.println();
        String[] stocks = {"Total Stock", "Damaged Stock"};
        System.out.printf("%-10s", "");
        for (String type : stocks) {
            System.out.printf("%-13s", type);
        }
        System.out.println();
        for (int row = 0; row < total.length; row++){
            System.out.printf("%-15s", item[row]);
            for (int col = 0; col < total[row].length; col++){
                System.out.printf("%-13d", total[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        //sampe sini

        int total_borrow = 0;
        for (int i = 0; i < item.length; i++)
        {
            int borrow = total[i][0] - total[i][1];
            System.out.println("The total of " + item[i] + " that can be borrowed is " + borrow);
            total_borrow += borrow;
        }
        
        System.out.println("The total item that can be borrowed is " + total_borrow);
        System.out.println("");
        
        int total_turnover = 0;
        for (int i = 0; i < item.length; i++)
        {
            int borrow = total[i][0] - total[i][1];
            int turnover = borrow * prices[i];
            System.out.println("The turnover for " + item[i] + " is " + turnover);
            total_turnover += turnover;
        }
        System.out.println("The total turnover is " + total_turnover);

        System.out.println("");
        int mostBorrowed = 0;
        int mostBorrowedPosition = 0;
        for (int i = 0; i < item.length; i++)
        {
            int borrow = total[i][0] - total[i][1];
            if (borrow > mostBorrowed)
            {
                mostBorrowed = borrow;
                mostBorrowedPosition = i;
            }
        }
        System.out.printf("The most stock items that can be borrowed is %s", item[mostBorrowedPosition]);
    }
}
public class latihan1 
{
    public static void main(String[] args) 
    {
        int[][] books = {
                { 8, 9, 5, 2 },
                { 7, 5, 10, 3 },
                { 4, 6, 6, 5 },
        };
        int[] price = { 40000, 28000, 60000, 75000 };
        String[] names = { "Dieng", "Soehat", "Sengkaling" };

        for (int row = 0; row < books.length; row++) 
        {
            int totalBookSold = 0;
            for (int col = 0; col < books[row].length; col++) 
            {
                totalBookSold += books[row][col];
            }
            System.out.printf("Buku yg terjual pada cabang %s adalah sebanyak %d\n", names[row], totalBookSold);
        }

        System.out.println("====================");

        int overallTotal = 0;
        for (int row = 0; row < books.length; row++) {
            int totalProfit = 0;
            for (int col = 0; col < books[row].length; col++) {
                totalProfit += books[row][col] * price[col];
            }
            overallTotal += totalProfit;
            System.out.printf("Total pemasukan pada cabang %s adalah sebanyak %d\n", names[row], totalProfit);
        }
        System.out.printf("Total pemasukan seluruh cabang adalah sebanyak %d\n", overallTotal);

        System.out.println("====================");

        String highestSoldBranchName = "";
        int previousHighest = 0;
        for (int row = 0; row < books.length; row++) {
            int totalProfit = 0;
            for (int col = 0; col < books[row].length; col++) {
                totalProfit += books[row][col] * price[col];
            }
            if (totalProfit > previousHighest) {
                highestSoldBranchName = names[row];
                previousHighest = totalProfit;
            }
        }
        System.out.printf("Cabang dengan pemasukan tertinggi adalah %s dengan pemasukan sebanyak %d\n",
                highestSoldBranchName, previousHighest);
    }
}
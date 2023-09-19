package task;

public class VideoGame
{
    public String id, namaMember, namaGame;
    public double harga;

    public void printData()
    {
        System.out.println("ID\t\t\t: " + id);
        System.out.println("Nama\t\t: " + namaMember);
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Harga\t\t: Rp " + harga);
    }

    public double totalHarga(double sewa)
    {
        harga *= sewa;
        return harga;
    }
}

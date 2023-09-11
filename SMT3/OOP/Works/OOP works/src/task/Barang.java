package task;

public class Barang
{
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual()
    {
        return hargaDasar - ((int)(diskon * hargaDasar));
    }

    public void tampilData()
    {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Dasar\t: " + hargaDasar);
        System.out.println("Harga Jual\t: " + hitungHargaJual());
    }
}

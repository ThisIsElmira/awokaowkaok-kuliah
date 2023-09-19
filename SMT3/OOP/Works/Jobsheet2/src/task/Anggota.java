package task;

public class Anggota
{
    private String nama;
    private String code;
    private float pinjaman, jumlahPinjaman;

    Anggota(String code, String nama, int pinjaman)
    {
        this.code = code;
        this.nama = nama;
        this.pinjaman = pinjaman;
    }


    public String getNama()
    {
        return nama;
    }

    public void angsur(float uang)
    {
        if (uang < pinjaman*0.1) System.out.println("Maaf, angsuran minimal 10%");
        else jumlahPinjaman -= uang;
    }

    public float getLimitPinjaman()
    {
        return pinjaman;
    }

    public float getJumlahPinjaman()
    {
        return jumlahPinjaman;
    }

    public void pinjam(float pinjam)
    {
        if (pinjam > pinjaman) System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        else jumlahPinjaman += pinjam;
    }


}

package task;

import java.util.Scanner;

public class TestKoperasi
{
    public static void main(String[] args)
    {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pinjaman: ");
        float pinjaman = input.nextFloat();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan Angsuran: ");
        float angsuran = input.nextFloat();
        donny.angsur(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}

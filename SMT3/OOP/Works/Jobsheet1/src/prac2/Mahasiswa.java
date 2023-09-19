package prac2;

public class Mahasiswa
{
    public int nim;
    public String nama, alamat, kelas;

    public void tampilBiodata()
    {
        System.out.println("Nim\t\t: " + nim);
        System.out.println("Name\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Kelas\t: " + kelas);
    }
}

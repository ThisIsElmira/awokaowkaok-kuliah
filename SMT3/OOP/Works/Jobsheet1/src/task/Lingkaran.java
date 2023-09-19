package task;

public class Lingkaran
{
    public double phi, r;

    double hitungLuas(double phi, double r)
    {
        double L = phi * r * r;
        return L;
    }

    double hitungKeliling(double phi, double r)
    {
        double K = phi * r * 2;
        return K;
    }
}

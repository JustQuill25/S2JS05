package minggu5;

public class Perusahaan {
    private String nama;
    private double[] keuntungan;

    public Perusahaan(String nama, double[] keuntungan) {
        this.nama = nama;
        this.keuntungan = keuntungan;
    }

    public double hitungTotalKeuntungan() {
        double total = 0;
        for (double untung : keuntungan) {
            total += untung;
        }
        return total;
    }

    public String getNama() {
        return nama;
    }
}

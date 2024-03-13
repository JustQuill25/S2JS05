package minggu5;

import java.util.Scanner;

public class MainPerusahaan01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan : ");
        int jumlahPerusahaan = sc.nextInt();
        sc.nextLine();

        System.out.println("============ HITUNG KEUNTUNGAN PERUSAHAAN ============");
        Perusahaan[] perusahaan = new Perusahaan[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + " : ");
            String namaPerusahaan = sc.nextLine();

            System.out.print("Masukkan jumlah bulan keuntungan perusahaan : ");
            int jumlahBulan = sc.nextInt();
            double[] keuntungan = new double[jumlahBulan];

            System.out.println("Masukkan keuntungan per bulan untuk perusahaan " + namaPerusahaan + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Keuntungan bulan ke-" + (j + 1) + ": ");
                System.out.print("");
                keuntungan[j] = sc.nextDouble();
            }
            sc.nextLine();

            perusahaan[i] = new Perusahaan(namaPerusahaan, keuntungan);
            System.out.println("==============================================");
        }

        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = perusahaan[i].hitungTotalKeuntungan();
            System.out
                    .println("Total keuntungan perusahaan " + perusahaan[i].getNama() + " adalah: " + totalKeuntungan);
        }
        System.out.println("=============================================");
    }
}

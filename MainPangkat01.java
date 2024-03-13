package minggu5;

import java.util.Scanner;

public class MainPangkat01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat01[] png = new Pangkat01[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat01(nilai, pangkat);
        }

        System.out.println("==============================================");
        System.out.println("Pilih metode yang akan dijalankan:");
        System.out.println("1. Pangkat Brute Force");
        System.out.println("2. Pangkat Divide and Conquer");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = sc.nextInt();

        System.out.println("==============================================");
        if (pilihan == 1) {
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
        } else if (pilihan == 2) {
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        System.out.println("==============================================");
    }
}

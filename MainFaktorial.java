package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+ " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=====================================================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        long startTimeBF = System.nanoTime();
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+ fk[i].faktorialBF(fk[i].nilai));
        }
        long endTimeBF = System.nanoTime();
        System.out.println("Brute Force execution time for n=" + elemen + ": " + (endTimeBF - startTimeBF) + " seconds");

        System.out.println("=====================================================================");
        System.out.println("Hasil faktorial dengan Devide and Conquer");

        long startTimeDC = System.nanoTime();
        for (int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+ fk[i].faktorialDC(fk[i].nilai));
        }
        long endTimeDC = System.nanoTime();
        System.out.println("Devide and Conquer execution time for n=" + elemen + ": " + (endTimeDC - startTimeDC) + " seconds");

        System.out.println("=====================================================================");
    }
}
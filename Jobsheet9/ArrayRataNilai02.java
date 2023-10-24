package Jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai02{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int [] nilaiMHS;
        double totalLulus = 0, totalTdkLulus = 0, rataLulus, rataTdkLulus;
        int lulus = 0, tdkLulus = 0;

        System.out.printf("Masukkan jumlah mahasiswa: ");
        int x = input.nextInt();
        nilaiMHS = new int[x];

        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.printf("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMHS[i] = input.nextInt();
            if (nilaiMHS[i] > 70) {
            lulus++;
            totalLulus+=nilaiMHS[i];
            } else {
            tdkLulus++;
            totalTdkLulus+=nilaiMHS[i];
            }
        }

        rataLulus = totalLulus/lulus;
        rataTdkLulus = totalTdkLulus/tdkLulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rataTdkLulus);
        input.close();

    }
}
package Jobsheet14;
import java.util.Scanner;

public class Marmut {

    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;  
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan: ");
        int bulan = input.nextInt();

        System.out.println("Jumlah pasangan marmut setiap bulan:");
        for (int i = 1; i <= bulan; i++) {
            int jumlahPasanganMarmut = hitungPasanganMarmut(i);
            System.out.printf("%-20s: %d\n", "Bulan ke-" + i, jumlahPasanganMarmut);
            input.close();
        }
    }
}

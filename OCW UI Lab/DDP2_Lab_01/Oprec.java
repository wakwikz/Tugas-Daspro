package DDP2_Lab_01;
import java.util.Scanner;
public class Oprec {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String nama;
        int keinginan;

        System.out.println("Kamu ingin ikut oprec apa? ");
        nama = input.next();
        System.out.println("Seberapa ingin kamu ikut oprec tersebut (0-100)");
        keinginan = input.nextInt();

        if (keinginan >=75) {
            System.out.println("Selamat kamu berhasil diterima " +nama);
        } else {
            System.out.println("Maaf, kamu belum dapat diterima di " +nama);
        }
    }
}

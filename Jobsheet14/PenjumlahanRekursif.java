package Jobsheet14;
import java.util.Scanner;

public class PenjumlahanRekursif {

    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int hasil = penjumlahanRekursif(n);

        System.out.println("Penjumlahan dari 1 + 2 + ... + " + n + " = " + hasil);
        input.close();
    }
}

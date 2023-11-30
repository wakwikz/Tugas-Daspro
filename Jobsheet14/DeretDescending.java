package Jobsheet14;
import java.util.Scanner;

public class DeretDescending {

    // Fungsi Rekursif
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }

    // Fungsi Iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.print("Deret Descending (Rekursif): ");
        deretDescendingRekursif(n);
        System.out.println();  

        System.out.print("Deret Descending (Iteratif): ");
        deretDescendingIteratif(n);
        input.close();
    }
}

package Jobsheet14;
import java.util.Scanner;

public class CekPrimaRekursif {

    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;  
        } else {
            // 
            if (n % i == 0) {
                return false;
            }
            else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        boolean hasil = cekPrimaRekursif(n, n / 2);

        if (hasil) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
        input.close();
    }
}

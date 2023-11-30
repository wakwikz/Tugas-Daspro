package Jobsheet14;
import java.util.Scanner;
public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0) { // base case
            return (saldo) ;
        } else { // recursive case
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Saldo awal: ");
        double saldo = input.nextDouble();
        System.out.print("Lama menabung (tahun): ");
        int tahun = input.nextInt();

        System.out.println("Saldo akhir setelah " + tahun + " tahun adalah: " + hitungLaba(saldo, tahun));
        input.close();
    }
}

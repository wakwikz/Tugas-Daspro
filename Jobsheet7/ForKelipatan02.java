package Jobsheet7;
import java.util.Scanner;
public class ForKelipatan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kelipatan, jumlah=0, counter=0;
        double rerata;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input.nextInt();

        for (int i=1; i<=50; i++){
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan, counter );
        System.out.printf("Jumlah bilangan kelipatan %d dari 1 sampai 50 adlaah %d\n",kelipatan, jumlah);

        if (counter > 0) {
            rerata = (double) jumlah / counter;
            System.out.println("Rata-rata dari bilangan kelipatan "+ kelipatan + " adalah " +rerata);
        } else {
            System.out.println("Tidaka ada bilangan kelipatan " + kelipatan + " ditemukan ");
        }
    input.close();
    }
}
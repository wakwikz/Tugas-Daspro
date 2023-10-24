package Jobsheet9;
import java.util.Scanner;
public class ArrTugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] isi;
        double rata2 = 0;
        int total = 0;

        System.out.printf("Masukkan jumlah array: ");
        int x = input.nextInt();
        isi = new int[x];

        for (int i = 0; i < isi.length; i++){
            System.out.printf("Masukkan array ke-"+(i+1)+ " : ");
            isi[i] = input.nextInt();
            total += isi[i];
            rata2 = total/isi.length;
        }
        
        int max = isi[0];

        for (int i = 1; i < isi.length; i++) {
            if (isi[i] > max) {
                max = isi[i];
            }
        }

        int min = isi[0];

        for (int i = 0; i < isi.length; i++) {
            if (isi[i] < min ){
                min = isi[i];
            }
        }

        System.out.println("Rata-rata : "+rata2);
        System.out.println("Nilai terbesar adalah : "+max);
        System.out.println("Nilai terbesar adalah : "+min);
        input.close();
    }
}

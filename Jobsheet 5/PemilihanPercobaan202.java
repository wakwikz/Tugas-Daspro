import java.util.Scanner;
public class PemilihanPercobaan202 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float uas, uts, kuis, tugas, total;
        

        System.out.println("Nilai uas      :");
        uas = input.nextFloat();
        System.out.println("Nilai uts      :");
        uts = input.nextFloat();
        System.out.println("Nilai kuis     :");
        kuis = input.nextFloat();
        System.out.println("Nilai tugas    :");
        tugas = input.nextFloat();

        total = (uas*0.4F)+(uts*0.3F)+(kuis*0.1F)+(tugas*0.2F);
        
        if (total>80 && total<=100){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda A, Sangat Baik");
        } else if (total>73 && total<=80){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda B+, Lebih dari Baik");
        } else if (total>65 && total<=73){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda adalah B, Baik");
        } else if (total>60 && total<=65){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda C+, Lebih dari Cukup");
        } else if (total>50 && total<=60){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda adalah C, Cukup");
        } else if (total>39 && total<=50){
            System.out.println("Nilai akhir = " + total +  " Sehingga Nilai anda D,, Kurang");
        } else {
            System.out.println("Nilai akhir = " + total + "Sehingga Nilai anda E, Gagal");
        }
    }
}

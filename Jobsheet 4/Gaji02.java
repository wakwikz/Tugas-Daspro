import java.util.Scanner;
public class Gaji02{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, totGaji, gaji, potGaji;

        System.out.println("Berapa Gaji Anda? " );
        gaji=input.nextInt();
        System.out.println("Berapa PotGaji Anda ");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        jmlTdkMasuk=input.nextInt();

        totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " + totGaji);

        input.close();

    }
    
}

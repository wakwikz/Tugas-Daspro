import java.util.Scanner;
public class HargaBayar02{
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);

        int harga, jumlah;
        double disc, total, bayar, jmlDisc;

        System.out.println("Masukkan merk buku " );
        String merk = input.next();
        System.out.println("Masukkan jumlah halaman buku ");
        int jumlahHalaman = input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon ");
        disc=input.nextDouble();

        total = harga*jumlah;
        jmlDisc= total*disc;
        bayar= total-jmlDisc;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDisc);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

        input.close();

        
    }
}
package Jobsheet13;
import java.util.Scanner;

public class UcapanTerimaKasih02 {
    public static String penerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tuliskan Nama Penerima Ucapan: ");
        String nama = input.nextLine();
        input.close();
        return nama;
    }

    public static String UcapanTambahan(String tambahan){
        return tambahan;
    }

    public static void UcapanTerimaKasih(){
        String nama = penerimaUcapan();
        System.out.println("Terima kasih " + nama + " telah menggunakan program ini");
        
        // Memanggil fungsi UcapanTambahan() dengan parameter ucapan tambahan
        String ucapanTambahan = UcapanTambahan("Semoga harimu menyenangkan!");
        System.out.println(ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}

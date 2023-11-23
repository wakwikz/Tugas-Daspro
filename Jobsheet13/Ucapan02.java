package Jobsheet13;

import java.util.Scanner;

public class Ucapan02 {
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tuliskan Nama Penerima Ucapan: ");
        String nama = input.nextLine();
        input.close();
        return nama;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Terima kasih " + nama + " telah menggunakan program ini");
    }
}

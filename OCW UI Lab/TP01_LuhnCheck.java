import java.util.Scanner;

import javax.xml.transform.Source;
public class TP01_LuhnCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isValid;
        int sumOfDoubleEvenPlace = 0, sumOfOddPlace = 0, getSize, nilai;
        String nomorKartu;

        System.out.println("Masukkan nomor kartu kredit sebagai sebuah bilangan bulat long: ");
        nomorKartu = input.next();

        for (int i = nomorKartu.length(); i > 0; i-=2){
            char digit = nomorKartu.charAt(i-2);
            nilai = Character.getNumericValue(digit);
            //System.out.println("Nilai digit ke-" + (i-1) + ": " + nilai);
            nilai*=2;
            //System.out.println("Nilai digit ke-" + (i-1) + " setelah dikali 2: " + nilai);
            if (nilai > 9){
                int getDigit = 0;
                while (nilai>0){
                    getDigit += nilai % 10;
                    nilai /= 10;
                }
            //System.out.println("Total digit yang dijumlahkan " +totalDigit);
            nilai = getDigit;
            }
        sumOfOddPlace += nilai;
        }
        System.out.println("Total penjumlahan digit ganjil dari kanan ke kiri " +sumOfOddPlace);

        for (int i = nomorKartu.length(); i > 0; i-=2){
            char digit = nomorKartu.charAt(i-1);
            nilai = Character.getNumericValue(digit);
            //System.out.println(nilai);
            sumOfDoubleEvenPlace += nilai;
        }
        System.out.println("Total penjumlahan digit genap dari kanan ke kiri "+sumOfDoubleEvenPlace);

        getSize = sumOfDoubleEvenPlace + sumOfOddPlace;
        System.out.println("Penjumlahan Digit genap dan ganjil "+getSize);

        isValid = getSize % 10 == 0;
        if (isValid) {
            System.out.println("Nomor Kartu Anda Valid");
        } else {
            System.out.println("Nomor Kartu Anda Tidak Valid");
        }
    }
}
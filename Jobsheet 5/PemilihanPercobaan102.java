import java.util.Scanner;
public class PemilihanPercobaan102 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka:");
        angka =  input.nextInt();

        String result = (angka%2==0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(result);
        input.close();
    }
    }
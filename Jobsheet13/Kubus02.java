package Jobsheet13;
import java.util.Scanner;
public class Kubus02 {
    public static double hitungVolume(int sisi){
        return (sisi * sisi * sisi);
    }
    public static double hitungLuasPermukaan(int sisi){
        return (6 * sisi * sisi);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();
        System.out.println("Volume kubus: " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
        input.close();
    }
}

package Jobsheet13;
import java.util.Scanner;

public class Percobaan602 {
    static int hitungLuas(int p, int l){
        int L = p * l;
        return L;
    }
    static int hitungVolume(int p, int l, int t){
        int V = hitungLuas(p, l) * t;
        return V;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, V;
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        L = hitungLuas(p, l);
        System.out.println("Luas: " + L);
        V = hitungVolume(p, l, t);
        System.out.println("Volume: " + V);
        input.close();
    }
}

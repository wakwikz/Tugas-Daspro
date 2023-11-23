package Jobsheet13;
import java.util.Scanner;   
public class Pesan {
    static String pesanAnda(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan pesan : ");
        String pesan = sc.nextLine();
        sc.close();
        return pesan;
    }
    public static void main(String[] args) {
        String pesan = pesanAnda();
        System.out.println("Pesan yang anda masukkan adalah : " + pesan);
    }
}

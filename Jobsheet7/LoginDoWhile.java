package Jobsheet7;
import java.util.Scanner;
public class LoginDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        boolean berhasil=false;
        String username, password;
        while (berhasil == false){
        System.out.println("Masukkan username: ");
        username = input.nextLine();
        System.out.println("Masukkan password: ");
        password = input.nextLine();
        if (username.equals("hq") && password.equals("123")) {
            berhasil = true;
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login tidak berhasil");
          }
        }
    }
}
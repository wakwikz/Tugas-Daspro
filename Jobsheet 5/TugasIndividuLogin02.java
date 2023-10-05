import java.util.Scanner;
public class TugasIndividuLogin02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username, password;

        System.out.println("Masukkan username: ");
        username = input.nextLine();
        System.out.println("Masukkan password: ");
        password = input.nextLine();
        
        if (username.equals("hq") && password.equals("123")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login tidak berhasil");
        }
    }
}

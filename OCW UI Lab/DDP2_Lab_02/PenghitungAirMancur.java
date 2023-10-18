package DDP2_Lab_02;
import java.util.Scanner;
public class PenghitungAirMancur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tiles;
        int diameter, keliling, jumlah=0;

        System.out.println("Masukkan teks yang akan diukir: ");
        tiles = input.nextLine();

        for (int i = 0; i<tiles.length(); i++){
            char chara = tiles.charAt(i);
            if (Character.isUpperCase(chara)) {
                jumlah += 3;
            } else if (Character.isLowerCase(chara)) {
                jumlah += 1;
            } else {
                jumlah +=2;
            }
        }
        System.out.println("Jumlah dari string tersebut: " +jumlah);
        
        keliling = jumlah;

        diameter = (int) Math.round(keliling/Math.PI);

        System.out.println("Sehingga anda membutuhkan lebar lahan minimal: " + diameter + "tiles");
    input.close();
    }
}

package Jobsheet13;

public class Percobaan6Nomor2 {
    public static void TampilHinggaKei(int i){
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
    public static int Jumlah(int bil1, int bil2){
        return (bil1 + bil2);
    }
    public static void TampilJumlah(int bi1, int bil2){
        TampilHinggaKei(Jumlah(bi1, bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1, 2);
        TampilJumlah(temp, 5);
    }
}

import java.util.Scanner;
public class Pemilihan2Percobaan102{
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        
        int tahun; 

        System.out.println("Masukkan Tahun: ");
        tahun = input02.nextInt();

        if (tahun%4 == 0){
            if (tahun%100 == 0){
                if (tahun%400 == 0){
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        } 
        }else{
            System.out.println("Tahun");
        }
    }
}
}
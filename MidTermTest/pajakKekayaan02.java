package MidTermTest;
import java.util.Scanner;
public class pajakKekayaan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        String usaha, berkeluarga, pendidikanAnak, tipeHarta, namaHarta;
        double totalPajak = 0, hartaKekayaan = 0, penghasilan = 0;
        int jumlahAnakKuliah = 0, jumlahAnakSMA = 0, hargaJual = 0, hartaBergerak,  hartaTdkGerak;
        
        System.out.println("Apakah anda memiliki usaha? (Ya/Tidak): ");
        usaha = input.next();

        if (usaha.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan penghasilan dalam 1 tahun : ");
            penghasilan = input.nextDouble();
            totalPajak += penghasilan * 0.15;
            penghasilan -= totalPajak;
            System.out.println("Penghasilan anda setelah dikurangi pajak: "+penghasilan);
        }

        System.out.print("Masukkan jenis harta kekayaan yang Anda miliki (Bergerak/Tidak): ");
        tipeHarta = input.next();

        if (tipeHarta.equalsIgnoreCase("Bergerak")) {
            System.out.println("Berapa harta bergerak yang anda miliki");
            hartaBergerak = input.nextInt();
            for (int i = 0; i < hartaBergerak; i++){
                System.out.println("Nama harta bergerak ke-"+(i+1)+ " :");
                namaHarta = input.next();
                System.out.println("Berapa harga jual "+namaHarta+ " tersebut saat ini?");
                hargaJual = input.nextInt();
                hartaKekayaan = penghasilan + hargaJual;
                System.out.println("Harta Kekayaan anda " +hartaKekayaan);
            }
        } else if (tipeHarta.equalsIgnoreCase("Tidak")){
            System.out.println("Berapa harta tidak bergerak yang anda miliki");
            hartaTdkGerak = input.nextInt();
            for (int i = 0; i < hartaTdkGerak; i++){
                System.out.println("Nama harta tidak bergerak ke-"+(i+1)+ " :");
                namaHarta = input.next();
                System.out.println("Berapa harga jual "+namaHarta+ " tersebut saat ini?");
                hargaJual = input.nextInt();
                hartaKekayaan = penghasilan + hargaJual;
                System.out.println("Harta Kekayaan anda " +hartaKekayaan);
            }
        }

        System.out.println("Apakah anda sudah berkeluarga? (Ya/Tidak):");
        berkeluarga = input.next();

        if (berkeluarga.equalsIgnoreCase("Ya")) {
            System.out.println("Berapa jumlah anak anda: ");
            int jumlahAnak = input.nextInt();
            for (int i = 0; i < jumlahAnak; i++){
                System.out.println("Apa pendidikan anak anda ke-"+(i+1));
                pendidikanAnak=input.next();

                if (pendidikanAnak.equalsIgnoreCase("kuliah")){
                    jumlahAnakKuliah++;
                } else if (pendidikanAnak.equalsIgnoreCase("sma")){
                    jumlahAnakSMA++;
                }
                if (jumlahAnakKuliah == 1 && jumlahAnakSMA==1 && hartaKekayaan >= 50){
                    totalPajak *= 0.9;
                } else if (jumlahAnakKuliah==0 && jumlahAnakSMA==0 && hartaKekayaan <= 50 ) {
                totalPajak *= 0.95;
                }
            }
            
        System.out.println("total pajak yang harus dibayar: "+totalPajak);
        }
    }
}
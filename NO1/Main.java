//import java.util.Scanner diperlukan untuk menerima inputan dari user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Membuat objek Scanner yang digunakan untuk menerima inputan dari pengguna
        Scanner myscanner = new Scanner(System.in);

//        Meminta pengguna untuk memasukkan informasi mengenai Pesawat
        System.out.print("Masukkan nama pesawat         : ");
        String nama = myscanner.nextLine();
        System.out.print("Masukkan nomor penerbangan    : ");
        String nomor = myscanner.nextLine();
        System.out.print("Masukkan asal penerbangan     : ");
        String asal = myscanner.nextLine();
        System.out.print("Masukkan tujuan penerbangan   : ");
        String tujuan = myscanner.nextLine();

//        Membuat objek Pesawat berdasarkan hasil inputan yang telah diberikan user
        Pesawat mypesawat = new Pesawat(nama, nomor, asal, tujuan);

//        Menampilkan informasi Pesawat
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                                  INFORMASI PESAWAT                                      ");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(mypesawat);

//        Memanggil method terbang(nomor) dan terbang_rute(nomor, asal, tujuan) di objek Pesawat
        mypesawat.terbang(nomor);
        mypesawat.terbang_rute(nomor, asal, tujuan);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
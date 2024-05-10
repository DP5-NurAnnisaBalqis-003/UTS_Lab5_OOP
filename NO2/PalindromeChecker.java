//import java.util.Scanner diperlukan untuk menerima inputan dari user
import java.util.Scanner;

//Mendefinisikan kelas PalindromeChecker
public class PalindromeChecker {
//    Mendefinisikan isPalindrome untuk menerima string dan mengembalikan nilai boolean (untuk true or false)
    public static boolean isPalindrom(String str){

//        Menghapus spasi yang ada dan mengubah string menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();

//        Membalikkan string dengan StringBuilder untuk memanipulasi string agar saat dibalik menjadi string juga
        String reversed = new StringBuilder(str).reverse().toString();

//        Memeriksa apakah string yang di input oleh user jika dibalik akan tetap sama atau tidak
        return str.equals(reversed);
    }

    public static void main(String[] args){
//      Membuat objek Scanner yang digunakan untuk menerima inputan dari pengguna
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Masukkan string   : ");
        String inputString = myscanner.nextLine();

//        Memanggil isPalindrome untuk memeriksa kembali apakah string yang di input merupakan Palindrome atau tidak
        boolean isPalindrome = isPalindrom(inputString);
        if(isPalindrome){
            System.out.println("String yang Anda masukkan merupakan Palindrome."); }
                else{
                    System.out.println("String yang Anda masukkan bukan Palindrome.");
                }
//                Menutup objek myscanner
        myscanner.close();
    }
}

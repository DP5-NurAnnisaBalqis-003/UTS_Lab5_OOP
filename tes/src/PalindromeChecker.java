import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah string menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Membalik string
        String reversed = new StringBuilder(str).reverse().toString();

        // Mengecek apakah string sama dengan string yang dibalik
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan string: ");
        String inputString = scanner.nextLine();

        // Memeriksa apakah string merupakan palindrome
        boolean isPalindrome = isPalindrome(inputString);

        // Menampilkan hasil
        if (isPalindrome) {
            System.out.println("String merupakan palindrome.");
        } else {
            System.out.println("String bukan merupakan palindrome.");
        }

        scanner.close();
    }
}

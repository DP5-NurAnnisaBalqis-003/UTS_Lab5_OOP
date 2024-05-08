//Merepresentasikan kelas Pesawat
public class Pesawat {
    private String nama;
    private String nomor;
    private String asal;
    private String tujuan;

//    Konstruktor yang digunakan untuk menginisialisasi kelas Pesawat
    public Pesawat(String nama, String nomor, String asal, String tujuan) {
        this.nama = nama;
        this.nomor = nomor;
        this.asal = asal;
        this.tujuan = tujuan;
    }

//    Method setter digunakan untuk mengatur nilai properti dari objek kelas Pesawat

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

//    Method getter digunakan untuk mengambil nilai properti dari objek kelas Pesawat
    public String getNama() {
        return this.nama;
    }

    public String getNomor() {
        return this.nomor;
    }

    public String getAsal() {
        return this.asal;
    }

    public String getTujuan() {
        return this.tujuan;
    }

//    Override method menggunakan toString untuk menampilkan informasi Pesawat
    @Override
    public String toString() {
        return "Pesawat " + nama + ".";
    }

//    Method Overloading untuk menampilkan informasi nomor penerbangan pesawat
    public void terbang(String nomor) {
        System.out.println("Ini adalah pesawat dengan nomor penerbangan " + nomor + ".");
    }

    //    Method Overloading untuk menampilkan informasi nomor penerbangan pesawat, asal dan tujuannya
    public void terbang_rute(String nomor, String asal, String tujuan) {
        System.out.println("Pesawat dengan nomor penerbangan " + nomor + " baru saja tiba dari " + asal + " dan akan terbang ke tujuan berikutnya yaitu " + tujuan + ".");
    }
}
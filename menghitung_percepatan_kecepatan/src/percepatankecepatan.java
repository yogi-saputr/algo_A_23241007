import java.util.Scanner;

public class percepatankecepatan {
    public static void main(String[] args) throws Exception {
        //membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        //meminta pengguna memasukkan kecepatan awal (v0)
        System.out.print("Masukkan nilai kecepatan awal(ve) dalam m/s: ");
        double kecepatanAwal = scanner.nextDouble();

        //meminta pengguna memasukkan nilai kecepatan akhir
        System.out.print("Masukkan nilai kecepatan akhir (v) dalam m/s: ");
        double kecepatanAkhir = scanner.nextDouble();

        //meminta pengguna memasukkan waktu (t)
        System.out.print("Masukkan nilai waktu (t) dalam detik: ");
        double waktu = scanner.nextDouble();

        //memanggil fungsi untuk mengitung percepatan
        double percepatan = hitungPercepatan(kecepatanAwal, kecepatanAkhir, waktu);
        
        //memanggil fungsi untuk menghitung kecepatan rata-rata
        double kecepatanRataRata = hitungKecepatanRataRata(kecepatanAwal, kecepatanAkhir);

        //menampilkan hasil
        System.out.println("percepatan adalah: " + percepatan + "m/s^2.");
        System.out.println("Kecepatan rata-rata adalah: " + kecepatanRataRata + "m/s.");
    }
    //fungsi untuk menghitung percepatan
    public static double hitungPercepatan(double  kecepatanAwal, double kecepatanAkhir, double waktu) {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }
    //fungsi untuk mengitung kecepatan rata-rata
    public static double hitungKecepatanRataRata(double kecepatanAwal, double kecepatanAkhir) {
        return (kecepatanAwal + kecepatanAkhir) / 2;
    }
}

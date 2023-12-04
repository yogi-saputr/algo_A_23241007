import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // deklarsi variabel dan tipe data
        String nama;
        String prodi;
        int nim;
        Double tinggi_badan;

        // membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("Form Data Mahasiswa UNDIKMA");
        System.out.println("===========================");

        // membuat form + mengisi variabel
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Masukkan Prodi : ");
        prodi = input.nextLine();

        System.out.print("Masukkan NIM : ");
        nim = input.nextInt();

        System.out.print("Masukkan Tinggi Badan : ");
        tinggi_badan = input.nextDouble();

        // menampilkan output ke layar
        System.out.println("Data Mahasiswa UNDIKMA");
        System.out.println("======================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println(" NIM : " + nim);
        System.out.println(" Tinggi Badan : " + tinggi_badan);

        
    }
}

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        // membuat objek scanner untuk membaca sebuah bilangan
        Scanner scanner = new Scanner(System.in);

        // meminta pemgguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan");
        int bilangan = scanner.nextInt();

        //memanggil fungsi untuk mengecek apakah bilangan ganjil atau genap
        cekGanjilGenap(bilangan);
     }

     //fungsi untuk mengecek apakah suatau bilangan ganjil atau genap
     public static void cekGanjilGenap(int Bilangan) {
        if (Bilangan % 2 == 0) {
            System.out.println(Bilangan + "adalah bilangan genap");
        }else{
            System.out.println(Bilangan + "adalah bilangan ganjil");
        }
     }
}

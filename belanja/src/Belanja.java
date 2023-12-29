import java.util.Scanner;

public class Belanja {
    public static void main (String[] args) {
        // data member atau variabel
        int tot_belanja;

        //membuat objek scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja");
        tot_belanja = input.nextInt();

        //membuat percabangan
        if (tot_belanja >= 50000){
            System.out.println("Selamat Dapat Mouse");
        } else {
            System.out.println("Tidak Dapat MOUSE");
        }

    }
}

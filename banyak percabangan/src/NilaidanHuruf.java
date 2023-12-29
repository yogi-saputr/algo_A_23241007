import java.util.Scanner;

public class NilaidanHuruf {
    public static void main(String[] args) {
        //
        int Nilai_Angka;

        //
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Angka : ");
        Nilai_Angka = input.nextInt();

        //
        if (Nilai_Angka >= 80) {
            System.out.println("mendapat nilai : A");
        } else if(Nilai_Angka >=70 && Nilai_Angka <=79){
            System.out.println("mendapat nilai : B");
        }else if (Nilai_Angka >=60 && Nilai_Angka <=69){
            System.out.println("mendapat nilai : C");
        } else if (Nilai_Angka >=50 && Nilai_Angka <=59){
            System.out.println("mendapat nilai : D");
        } else {
            System.out.println("mendapat nilai : E");
        }
    }
}

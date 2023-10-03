import java.util.Scanner;

public class PemilihanPercobaan201 {
    public static void main(String[] args) {

        Scanner input201 = new Scanner(System.in);

        System.out.print("Nilai UAS   : ");
        float UAS = input201.nextFloat();
        System.out.print("Nilai UTS   : ");
        float UTS = input201.nextFloat();
        System.out.print("Nilai Kuis  : ");
        float Kuis = input201.nextInt();
        System.out.print("Nilai Tugas : ");
        float Tugas = input201.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

        if ( total > 80 && total <= 100 ) {
            System.out.println("Nilai = " + total );
            System.out.println("Sehingga nilai huruf adalah A = 4" + "\nMemenuhi kualifikasi Sangat Baik :) ");

         } else if  (total > 73 && total <= 80 ) { 
            System.out.println("Nilai = " + total + " Sehingga nilai huruf adalah B+");
            System.out.println("Sehingga nilai huruf adalah B+ = 3.5" + "\nKualifikasi Lebih Dari Baik ");
        
         } else if (total > 65 && total <= 73 ) {
            System.out.println("Nilai " + total + " Sehingga nilai hurud adalah B");
            System.out.println("Sehingga nilai huruf adalah B = 3" + "\nKualifikasi Baik ");

         } else if (total > 60 && total <= 65) {
            System.out.println("Nilai " + total + " Sehingga nilai huruF adalah C+");
            System.out.println("Sehingga nilai huruf adalah C+ = 2.5" + "\nKualifikasi Lebih Dari Cukup ");

         } else if (total > 50 && total <= 60) {
            System.out.println("Nilai " + total + " Sehingga nilai huruf adalah C");
            System.out.println("Sehingga nilai huruf adalah C = 2" + "\nKualifikasi Cukup ");

         } else if (total > 39 && total <= 50) {
            System.out.println("Nilai " + total + " Sehingga nilai huruf adalah D");
            System.out.println("Sehingga nilai huruf adalah D = 1" + "\nKualifikasi Kurang ");

         } else if (total <= 39) {
            System.out.println("Nilai " + total + " Sehingga nilai huruf adalah E");
            System.out.println("Sehingga nilai huruf adalah E = 0" + "\nKualifikasi Gagal ");
         }
    }
}

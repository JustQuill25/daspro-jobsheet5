import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {

        Scanner input01 = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = input01.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka "+angka+ " Bilangan Genap");
        
        else 
            System.out.println("Angka "+angka+ "Bilangan Ganjil" );

    }
}

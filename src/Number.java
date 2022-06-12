// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac Adet Sayi Giriceksiniz ? : ");
        int count = input.nextInt();
        int number;
        int max = 1, min = 1;

        // İlk olarak kaç adet sayi gireceksek onun için döngü oluşturuyoruz ve tek tek ekrana yazdırıyoruz.

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ".Sayiyi Giriniz : ");
            number = input.nextInt();

            // Girilen sayıları birbirleriyle karşılaştırmak için girilen ilk sayıyı max ve min değerlerine eşitliyoruz. Daha sonra ise girilen sayıları bu sayıya göre kontrol ediyoruz.

            if (i == 1) {
                max = number;
                min = number;
            }

            // Eğer girilen sayı ilk sayıdan büyükse max, küçükse min oluyor ve bu döngü bitene kadar devam ediyor.

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println();
        System.out.print("Girilen Sayilarin En Buyugu : " + max);
        System.out.println();
        System.out.print("Girilen Sayilerin En Kucugu : " + min);
        System.out.println();
    }
}
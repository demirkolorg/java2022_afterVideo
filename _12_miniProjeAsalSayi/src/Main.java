import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("-----ASAL SAYI BULMA-----");
        System.out.println("-------------------------");


        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.print("Bir Sayı Girin: ");
            var deger = reader.next();
            System.out.println(deger);
            boolean sayiAsalMi = true;

            if (deger=="q")
                break;

            int sayi=Integer.parseInt(deger);

            if(sayi==1) {
                System.out.println(sayi +" sayısı asal değildir.");
                continue;
            }

            if(sayi<1) {
                System.out.println(sayi+" sayısı gerçersiz sayıdır.");
                continue;
            }

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayiAsalMi = false;
                    break;
                }
            }

            if (sayiAsalMi) {
                System.out.println(sayi+" sayısı asal sayıdır.");
            }
            else {
                System.out.println(sayi+" sayısı asal değildir.");
            }
        }


    }
}
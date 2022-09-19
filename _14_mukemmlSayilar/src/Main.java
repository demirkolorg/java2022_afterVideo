import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //mükemmel sayılar
        //6 -->1,2,3 -->1+2+3=6
        //28 -->1,2,4,7,14 -->1+2+4+7+14=28

        System.out.println("-------------------------");
        System.out.println("---MÜKEMMEL SAYI BULMA---");
        System.out.println("-------------------------");


        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.print("Bir Sayı Girin: ");
            int tamBolenllerToplami=0;

            var sayi = reader.nextInt();

            if(sayi==1) {
                System.out.println(sayi +" sayısı asal değildir.");
                continue;
            }

            if(sayi<1) {
                System.out.println(sayi+" sayısı gerçersiz sayıdır.");
                continue;
            }

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    tamBolenllerToplami+=i;
                }
            }

            if (tamBolenllerToplami==sayi) {
                System.out.println(sayi+" sayısı mükemmel sayıdır.");
            }
            else {
                System.out.println(sayi+" sayısı mükemmel değildir.");
            }
        }

    }
}
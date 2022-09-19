import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //arkadaş sayılar
        //220 ve 284

        System.out.println("-------------------------");
        System.out.println("---ARKADAŞ SAYI BULMA---");
        System.out.println("-------------------------");


        while (true){
            Scanner reader = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.print("İlk Sayıyı Girin: ");
            int sayi1 = reader.nextInt();

            System.out.print("İkinci Sayıyı Girin: ");
            int sayi2 = reader.nextInt();


            int ilkSayiTotal=0;
            int ikinciSayiTotal=0;





            for (int i = 1; i < sayi1; i++) {
                if (sayi1 % i == 0) {
                    ilkSayiTotal+=i;
                }
            }

            for (int i = 1; i < sayi2; i++) {
                if (sayi2 % i == 0) {
                    ikinciSayiTotal+=i;
                }
            }

            if (sayi1==ikinciSayiTotal && sayi2==ilkSayiTotal) {
                System.out.println(sayi1+" sayısı ve "+sayi2+" sayısı arkadaş sayıdır.");
            }
            else {
                System.out.println(sayi1+" sayısı ve "+sayi2+" sayısı arkadaş sayı değildir.");
            }
        }



    }
}
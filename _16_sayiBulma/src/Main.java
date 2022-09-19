import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------");
        System.out.println("------ SAYI BULMA -------");
        System.out.println("-------------------------");
        int tahmin = 0;
        Random rand = new Random();
        int randomSayi = rand.nextInt(100);


        while (true) {
            tahmin++;



            Scanner reader = new Scanner(System.in);
            System.out.println("-------------------------");
            System.out.println("0 ile 100 arasında rastgele bir sayı tuttum");
            System.out.print("Sayıyı tahmin et : ");

            int sayi = reader.nextInt();


            if (sayi == randomSayi) {
                System.out.println(tahmin + ". tahminde sayıyı buldun, tebrikler.");
                break;
            } else if (sayi < randomSayi) {
                System.out.println("Yukarı çık");
                continue;
            } else if (sayi > randomSayi) {
                System.out.println("Aşağı in");
                continue;
            }
        }
    }
}
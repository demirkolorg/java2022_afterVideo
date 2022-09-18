public class Main {
    public static void main(String[] args) {

        int sayi = 10;
        int digerSayi = 20;

        System.out.println("sayı: " + sayi);
        System.out.println("Diğer sayı: " + digerSayi);
        System.out.println("========");

        if (sayi < digerSayi) {
            System.out.println("Sayı "+digerSayi+" değerine göre  = Küçük");
        } else if (sayi > digerSayi) {
            System.out.println("Sayı "+digerSayi+" değerine göre = Büyük");
        } else {
            System.out.println("Sayı "+digerSayi+" değerine göre = Eşit");
        }
    }
}
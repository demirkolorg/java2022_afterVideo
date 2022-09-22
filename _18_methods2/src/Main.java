public class Main {
    public static void main(String[] args) {
        String mesaj = ekle();
        mesajVer(mesaj);

        int toplam = topla(10, 20, 30);
        System.out.println(toplam);
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }


    public static String ekle() {
        return "Ekelndi";
    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // Variable Arguments
    public static int topla(int... sayilar) {
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ali";
        String ogrenci2 = "Veli";
        String ogrenci3 = "Deli";

        System.out.println("Öğrenci 1 : " + ogrenci1);
        System.out.println("Öğrenci 2 : " + ogrenci2);
        System.out.println("Öğrenci 3 : " + ogrenci3);
        System.out.println();


        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Melih";

        System.out.println("For Başladı");
        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println("Öğrencilerin " + i + ". elemanı : " + ogrenciler[i]);
        System.out.println();

        System.out.println("ForEach Başladı");
        for (String ogrenci : ogrenciler)
            System.out.println(ogrenci);
        System.out.println();

        System.out.println("Toplam Öğrenci Sayısı : " + ogrenciler.length);


    }
}
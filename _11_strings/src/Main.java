public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";


        System.out.println("Mesaj : " + mesaj);
        System.out.println("Mesaj Eleman Sayısı: " + mesaj.length());
        System.out.println("Mesajın 6.Elemanı : " + mesaj.charAt(5));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
        System.out.println("Mesaj B ile mi başlıyor : "+mesaj.startsWith("B"));
        System.out.println("Mesaj b ile mi başlıyor : "+mesaj.startsWith("b"));
        System.out.println("Mesaj A ile mi başlıyor : "+mesaj.startsWith("A"));
        System.out.println("Mesaj ! ile mi bitiyor : "+mesaj.endsWith("!"));
        System.out.println("Mesaj l ile mi bitiyor : "+mesaj.endsWith("l"));
        System.out.println("Mesaj L ile mi bitiyor : "+mesaj.endsWith("L"));

        char[] karakterler=new char[6];
        mesaj.getChars(0,6,karakterler,0);
        System.out.println(karakterler);

        System.out.println("Mesaj içerisinde 'a' nın index numarası : "+mesaj.indexOf('a'));
        System.out.println("Mesaj içerisinde 'va' nın index numarası : "+mesaj.indexOf("va"));

        System.out.println("Mesaj içerisinde 'a' nın sağdan başlayarak index numarası : "+mesaj.lastIndexOf('a'));
        System.out.println("Mesaj içerisinde 'va' nın sağdan başlayarak index numarası : "+mesaj.lastIndexOf("va"));

    }
}
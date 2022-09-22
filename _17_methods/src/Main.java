public class Main {
    public static void main(String[] args) {
        sayiBulmaca(7);
    }

    public static void sayiBulmaca(int aranacak) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        //int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        mesajVer(varMi,aranacak);


    }

    public  static void mesajVer(boolean varMi, int aranacak){
        if (varMi) {
            System.out.println("Sayı Mevcut: " + aranacak);
        } else {
            System.out.println("Sayı Mevcut Değil. : " + aranacak);
        }
    }
}
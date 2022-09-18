public class Main {
    public static void main(String[] args) {

        //for tüm
        for (int i = 1; i < 10; i++) {
            System.out.println("i=" + i);
        }
        System.out.println("TÜM // For Döngü Bitti");
        System.out.println();


        //for tek
        for (int i = 1; i < 10; i += 2) {
            System.out.println("i=" + i);
        }
        System.out.println("TEK // For Döngü Bitti");
        System.out.println();


        //for çift
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i=" + i);
        }
        System.out.println("ÇİFT // For Döngü Bitti");
        System.out.println();

        //while
        int i = 1;
        while (i < 10) {
            i++;
            System.out.println("i=" + i);
        }
        System.out.println("while Döngü Bitti");
        System.out.println();

        //do while
        int k = 1;
        do {
            System.out.println("k=" + k);
            k++;
        } while (k < 10);
        System.out.println("do while Döngü Bitti");
        System.out.println();

    }
}
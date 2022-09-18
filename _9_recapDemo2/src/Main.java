public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 2.5, 3.8, 4.9, 0.7, 8.8, 9.97};
        double total = 0;
        double max = myList[0];
        double min = myList[0];

        for (double number : myList) {
            if (max < number) max = number;

            if (min > number) min = number;

            total += number;
        }
        System.out.println("Total : " + total);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println();
    }
}
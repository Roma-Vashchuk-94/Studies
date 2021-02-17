package Lesson2;

public class Cycle {
    public static void main(String[] args) {
        first_55_Elements();
        System.out.println();
        itemsLessThen_90();
    }

    static void first_55_Elements() {
        int num = 0;
        int i = 1;
        while (num < 55) {
            System.out.print(i + " ");
            i = i + 2;
            num++;
        }
    }

    static void itemsLessThen_90() {
        int i = 90;
        while ( i >= 0) {
            System.out.print(i + " ");
            i = i - 5;
        }
    }
}

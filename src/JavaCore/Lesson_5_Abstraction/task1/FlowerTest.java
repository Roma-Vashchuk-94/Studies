package JavaCore.Lesson_5_Abstraction.task1;

import Basics.Array;

import java.util.Arrays;

public class FlowerTest {
    public static void main(String[] args) {
        Flower[] bouquet = new Flower[25];
        for (int i = 0; i < bouquet.length; i++) {
            if (i < 5) {
                bouquet[i] = new Rose("red", 40);
            } else if (i >= 5 && i <= 15) {
                bouquet[i] = new Tulip("yellow", 20);
            } else if (i > 15) {
                bouquet[i] = new Violet("violet", 15);
            }
        }
        int bouquetPrise = 0;
        for (Flower flower : bouquet) {
            bouquetPrise = bouquetPrise + flower.getPrice();
        }
        System.out.println("bouquet is" + Arrays.toString(bouquet));
        System.out.println("bouquetPrise is " + bouquetPrise);
    }
}

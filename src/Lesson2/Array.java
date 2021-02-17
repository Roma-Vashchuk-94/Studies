package Lesson2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] listOfNumbers = new int[20];
        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = (int) (Math.random() * 100);
        }
        System.out.println("List:" + Arrays.toString(listOfNumbers));
        System.out.println("The Smallest Value: " + theSmallestValue(listOfNumbers));
        System.out.println("The Largest Value: " + theLargestValue(listOfNumbers));
        someMethod(listOfNumbers.length);
    }
    static int theSmallestValue(int[] array) {
        int smallValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1] && array[i] <= smallValue) {
                smallValue = array[i];
            }
        }
        return smallValue;
    }

    static int theLargestValue(int[] array) {
        int largestValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1] && array[i] >= largestValue) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }
    static void someMethod(int a) {
        System.out.println(a);
    }
}

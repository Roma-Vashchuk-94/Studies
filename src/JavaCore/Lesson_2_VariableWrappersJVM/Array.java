package JavaCore.Lesson_2_VariableWrappersJVM;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        arrayPrint(array);
        System.out.println();
        reverseArrayPrint(array);
    }

    static void arrayPrint(int[] array) {
        System.out.println("Array is:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }


    static void reverseArrayPrint(int[] array) {
        System.out.println("Array from the end is:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

}

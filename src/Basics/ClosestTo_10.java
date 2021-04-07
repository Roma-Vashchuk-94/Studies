package Basics;

import java.util.Scanner;

public class ClosestTo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(closestTo_10(scanner.nextDouble(), scanner.nextDouble()));

    }
    static double closestTo_10(double a, double b) {
        return Math.abs(10 - a) <= Math.abs(10 - b) ? a : b;
    }
}

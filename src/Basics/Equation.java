package Basics;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        calc(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    static void calc(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            System.out.println("d <= 0, тому коренів немає");
        }
    }
}

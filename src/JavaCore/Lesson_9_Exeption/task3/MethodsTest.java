package JavaCore.Lesson_9_Exeption.task3;

import java.util.Scanner;

public class MethodsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your numbers:");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            try {
                if (chekNumber(firstNumber, secondNumber)) {
                    System.out.println("You entered: " + firstNumber + " and " + secondNumber);
                    System.out.println("Addition is: " + toAdd(firstNumber, secondNumber));
                    System.out.println("Subtraction is: " + toSubtract(firstNumber, secondNumber));
                    System.out.println("Multiplication is: " + toMultiply(firstNumber, secondNumber));
                    System.out.println("Division is: " + toDivide(firstNumber, secondNumber));
                }
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }

    public static boolean chekNumber(int firstNumber, int secondNumber) throws Exception {
        if (firstNumber < 0 && secondNumber < 0) {
            throw new IllegalArgumentException();
        } else if (firstNumber == 0 && secondNumber != 0 || firstNumber != 0 && secondNumber == 0) {
            throw new ArithmeticException();
        } else if (firstNumber == 0 && secondNumber == 0) {
            throw new IllegalAccessException();
        } else if (firstNumber > 0 && secondNumber > 0) {
            throw new MyException();
        } else {
            return true;
        }
    }

    public static int toAdd(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int toSubtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int toMultiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static int toDivide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}

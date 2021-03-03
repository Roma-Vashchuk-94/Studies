package JavaCore.Lesson_9_Exeption.task2;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) throws IncorrectNumberEntryException {
        Scanner scanner = new Scanner(System.in);
        sumNumbers(chekNumber(scanner.nextLine()), chekNumber(scanner.nextLine()));
    }

    public static void sumNumbers(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    public static int chekNumber(String line) throws IncorrectNumberEntryException {
        int number;
        try {
            number = Integer.parseInt(line);
        } catch (Exception e) {
            throw new IncorrectNumberEntryException("You have entered not an integer");
        }
        return number;
    }
}

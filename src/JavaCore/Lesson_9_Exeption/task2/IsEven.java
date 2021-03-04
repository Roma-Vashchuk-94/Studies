package JavaCore.Lesson_9_Exeption.task2;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) throws IncorrectNumberEntryException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int number;
        try {
            number = Integer.parseInt(line);
        } catch (Exception e) {
            throw new IncorrectNumberEntryException("You have entered not an integer");
        }
        chekNumber(number);
    }

    public static void chekNumber(int a) {
        if (isEven(a)) {
            System.out.println("Number " + a + " is even.");
        } else {
            System.out.println("Number " + a + " is odd.");
        }
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}

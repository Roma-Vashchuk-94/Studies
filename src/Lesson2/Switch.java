package Lesson2;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().toLowerCase();
        switch (day) {
            case "monday" -> System.out.println("I don't care if Monday's blue");
            case "tuesday" -> System.out.println("Tuesday grey");
            case "wednesday" -> System.out.println("and Wednesday too");
            case "thursday" -> System.out.println("Thursday, I don't care about you");
            case "friday" -> System.out.println("It's Friday, I'm in love");
            case "saturday" -> System.out.println("Saturday, wait");
            case "sunday" -> System.out.println("And Sunday always comes too late");
        }

    }
}

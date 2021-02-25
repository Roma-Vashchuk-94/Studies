package JavaCore.Lesson_8_Enum.task2;

import java.util.Scanner;

public class SeasonsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final char dm = (char) 34;
        boolean work = true;

        while (work) {
            System.out.println("If you want to end the program, enter: " + dm + "Exit" + dm + ";");
            System.out.println("Enter the name of the month:");
            String line = scanner.nextLine().toUpperCase();
            if (line.equals("EXIT")) {
                System.out.println("BYE BYE :)");
                work = false;
            } else {
                if (correctMonth(line)) {
                    allDataAboutTheMonth(getMonth(line));
                } else {
                    System.out.println("You entered an incorrect name, try again:");
                }
            }
        }
    }

    public static boolean correctMonth(String line) {
        boolean b = false;
        for (Months month : Months.values()) {
            if (month.name().equals(line)) {
                b = true;
            }
        }
        return b;
    }

    public static Months getMonth(String line) {
        Months monthFromEnum = null;
        for (Months month : Months.values()) {
            if (month.name().equals(line)) {
                monthFromEnum = month;
            }
        }
        return monthFromEnum;
    }



    public static boolean monthName (String line) {
        boolean b = false;
        for (Months month : Months.values()) {
            if (month.name().equals(line)) {
                b = true;
            }
        }
        return b;
    }

    public static void allDataAboutTheMonth(Months month) {
        System.out.println("You chose the month: " + month.name());
        month.sameSeason();
        month.nextSeason();
        month.previousSeason();
        month.sameNumberOfDays();
        month.fewerDays();
        month.moreDays();
        Months.evenDays();
        Months.oddDays();
        month.haveEvenDays();
    }
}

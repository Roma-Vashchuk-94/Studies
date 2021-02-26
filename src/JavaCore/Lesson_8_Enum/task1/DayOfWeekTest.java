package JavaCore.Lesson_8_Enum.task1;

import java.util.Arrays;

public class DayOfWeekTest {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.ordinal() + " " + day.name());

        }
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day.toString() + " ");
        }
    }
}

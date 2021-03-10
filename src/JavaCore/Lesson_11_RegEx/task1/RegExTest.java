package JavaCore.Lesson_11_RegEx.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[a|A]\\w*");
        Matcher matcher;
        String[] array = new String[5];
        int i = 0;
        while (i < array.length) {
            String line = scanner.nextLine();
            matcher = pattern.matcher(line);
            if (matcher.matches()) {
                array[i] = line;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

package JavaCore.Lesson_12_Collection.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(!list.contains("break")) {
            list.add(scanner.nextLine());
        }

        System.out.println("All words: ");
        for (String a : list) {
            System.out.println(a);
        }

        System.out.println("All words, which start with letter 's':");
        for (String a : list) {
            if (a.startsWith("s")) {
                System.out.println(a);
            }
        }

        System.out.println("All words, which start with length more then five:");
        for (String a : list) {
            if (a.length() > 5) {
                System.out.println(a);
            }
        }
    }
}

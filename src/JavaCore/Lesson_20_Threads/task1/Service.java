package JavaCore.Lesson_20_Threads.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    public static List<Integer> createList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your values:\nTo exit, enter 'exit'" );
        List<Integer> list = new ArrayList<>();
        boolean b = true;
        while(b) {
            String line = scanner.nextLine().toLowerCase();
            if (!line.equals("exit")) {
                list.add(Integer.parseInt(line));
            } else {
                b = false;
            }
        }
        return list;
    }
}

package JavaCore.Lesson_14_Set_Queue.task2;

import java.util.*;

public class CatTest {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 12);
        Cat cat2 = new Cat("Leopol'd", 21);
        Cat cat3 = new Cat("Murka", 10);

        Set<Cat> catList = new LinkedHashSet<>(Arrays.asList(cat1, cat2, cat3));
        System.out.println(catList);
        System.out.println(new TreeSet<>(catList));
        System.out.println(new HashSet<>(catList));
    }
}

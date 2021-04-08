package JavaCore.Lesson_22_Lambda.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> allPersons = Arrays.asList(new Person("Bob", 12),
                new Person("Fill", 24), new Person("Jessi", 16),
                new Person("Gerry", 23), new Person("Din", 17));

        List<Person> adultPersons = new ArrayList<>();
        List<Integer> lengthPersonsName = new ArrayList<>();

        System.out.println("All persons: \n" + allPersons);

        allPersons.forEach(element -> {
            if (element.getAge() >= 18) {
                adultPersons.add(element);
            }
        } );

        allPersons.forEach(person -> person.setTimestamp(LocalDate.now()));

        allPersons.forEach(person -> lengthPersonsName.add(person.getName().length()));

        System.out.println("All persons: \n" + allPersons);
        System.out.println("Adult persons: \n" + adultPersons);
        System.out.println("Length persons name: \n" + lengthPersonsName);
    }
}

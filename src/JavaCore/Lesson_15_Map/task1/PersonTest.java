package JavaCore.Lesson_15_Map.task1;

import java.util.HashMap;
import java.util.Map;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Dan", "Brown", 56);
        Person person2 = new Person("Stephen", "King", 73);
        Account accountPerson1 = new Account("Dan56", "qwerty56", "DanBrown56@gmail.com");
        Account accountPerson2 = new Account("Stephen73", "qwerty73", "StephenKing73@gmail.com");

        Map<Person, Account> authors = new HashMap<>();
        authors.put(person1, accountPerson1);
        authors.put(person2, accountPerson2);
        System.out.println(authors);

        //task1:
        authors.put(person1, new Account("Dan", "revers12", "DanBrown@ukr.net"));
        System.out.println(authors);

        //task2:
        authors.put(person2, null);
        System.out.println(authors);

        //task3:
        authors.remove(person1);
        System.out.println(authors);

    }
}

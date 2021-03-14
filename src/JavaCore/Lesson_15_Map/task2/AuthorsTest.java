package JavaCore.Lesson_15_Map.task2;

import JavaCore.Lesson_15_Map.task1.Account;
import JavaCore.Lesson_15_Map.task1.Person;

import java.util.*;

public class AuthorsTest {

    public static void main(String[] args) {
        //task1:
        AuthorsProcessor authorsList = new AuthorsProcessor(createMap());
        authorsList.printAuthors();
        //task2:
        Person person = new Person("George", "Eliot", 56);
        authorsList.addAuthor(person);
        System.out.println();
        authorsList.printAuthors();
        //task3:
        authorsList.addAuthorAccount(person, new Account("Eliot56", "qwerty43", "George@gmail.com"));
        System.out.println();
        authorsList.printAuthors();
        //task4:
        authorsList.removeAuthorAccount(new Person("Dan", "Brown", 56),
                new Account("Dan", "revers12", "DanBrown@ukr.net"));
        System.out.println();
        authorsList.printAuthors();
        //task5:
        authorsList.removeAuthor(new Person("Stephen", "King", 73));
        System.out.println();
        authorsList.printAuthors();
    }

    public static Map<Person, List<Account>> createMap() {
        Map<Person, List<Account>> map = new HashMap<>();
        Person person1 = new Person("Dan", "Brown", 56);
        List<Account> accountsPerson1 = new ArrayList<>(Arrays.asList(new Account("Dan56", "qwerty56", "DanBrown56@gmail.com"),
                new Account("Dan", "revers12", "DanBrown@ukr.net")));
        Person person2 = new Person("Stephen", "King", 73);
        List<Account> accountsPerson2 = new ArrayList<>(Arrays.asList(new Account("Stephen73", "qwerty73", "StephenKing73@gmail.com"),
                new Account("King34", "76qwerty", "King76@ukr.net")));
        map.put(person1,accountsPerson1);
        map.put(person2, accountsPerson2);
        return map;
    }

}

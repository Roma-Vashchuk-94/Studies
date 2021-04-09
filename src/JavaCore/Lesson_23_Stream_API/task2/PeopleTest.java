package JavaCore.Lesson_23_Stream_API.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PeopleTest {

    public static void main(String[] args) {

        List<People> listPeople = returnNewPeopleList();

        System.out.println("Всі особи:\n" + listPeople);

        System.out.println("Військовозобовязані:\n" + listPeople.stream()
                .filter(element -> element.getAge() >= 18 && element.getAge() <=27 && element.getSex().equals(Sex.MALE))
                .collect(Collectors.toList()));

        System.out.println("Середній вік всіх чоловіків:\n" + (int) listPeople.stream()
                .filter(elem -> elem.getSex().equals(Sex.MALE))
                .mapToInt(People::getAge).average().getAsDouble());

        System.out.println("Працездатні особи:\n" +
                listPeople.stream()
                        .filter(elem -> (elem.getSex().equals(Sex.MALE) && elem.getAge() >= 18 && elem.getAge() <= 60) ||
                                (elem.getSex().equals(Sex.FEMALE) && elem.getAge() >= 18 && elem.getAge() <= 55))
                        .collect(Collectors.toList()));

        System.out.println("Відсортовані елементи по імені в зворотньому порядку:\n" + listPeople.stream()
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).collect(Collectors.toList()));

        System.out.println("Відсортовані елементи по віку:\n" + listPeople.stream()
                .sorted(Comparator.comparingInt(People::getAge)).collect(Collectors.toList()));

        System.out.println("Найстаріша людина:\n" + listPeople.stream()
                .sorted(Comparator.comparingInt(People::getAge))
                .skip(listPeople.size()-1)
                .findFirst().get());

        System.out.println("Наймолодша людина:\n" + listPeople.stream()
                .min(Comparator.comparingInt(People::getAge)).get());

        System.out.println("Кількість чоловіків:\n" + listPeople.stream()
                .filter(elem -> elem.getSex().equals(Sex.MALE)).count());

        System.out.println("Кількість жінок:\n" + listPeople.stream()
                .filter(elem -> elem.getSex().equals(Sex.FEMALE)).count());

        System.out.println("Жінки в яких ім’я починається на “A”:\n" + listPeople.stream()
                .filter(elem -> elem.getName().startsWith("A"))
                .collect(Collectors.toList()));
    }

    public static List<People> returnNewPeopleList() {
        People people1 = new People("Sam", 27, Sex.MALE);
        People people2 = new People("Din", 17, Sex.MALE);
        People people3 = new People("Jenifer", 25, Sex.FEMALE);
        People people4 = new People("Robert", 60, Sex.MALE);
        People people5 = new People("Linda", 63, Sex.FEMALE);
        People people6 = new People("Anna", 40, Sex.FEMALE);
        return new ArrayList<>(Arrays.asList(people1, people2, people3, people4, people5, people6));
    }
}

package JavaCore.Lesson_23_Stream_API.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) throws Exception{

        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");
        System.out.println("All elements:\n" + list);

        System.out.println("Return count of element «One»:");
        System.out.println(list.stream().filter(element -> element.equals("One")).count());

        System.out.println("Return first element or zero, if collection is empty:");
        System.out.println(list.stream().findFirst().orElse("0"));

        System.out.println("Return last element or 'empty', if collection is empty:");
        System.out.println(list.stream().skip(list.size()-1).findFirst().orElse("empty"));

        System.out.println("Return element equals 'Three', or throw new Exception:");
        System.out.println(list.stream()
                .filter(element -> element.equals("Three"))
                .findFirst()
                .orElseThrow(() -> new Exception("No such element")));

        System.out.println("Return third element in order:");
        System.out.println(list.stream().skip(2).findFirst().get());

        System.out.println("Return two elements starting with the second:");
        list.stream().skip(1).limit(2).forEach(System.out::println);

        System.out.println("Return all elements with length more than 3 symbols:");
        list.stream().filter(element -> element.length() > 3).forEach(System.out::println);

        System.out.println("Return unique elements:");
        list.stream().distinct().forEach(System.out::println);

        System.out.println("If list have element equals 'One':");
        System.out.println(list.stream().anyMatch(elem -> elem.equals("One")));

        System.out.println("If all elements have symbol 'o':");
        System.out.println(list.stream().allMatch(elem -> elem.contains("o") || elem.contains("O")));

        System.out.println("Add for all elements '_1':");
        list.stream().map(elem -> elem + "_1").forEach(System.out::println);

        System.out.println("Sort collection:");
        List<String> newList = list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newList);
    }
}

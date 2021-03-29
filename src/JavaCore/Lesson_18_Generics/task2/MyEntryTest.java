package JavaCore.Lesson_18_Generics.task2;

import java.util.HashMap;
import java.util.Map;

public class MyEntryTest {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        MyEntry.addToMap(map, new MyEntry<>(12345, "hello"));
        MyEntry.addToMap(map, new MyEntry<>(54321, "good bye"));
        MyEntry.addToMap(map, new MyEntry<>(3456, "good afternoon"));
        MyEntry.printAllMap(map);
        System.out.println();
        MyEntry.removeFromMapByKey(map,new MyEntry<>(12345, "hello"));
        MyEntry.removeFromMapByValue(map, new MyEntry<>(54321, "good bye"));
        MyEntry.printAllMap(map);

    }
}

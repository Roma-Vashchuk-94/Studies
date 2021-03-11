package JavaCore.Lesson_13_Iterator_Comparator.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 21; i++) {
            list.add(i);
        }

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            list.set(listIterator.nextIndex(), listIterator.next() * 5 + 1);
        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

    }
}

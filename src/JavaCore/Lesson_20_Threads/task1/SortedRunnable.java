package JavaCore.Lesson_20_Threads.task1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortedRunnable<T extends Comparable> implements Runnable {
    private List<T> list;

    public SortedRunnable(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public void run() {
        Collections.sort(list);
        System.out.println("\nSortedRunnable:");
        try{
            for (T element : list) {
                System.out.print(element + " ");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

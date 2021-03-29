package JavaCore.Lesson_20_Threads.task1;

import java.util.List;

public class DirectTread<T> extends Thread {
    private List<T> list;

    public DirectTread(List<T> list) {
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
        try{
            System.out.println("\nDirectThread:");
            for (T element : list) {
                System.out.print(element + " ");
                sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

package JavaCore.Lesson_20_Threads.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {
    private int count;

    public MyThread(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1));
        System.out.println("MyThread run...");
        for (int i = 0; i < count; i++){
            list.add(list.get(list.size()-2) + list.get(list.size()-1));
            System.out.print(list.get(i) + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nMyThread finish.");
    }
}

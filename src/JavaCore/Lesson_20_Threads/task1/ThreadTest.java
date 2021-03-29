package JavaCore.Lesson_20_Threads.task1;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread1 = new DirectTread<>(Service.createList());
        Thread thread2 = new Thread(new SortedRunnable<>(Service.createList()));

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}

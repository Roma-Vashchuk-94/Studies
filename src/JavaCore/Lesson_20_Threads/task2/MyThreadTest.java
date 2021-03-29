package JavaCore.Lesson_20_Threads.task2;

import java.util.Scanner;

public class MyThreadTest {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter value:");
        Thread thread = new MyThread(scanner.nextInt());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Enter value:");
        Thread thread1 = new Thread(new RunnableThread(scanner.nextInt()));
        thread1.start();

    }
}

package JavaCore.Lesson_6_Interface_Polymorphism.task2;

public class MyCalculator implements Numerable {

    @Override
    public double devide(double a, double b) {
        return a / b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b ;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int plus(int a, int b) {
        return a + b;
    }
}

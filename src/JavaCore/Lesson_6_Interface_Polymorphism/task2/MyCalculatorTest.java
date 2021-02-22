package JavaCore.Lesson_6_Interface_Polymorphism.task2;

public class MyCalculatorTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.devide(36, 4.0));
        System.out.println(myCalculator.minus(67, 32));
        System.out.println(myCalculator.multiply(54, 183));
        System.out.println(myCalculator.plus(987, 342));
    }
}

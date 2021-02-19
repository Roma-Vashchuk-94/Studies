package JavaCore.Lesson_3_OOP;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        Rectangle secondRectangle = new Rectangle(10, 10);
        System.out.println("First rectangle:");
        firstRectangle.perimeter();
        firstRectangle.square();
        System.out.println("Second rectangle:");
        secondRectangle.perimeter();
        secondRectangle.square();
    }
}

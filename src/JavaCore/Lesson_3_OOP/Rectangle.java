package JavaCore.Lesson_3_OOP;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
        this.length = 8;
        this.width = 8;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void perimeter() {
        System.out.println("Perimeter is:" + 2 * (length + width));
    }

    public void square() {
        System.out.println("Square is:" + length * width);
    }
}

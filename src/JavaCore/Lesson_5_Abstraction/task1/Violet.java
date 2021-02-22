package JavaCore.Lesson_5_Abstraction.task1;

public class Violet extends Flower {
    public Violet(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return this.getColor() + " Violet";
    }
}

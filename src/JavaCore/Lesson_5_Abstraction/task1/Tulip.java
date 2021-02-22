package JavaCore.Lesson_5_Abstraction.task1;

public class Tulip extends Flower {
    public Tulip(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return this.getColor() + " Tulip";
    }
}

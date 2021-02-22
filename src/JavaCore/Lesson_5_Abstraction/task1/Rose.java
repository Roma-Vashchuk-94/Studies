package JavaCore.Lesson_5_Abstraction.task1;

public class Rose extends Flower {
    public Rose(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return this.getColor() + " Rose";
    }
}

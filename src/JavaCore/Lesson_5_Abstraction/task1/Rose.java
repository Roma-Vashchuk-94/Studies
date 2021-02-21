package JavaCore.Lesson_5_Abstraction.task1;

public class Rose extends Flower {
    public Rose(String color, int price) {
        super(color, price);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return getColor() + " Rose";
    }
}

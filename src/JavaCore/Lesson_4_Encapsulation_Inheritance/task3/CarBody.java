package JavaCore.Lesson_4_Encapsulation_Inheritance.task3;

public class CarBody {
    private String color;

    public CarBody(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car color is " + color + ".";
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}

package JavaCore.Lesson_3_OOP;

import java.text.DecimalFormat;

public class CircleClass {
    private double radius;
    DecimalFormat df = new DecimalFormat("#.##");

    public void square() {
        System.out.println(df.format(3.14 * Math.pow(radius, 2)));
    }

    public void length() {
        System.out.println(df.format(3.14 * (radius * 2)));
    }

    public CircleClass(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}

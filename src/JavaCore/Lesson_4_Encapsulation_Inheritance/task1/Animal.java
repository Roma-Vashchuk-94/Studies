package JavaCore.Lesson_4_Encapsulation_Inheritance.task1;

public class Animal {
    private int speed;
    private String name;

    public Animal(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(String name) {
        System.out.println(name + " run");
    }

    public void run(String name, int speed) {
        if (speed < 40) {
            System.out.println(name + " run slowly");
        } else {
            System.out.println(name + " run fast");
        }

    }
}

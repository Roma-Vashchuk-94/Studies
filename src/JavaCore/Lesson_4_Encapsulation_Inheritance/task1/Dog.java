package JavaCore.Lesson_4_Encapsulation_Inheritance.task1;

public class Dog extends Animal {

    public Dog(int speed, String name) {
        super(speed, name);
    }

    @Override
    public void run(String name) {
        System.out.println("Dog " + name + " run");
    }

    @Override
    public void run(String name, int speed) {
        if (speed < 40) {
            System.out.println("Dog " + name + " run slowly");
        } else {
            System.out.println("Dog " + name + " run fast");
        }
    }
}

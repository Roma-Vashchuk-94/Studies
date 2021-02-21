package JavaCore.Lesson_4_Encapsulation_Inheritance.task1;

public class Cat extends Animal {

    public Cat(int speed, String name) {
        super(speed, name);
    }

    @Override
    public void run(String name) {
        System.out.println("Cat " + name + " run");
    }

    @Override
    public void run(String name, int speed) {
        if (speed < 40) {
            System.out.println("Cat " + name + " run slowly");
        } else {
            System.out.println("Cat " + name + " run fast");
        }
    }
}
